package com.suelen.springbootform.users;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suelen.springbootform.task.TaskModel;
//Qual o tipo , e qual o tipo de id de UserModel
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
	  UserModel findByUsername(String username);
	}