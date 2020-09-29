package com.ufc.br.QxdCarRent.control;

import com.ufc.br.QxdCarRent.entity.Admin;

public class AdminController {
	private Admin admin;
	
	public AdminController() {
		admin = new Admin();
	}
	
	public boolean validateAuth(String login, String password) {
		return admin.getLoginAdmin().equals(login) &&
				admin.getPasswordAdmin().equals(password);
	}
}
