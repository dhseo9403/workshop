package com.test.myapp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp5.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
