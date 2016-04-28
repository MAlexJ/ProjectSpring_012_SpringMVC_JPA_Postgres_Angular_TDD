package com.malex.repository;

import com.malex.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    String QUERY = "SELECT a FROM AccountEntity a WHERE a.userName=:name and a.password=:password";

    @Query(QUERY)
    AccountEntity findAccountWhereNameGt(@Param("name") String name, @Param("password") String password);
}
