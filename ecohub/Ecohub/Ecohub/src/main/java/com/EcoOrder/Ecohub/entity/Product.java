package com.EcoOrder.Ecohub.entity;

import java.math.BigDecimal;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productId")
    private int productId;

    @Column(nullable = false)
    private String productName;

    @Column
    private String productDescription;

    @Column(nullable = false)
    private BigDecimal price;
    
    
//   @ManyToOne
//    
//    @JoinColumn(name = "productIdd", insertable = false, updatable = false)
//    private Product product;
    
    
   
}

	

	

