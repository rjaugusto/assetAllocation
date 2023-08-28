package com.rja.assetAllocation.trasaction.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class BrazilianStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;

    public Long quantity;

    public BigDecimal price;

    public String ticker;

    private LocalDate transactionDate;

    private TransactionType transactionType;


    private BigDecimal tax;

    public BrazilianStock(Long quantity, BigDecimal price, String ticker, LocalDate transactionDate, TransactionType transactionType, BigDecimal tax) {
        this.quantity = quantity;
        this.price = price;
        this.ticker = ticker;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.tax = tax;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        BrazilianStock that = (BrazilianStock) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}
