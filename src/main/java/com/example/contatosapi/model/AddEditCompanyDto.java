package com.example.contatosapi.model;

import java.util.Date;

public class AddEditCompanyDto {

	private String type;
	private String name;
	private String phone;
	private String addressLogradouro;
	private String addressNumero;
	private String addressComplemento;
	private String addressBairro;
	private String addressCidade;
	private String addressUf;
	private String addressCep;
	private Date createdAt;

	public String getType() {
		return type;
	}

	public void setType(String type) {
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
