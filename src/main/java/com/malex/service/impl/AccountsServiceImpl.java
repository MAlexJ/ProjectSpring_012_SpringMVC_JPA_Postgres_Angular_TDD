package com.malex.service.impl;

import com.malex.model.AccountsEntity;
import com.malex.repository.AccountsRepository;
import com.malex.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsRepository repository;

    @Override
    public AccountsEntity save(AccountsEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public AccountsEntity update(AccountsEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public AccountsEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<AccountsEntity> findAll() {
        return repository.findAll();
    }
}
