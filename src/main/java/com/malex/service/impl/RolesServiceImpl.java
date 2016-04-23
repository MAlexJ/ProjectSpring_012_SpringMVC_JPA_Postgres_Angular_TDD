package com.malex.service.impl;

import com.malex.model.RolesEntity;
import com.malex.repository.RolesRepository;
import com.malex.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesRepository repository;

    @Override
    public RolesEntity save(RolesEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public RolesEntity update(RolesEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public RolesEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<RolesEntity> findAll() {
        return repository.findAll();
    }
}
