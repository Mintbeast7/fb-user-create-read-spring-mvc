package com.facebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.entity.UserEntity;
import com.facebook.pojo.UserPojo;
import com.facebook.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	
	public int passProfile(UserPojo userPojo) {
		
		UserEntity userEntity = new UserEntity();	
		userEntity.setFirstname(userPojo.getFirstname());
		userEntity.setLastname(userPojo.getLastname());
		userEntity.setEmail(userPojo.getEmail());
		userEntity.setMobile(userPojo.getMobile());
		userEntity.setPassword(userPojo.getPassword());
		userEntity.setLocation(userPojo.getLocation());		
		return userDao.saveUserProfile(userEntity);
		
	}
	
	public List<UserEntity> allUserProfiles(){
		return userDao.getAllUserProfiles();
	}

	
}
