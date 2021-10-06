package com.example.contatosapi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contatosapi.domain.Company;
import com.example.contatosapi.model.AddEditCompanyDto;
import com.example.contatosapi.service.CompanyService;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping
	public ResponseEntity<List<Company>> findAll() {

		List<Company> companies = companyService.findaAll();
		return ResponseEntity.ok().body(companies);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Company> findById(@PathVariable Long id) {

		Company company = companyService.findaById(id);
		return ResponseEntity.ok().body(company);
	}

	@PostMapping
	public ResponseEntity<Company> insert(@RequestBody AddEditCompanyDto model) {

		Company company = new Company();

		company.setType(model.getType());
		company.setName(model.getName());
		company.setPhone(model.getPhone());
		company.setAddressLogradouro(model.getAddressLogradouro());
		company.setAddressNumero(model.getAddressNumero());
		company.setAddressComplemento(model.getAddressComplemento());
		company.setAddressBairro(model.getAddressBairro());
		company.setAddressCidade(model.getAddressCidade());
		company.setAddressUf(model.getAddressUf());
		company.setAddressCep(model.getAddressCep());
		company.setCreatedAt(new Date());

		company = companyService.save(company);

		return ResponseEntity.ok().body(company);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Company> update(@PathVariable Long id, @RequestBody AddEditCompanyDto model) {

		Company company = companyService.findaById(id);

		company.setType(model.getType());
		company.setName(model.getName());
		company.setPhone(model.getPhone());
		company.setAddressLogradouro(model.getAddressLogradouro());
		company.setAddressNumero(model.getAddressNumero());
		company.setAddressComplemento(model.getAddressComplemento());
		company.setAddressBairro(model.getAddressBairro());
		company.setAddressCidade(model.getAddressCidade());
		company.setAddressUf(model.getAddressUf());
		company.setAddressCep(model.getAddressCep());
		company.setCreatedAt(new Date());

		company = companyService.save(company);

		return ResponseEntity.ok().body(company);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		companyService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
