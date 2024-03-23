package com.services;

import com.entity.RoleEntity;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    public RoleEntity addRole(RoleEntity roleEntity);
}
