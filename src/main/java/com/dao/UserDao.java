package com.dao;

import com.entity.UserEntity;
import com.repository.UserRepository;
import com.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements UserServices {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserEntity addUser(UserEntity userEntity) {
        UserEntity user = userRepository.save(userEntity);
        System.out.println("users"+user.getId());
        return  user;
    }
}
