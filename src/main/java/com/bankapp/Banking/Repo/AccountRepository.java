package com.bankapp.Banking.Repo;

import com.bankapp.Banking.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}