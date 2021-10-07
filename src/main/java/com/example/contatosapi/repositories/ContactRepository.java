package com.example.contatosapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contatosapi.domain.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
