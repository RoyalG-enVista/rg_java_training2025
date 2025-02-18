package com.employeeapp.service;

import com.employeeapp.entities.UserEntity;

public interface UserService {
    public UserEntity findByUsername(String username);
    public void addUserEntity(UserEntity userEntity);
}