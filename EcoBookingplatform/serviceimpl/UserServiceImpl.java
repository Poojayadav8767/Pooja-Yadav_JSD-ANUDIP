package com.ecobookingplatform.ebp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobookingplatform.ebp.entity.User;
import com.ecobookingplatform.ebp.exception.UserIdNotFoundException;
import com.ecobookingplatform.ebp.repository.UserRepository;
import com.ecobookingplatform.ebp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	//register user and store data into table
	@Override
	public User registerUser(User user) {
		return userRepo.save(user);
	}
	
	// update user 
	@Override
	public User editUser(User user, int uId) {
		User userDetailsUpdated = userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		userDetailsUpdated.setUPhone(user.getUPhone());
		userDetailsUpdated.setUaddr(user.getUaddr());
		userRepo.save(userDetailsUpdated);
		return userDetailsUpdated;
		
	}
	
	//remove user
	@Override
	public void removeUser(int uId) {
		userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		userRepo.deleteById(uId);
		
	}

	// fetch data from databse on the basis of Id
	@Override
	public User displayUserDetails(int uId) {
		return userRepo.findById(uId).orElseThrow(()-> new UserIdNotFoundException("Please Enter Valid ID"));
		
	}

	
		
}
