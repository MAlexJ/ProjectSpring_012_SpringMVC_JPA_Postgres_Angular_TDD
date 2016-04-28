package com.malex.service.impl;

import com.malex.model.RoleEntity;
import com.malex.repository.RoleRepository;
import com.malex.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public RoleEntity save(RoleEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public RoleEntity update(RoleEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public RoleEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<RoleEntity> findAll() {
        return repository.findAll();
    }
}
