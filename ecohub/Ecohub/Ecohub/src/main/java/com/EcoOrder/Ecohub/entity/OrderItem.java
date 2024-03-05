package com.EcoOrder.Ecohub.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public class OrderItem {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderItemId;

	    @Column(nullable = false)
	    private int quantity;

	    @ManyToOne
	    @JoinColumn(name = "bookingId", nullable = false)
	    @JsonBackReference
	    private Booking booking;

	    @ManyToOne
	    @JoinColumn(name = "productIdd", nullable = false)
	    @JsonBackReference
	    private Product product;

	    // other fields, getters, setters

	    // Constructors, getters, setters

	    

	    // Getters and setters
	    // ...
	}


