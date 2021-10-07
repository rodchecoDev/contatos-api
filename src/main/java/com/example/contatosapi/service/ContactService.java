package com.example.contatosapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contatosapi.domain.Contact;
import com.example.contatosapi.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public List<Contact> findaAll() {
		return contactRepository.findAll();
	}

	public Contact findaById(Long id) {
		Optional<Contact> contact = contactRepository.findById(id);
		return contact.get();
	}

	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}

	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

}
