package com.EcoOrder.Ecohub.service;

import com.EcoOrder.Ecohub.entity.Login;

public interface LoginService {
	public Login loginCustomer(String username, String password);
}