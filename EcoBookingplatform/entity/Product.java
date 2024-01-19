package com.ecobookingplatform.ebp.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
	@Getter
	@Setter
	public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long productId;

	    @NotBlank(message = "Product name is mandatory")
	    @Column(length = 50, nullable = false)
	    private String productName;

	    @NotBlank(message = "Description is mandatory")
	    @Column(length = 255, nullable = false)
	    private String description;

	    @Column(length = 100)
	    private String ecoFriendlyDetails;

	    @NotNull(message = "Price is mandatory")
	    private BigDecimal price;

	    // Constructors, other fields, getters, and setters...

	}



