package com.malex.repository;

import com.malex.model.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<AccountsEntity, Long>{
}
