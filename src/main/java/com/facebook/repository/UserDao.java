package com.facebook.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.facebook.entity.UserEntity;

@Repository
public class UserDao {

	@Autowired
	SessionFactory factory;

	public Integer saveUserProfile(UserEntity userEntity) {
		org.hibernate.Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Integer reponse = (Integer) session.save(userEntity);
		txn.commit();
		return reponse;
	}
	
	public List<UserEntity> getAllUserProfiles() {
		
		Session session = factory.openSession(); //Opens connection with database using Hibernate
		
		//"from UserEntity" --> means select all rows from UserEntity table                                       
		List<UserEntity> userList = session.createQuery("from UserEntity", UserEntity.class).getResultList();
		
		return userList;		
	}
}
