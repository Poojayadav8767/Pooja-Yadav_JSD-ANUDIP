package com.EcoOrder.Ecohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EcoOrder.Ecohub.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Integer >{
	
	public Login findByUserNameAndPassword(String username,String password);
			
		
}
