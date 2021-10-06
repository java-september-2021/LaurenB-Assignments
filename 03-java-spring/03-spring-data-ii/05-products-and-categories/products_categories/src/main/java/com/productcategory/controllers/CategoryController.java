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
public class CategoryController {
	@Autowired
	private AppServices aService;
	
	@GetMapping("/categories/new")
	public String newCategory() {
		return "newcategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String makeCategory(@RequestParam("category")String category) {
		Category newCategory = new Category ();
		newCategory.setName(category);
		this.aService.createCategory(newCategory);
		return "redirect:/categories/new";
	}
	
	@PostMapping("/addCategoryToProduct/{id}")
	public String addCategorytoProduct(@RequestParam("category")Long id, @PathVariable("id")Long productId) {
		Product productToAddCategoryTo = this.aService.getSingleProduct(productId);
		Category categoryToAdd = this.aService.getSingleCategory(id);
		this.aService.addCategorytoProduct(productToAddCategoryTo, categoryToAdd);
		return "redirect:/{id}";
	}
	
	@GetMapping("/cat/{id}")
	public String showCategory(Model viewModel, @PathVariable("id")Long id) {
		Category categoryToShow = this.aService.getSingleCategory(id);
		viewModel.addAttribute("notInCategory", this.aService.findProductNotCategory(categoryToShow));
		viewModel.addAttribute("category", categoryToShow);
		return "categories.jsp";
	}
	
}
