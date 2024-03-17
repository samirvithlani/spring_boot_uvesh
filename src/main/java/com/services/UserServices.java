package com.services;

import com.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    public UserEntity addUser(UserEntity userEntity);
}
