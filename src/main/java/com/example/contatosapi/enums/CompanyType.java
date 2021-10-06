package com.example.contatosapi.enums;

public enum CompanyType {

	CLIENTE("Cliente", 0), FORNECEDOR("Fornecedor", 1);

	private String value;
	private final int code;

	private CompanyType(String value, int code) {
		this.value = value;
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public int getCode() {
		return code;
	}

	public static CompanyType getEnumByString(String value) {
		for (CompanyType companyType : CompanyType.values()) {
			if (companyType.value.equals(value))
				return companyType;
		}
		return null;
	}

	public static CompanyType getEnumByCode(int code) {
		for (CompanyType companyType : CompanyType.values()) {
			if (companyType.code == code)
				return companyType;
		}
		return null;
	}

}
