package com.test.myapp5.service;

import java.util.List;
import java.util.Optional;

import com.test.myapp5.dto.UserDto;
import com.test.myapp5.entity.User;
import com.test.myapp5.exception.UserNotFoundException;

public interface UserService {
    User save(UserDto user);
    List<User> allUser();
    Optional<User> getUserById(int id) throws UserNotFoundException;
}
