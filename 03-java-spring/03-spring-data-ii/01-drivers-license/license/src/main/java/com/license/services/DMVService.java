package com.license.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.license.models.License;
import com.license.models.Person;
import com.license.repositories.LicenseRepository;
import com.license.repositories.PersonRepository;

@Service
public class DMVService {
	@Autowired
	private PersonRepository pRepo;
	@Autowired
	private LicenseRepository lRepo;
	
	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}
	
	public Person getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Person> getAllPeople() {
		return this.pRepo.findAll();
	}
	
	public List<Person> getUnlicensedPeople() {
		return this.pRepo.findByLicenseIdIsNull();
	}
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(license);
	}
	
	public int generateLicenseNumber() {
		License l = this.lRepo.findTopByOrderByNumberDesc();
		if(l == null) {
			return 1;
		}
		int previousLicenseNumber = l.getNumber();
		previousLicenseNumber++;
		return (previousLicenseNumber);
	}
}
