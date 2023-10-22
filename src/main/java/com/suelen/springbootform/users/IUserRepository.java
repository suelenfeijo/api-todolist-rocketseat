package com.suelen.springbootform.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//Qual o tipo , e qual o tipo de id de UserModel
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
	  UserModel findByUsername(String username);
	}