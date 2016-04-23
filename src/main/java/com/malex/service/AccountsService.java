package com.malex.service;

import com.malex.model.AccountsEntity;

import java.util.List;

public interface AccountsService {

    AccountsEntity save(AccountsEntity entity);

    AccountsEntity update(AccountsEntity entity);

    void delete(Long id);

    AccountsEntity findById(Long id);

    List<AccountsEntity> findAll();
}
