package com.language.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.language.models.Language;
import com.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	// Find all languages
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	//find one language
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	// Create language
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	// Update language
	public Language updateLanguage(Language updateLanguage) {
		return this.lRepo.save(updateLanguage);
	}
	// delete language 
	public String delete(Long id) {
		this.lRepo.deleteById(id);
		return "language has been deleted";
	}
	
}
