package com.malex.service;

import com.malex.model.RoleEntity;

import java.util.List;

public interface RoleService {
    RoleEntity save(RoleEntity entity);

    RoleEntity update(RoleEntity entity);

    void delete(Long id);

    RoleEntity findById(Long id);

    List<RoleEntity> findAll();
}
