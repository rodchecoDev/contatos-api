package com.example.contatosapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contatosapi.domain.Company;
import com.example.contatosapi.repositories.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> findaAll() {
		return companyRepository.findAll();
	}
	
	public Company findaById(Long id) {
		Optional<Company> company = companyRepository.findById(id);
		return company.get();
	}
	
	public Company save(Company company) {
		return companyRepository.save(company);
	}
	
	public void delete(Long id) {
		companyRepository.deleteById(id);
	}

}
