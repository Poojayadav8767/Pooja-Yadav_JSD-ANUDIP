package com.ecobookingplatform.ebp.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
	@Getter
	@Setter
	public class Payment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int paymentId;

	    @ManyToOne
	    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
	    @JsonBackReference
	    private Order order;

	    @NotNull(message = "Amount is mandatory")
	    private long amount;

	    @NotNull(message = "Payment date is mandatory")
	    private LocalDate paymentDate;  // Use LocalDate for the payment date


	    // Constructors, other fields, getters, and setters...

	}



