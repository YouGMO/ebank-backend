package com.gmoussa.ebankbackend.repositories;

import com.gmoussa.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
