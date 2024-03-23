package com.controller;

import com.entity.RoleEntity;
import com.services.RoleService;
import com.util.CustomeRespoonse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("")
    public ResponseEntity<?> addRole(@RequestBody() RoleEntity roleEntity){

        CustomeRespoonse customeRespoonse = new CustomeRespoonse();
        RoleEntity role = roleService.addRole(roleEntity);
        if(role!=null){
            customeRespoonse.setStatus(HttpStatus.CREATED);
            customeRespoonse.setData(role);
            customeRespoonse.setMessage("Role Created Successfully..");
            return new ResponseEntity<CustomeRespoonse>(customeRespoonse,HttpStatus.CREATED);
        }
        else{

            customeRespoonse.setStatus(HttpStatus.EXPECTATION_FAILED);
            customeRespoonse.setData(null);
            customeRespoonse.setMessage("Error while creating Role");
            return new ResponseEntity<CustomeRespoonse>(customeRespoonse,HttpStatus.EXPECTATION_FAILED);
        }

    }


}
