package com.controller;

import com.entity.UserEntity;
import com.services.UserServices;
import com.util.CustomeRespoonse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;
    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody()UserEntity userEntity){
    CustomeRespoonse customeRespoonse = new CustomeRespoonse();
        UserEntity user= userServices.addUser(userEntity);
        customeRespoonse.setMessage("User Saved SuccessFully");
        customeRespoonse.setData(user);
        customeRespoonse.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<CustomeRespoonse>(customeRespoonse,HttpStatus.CREATED);

    }

}
