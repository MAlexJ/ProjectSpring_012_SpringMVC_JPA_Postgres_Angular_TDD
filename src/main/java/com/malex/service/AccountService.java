package com.malex.service;

import com.malex.model.AccountEntity;

import java.util.List;

public interface AccountService {

    AccountEntity save(AccountEntity entity);

    AccountEntity update(AccountEntity entity);

    void delete(Long id);

    AccountEntity findById(Long id);

    List<AccountEntity> findAll();

    AccountEntity findAccountWhereNameGt(String name, String password);
}
