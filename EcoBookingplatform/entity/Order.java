package com.ecobookingplatform.ebp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
	@Getter
	@Setter
	public class Order {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderId;

	    @NotBlank(message = "Date is mandatory to mention")
	    @Column(length = 10, nullable = false)
	    private String date;

	    @ManyToOne
	    @JoinColumn(name = "userId", referencedColumnName = "userId")
	    @JsonBackReference
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "productId", referencedColumnName = "productId")
	    private Product product;

	    // Constructors, other fields, getters, and setters...

	}



