package com.ufc.br.QxdCarRent.entity;

public class Admin {
	private final String loginAdmin;
	private final String passwordAdmin;
	
	public Admin() {
		loginAdmin = "admin";
		passwordAdmin ="admin";
	}
	
	public String getLoginAdmin() {
		return loginAdmin;
	}
	
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
}
