package com.EcoOrder.Ecohub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.Login;
import com.EcoOrder.Ecohub.exception.CustomerIdNotFoundException;
import com.EcoOrder.Ecohub.repository.LoginRepository;
import com.EcoOrder.Ecohub.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository lrepo;	
	
	@Override
	public Login loginCustomer(String username, String password) {
		
		
			Login login = lrepo.findByUserNameAndPassword(username, password);
			return login;
		}
	
	public Login getLoginUser(int id) {
		return lrepo.findById(id).orElseThrow(() -> new CustomerIdNotFoundException("User not found with id: " +id));
	}
	}