package com.malex.service;

import com.malex.model.RolesEntity;

import java.util.List;

public interface RolesService {
    RolesEntity save(RolesEntity entity);

    RolesEntity update(RolesEntity entity);

    void delete(Long id);

    RolesEntity findById(Long id);

    List<RolesEntity> findAll();
}
