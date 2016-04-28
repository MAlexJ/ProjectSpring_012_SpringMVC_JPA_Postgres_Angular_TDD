package com.malex.service.impl;

import com.malex.model.AccountEntity;
import com.malex.repository.AccountRepository;
import com.malex.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public AccountEntity save(AccountEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public AccountEntity update(AccountEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public AccountEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<AccountEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public AccountEntity findAccountWhereNameGt(String name, String password) {
        return repository.findAccountWhereNameGt(name, password);
    }
}
