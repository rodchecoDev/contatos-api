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

import com.example.contatosapi.domain.Contact;
import com.example.contatosapi.model.AddEditContactDto;
import com.example.contatosapi.service.CompanyService;
import com.example.contatosapi.service.ContactService;

@RestController
@RequestMapping(value = "/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@Autowired
	private CompanyService companyService;

	@GetMapping
	public ResponseEntity<List<Contact>> findAll() {

		List<Contact> companies = contactService.findaAll();
		return ResponseEntity.ok().body(companies);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Contact> findById(@PathVariable Long id) {

		Contact contact = contactService.findaById(id);
		return ResponseEntity.ok().body(contact);
	}

	@PostMapping
	public ResponseEntity<Contact> insert(@RequestBody AddEditContactDto model) {

		Contact contact = new Contact();

		contact.setFullName(model.getFullName());
		contact.setEmail(model.getEmail());
		contact.setPhone(model.getPhone());
		contact.setCompany(companyService.findaById(model.getCompany()));
		contact.setCreatedAt(new Date());

		contact = contactService.save(contact);

		return ResponseEntity.ok().body(contact);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Contact> update(@PathVariable Long id, @RequestBody AddEditContactDto model) {

		Contact contact = contactService.findaById(id);

		contact.setFullName(model.getFullName());
		contact.setEmail(model.getEmail());
		contact.setPhone(model.getPhone());
		contact.setCompany(companyService.findaById(model.getCompany()));
		contact.setCreatedAt(new Date());

		contact = contactService.save(contact);

		return ResponseEntity.ok().body(contact);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		contactService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
