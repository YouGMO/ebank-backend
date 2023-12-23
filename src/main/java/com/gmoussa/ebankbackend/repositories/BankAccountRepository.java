package com.gmoussa.ebankbackend.repositories;

import com.gmoussa.ebankbackend.entities.BankAccount;
import com.gmoussa.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
