package com.example.dms.service;

import com.example.dms.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List <UserEntity> findAllUser();
    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);
}
