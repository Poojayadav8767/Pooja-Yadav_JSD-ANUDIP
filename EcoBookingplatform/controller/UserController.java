package com.ecobookingplatform.ebp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecobookingplatform.ebp.entity.User;
import com.ecobookingplatform.ebp.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired 
	UserService us;
	
	
	//resister new user
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser( @Valid @RequestBody User user){
		return new ResponseEntity<User>(us.registerUser(user),HttpStatus.CREATED);
	}
	
	//fetch user data from table
	@GetMapping("/fetchUser/{uId}")
	public ResponseEntity<User> fetchUserData(@PathVariable("uId") int uId) {
		return  new ResponseEntity<User>(us.displayUserDetails(uId),HttpStatus.OK);
	}
	
	//delete user
	@DeleteMapping("/deleteUser/{uId}")
	public ResponseEntity<String> deleteCutomer(@PathVariable("uId") int uId){
		us.removeUser(uId);
		return new ResponseEntity<String>("Delete User Record",HttpStatus.OK);
	}
	
	//updating user
	@PutMapping("/editUser/{uId}")
	public ResponseEntity<User> editUser(@Valid @PathVariable("uId") int uId, @RequestBody User user){
			return new ResponseEntity<User>(us.editUser(user, uId), HttpStatus.OK);
		}
}
