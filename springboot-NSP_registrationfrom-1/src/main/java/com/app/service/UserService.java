package com.app.service; /* to store data in database*/

import java.util.List;

import com.app.entity.User;

public interface UserService {

	public void registerUser(User user);
	List<User> getAllUsers();
		
}
