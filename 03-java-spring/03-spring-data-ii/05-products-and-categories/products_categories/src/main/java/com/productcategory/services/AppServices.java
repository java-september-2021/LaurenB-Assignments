package com.productcategory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcategory.models.Category;
import com.productcategory.models.Product;
import com.productcategory.repositories.CategoryRepository;
import com.productcategory.repositories.ProductRepository;

@Service
public class AppServices {
	@Autowired
	private CategoryRepository cRepo;
	
	@Autowired
	private ProductRepository pRepo;
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCategoryNotProduct(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public List<Product> findProductNotCategory(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategorytoProduct(Product product, Category category) {
		List<Category> existingCategory =product.getCategories();
		existingCategory.add(category);
		this.pRepo.save(product);
	}
	
	public void addProductToCategory(Product product, Category category) {
		List<Product> existingProduct = category.getProducts();
		existingProduct.add(product);
		this.cRepo.save(category);
	}
}
