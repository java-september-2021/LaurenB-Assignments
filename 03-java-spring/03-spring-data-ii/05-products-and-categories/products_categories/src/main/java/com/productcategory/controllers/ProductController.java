package com.productcategory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.productcategory.models.Category;
import com.productcategory.models.Product;
import com.productcategory.services.AppServices;

@Controller
public class ProductController {
	@Autowired
	private AppServices aService;
	
	@GetMapping("/products/new")
	public String newProduct() {
		return "newproduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String makeProduct(@RequestParam("name")String name, @RequestParam("desc")String desc, @RequestParam("price")Double price) {
		Product newProduct = new Product ();
		newProduct.setName(name);
		newProduct.setDescription(desc);
		newProduct.setPrice(price);
		this.aService.createProduct(newProduct);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProduct(Model viewModel, @PathVariable("id")Long id) {
		Product productToShow = this.aService.getSingleProduct(id);
		viewModel.addAttribute("notInProduct", this.aService.findCategoryNotProduct(productToShow));
		viewModel.addAttribute("product", productToShow);
		return "products.jsp";
	}
	
	@PostMapping("/addProductToCategory/{id}")
	public String addProductToCategory(@RequestParam("product")Long id, @PathVariable("id")Long categoryId) {
		Product productToAddCategoryTo = this.aService.getSingleProduct(id);
		Category categoryToAdd = this.aService.getSingleCategory(categoryId);
		this.aService.addProductToCategory(productToAddCategoryTo, categoryToAdd);
		return "redirect:/category/{id}";
	}
}

