package com.gmoussa.ebankbackend.repositories;

import com.gmoussa.ebankbackend.entities.AccountOperation;
import com.gmoussa.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
