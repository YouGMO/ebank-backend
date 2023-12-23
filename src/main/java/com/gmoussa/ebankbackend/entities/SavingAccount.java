package com.gmoussa.ebankbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("SC")
@Data @AllArgsConstructor @NoArgsConstructor
public class SavingAccount extends BankAccount{

    private double interestRate;
}
