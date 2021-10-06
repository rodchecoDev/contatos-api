package com.example.contatosapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.contatosapi.enums.CompanyType;

@Entity
public class Company {

	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "type", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private CompanyType type;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "address_logradouro")
	private String addressLogradouro;

	@Column(name = "address_numero")
	private String addressNumero;

	@Column(name = "address_complemento")
	private String addressComplemento;

	@Column(name = "address_bairro")
	private String addressBairro;

	@Column(name = "address_cidade")
	private String addressCidade;

	@Column(name = "address_uf")
	private String addressUf;

	@Column(name = "address_cep")
	private String addressCep;

	@Column(name = "created_at", nullable = false)
	private Date createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type.getValue();
	}

	public void setType(CompanyType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLogradouro() {
		return addressLogradouro;
	}

	public void setAddressLogradouro(String addressLogradouro) {
		this.addressLogradouro = addressLogradouro;
	}

	public String getAddressNumero() {
		return addressNumero;
	}

	public void setAddressNumero(String addressNumero) {
		this.addressNumero = addressNumero;
	}

	public String getAddressComplemento() {
		return addressComplemento;
	}

	public void setAddressComplemento(String addressComplemento) {
		this.addressComplemento = addressComplemento;
	}

	public String getAddressBairro() {
		return addressBairro;
	}

	public void setAddressBairro(String addressBairro) {
		this.addressBairro = addressBairro;
	}

	public String getAddressCidade() {
		return addressCidade;
	}

	public void setAddressCidade(String addressCidade) {
		this.addressCidade = addressCidade;
	}

	public String getAddressUf() {
		return addressUf;
	}

	public void setAddressUf(String addressUf) {
		this.addressUf = addressUf;
	}

	public String getAddressCep() {
		return addressCep;
	}

	public void setAddressCep(String addressCep) {
		this.addressCep = addressCep;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
