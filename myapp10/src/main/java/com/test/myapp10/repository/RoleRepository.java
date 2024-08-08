package com.test.myapp10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp10.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
