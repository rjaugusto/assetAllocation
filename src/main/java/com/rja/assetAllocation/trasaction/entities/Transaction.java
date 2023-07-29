package com.rja.assetAllocation.trasaction.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public Long quantity;

	public BigDecimal price;

	private LocalDate date;

	private TransactionType transactionType;

	private BigDecimal tax;

	@OneToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;

}
