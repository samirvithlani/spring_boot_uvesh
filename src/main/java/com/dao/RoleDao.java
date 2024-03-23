package com.dao;

import com.entity.RoleEntity;
import com.repository.RoleRepository;
import com.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDao implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public RoleEntity addRole(RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }
}
