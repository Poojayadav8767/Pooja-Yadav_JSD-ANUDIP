package com.ecobookingplatform.ebp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecobookingplatform.ebp.entity.User;

//Repository to get predefined method of JpaRepository for User Entity
	public interface UserRepository  extends JpaRepository<User, Integer>{
		
		//custom query
	}



