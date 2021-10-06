package com.example.contatosapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contatosapi.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
