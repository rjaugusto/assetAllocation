package com.rja.assetAllocation.trasaction.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Reit extends Asset{

    private BigDecimal dollarExchangeRate;
}
