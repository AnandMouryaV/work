package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.easynotes.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
