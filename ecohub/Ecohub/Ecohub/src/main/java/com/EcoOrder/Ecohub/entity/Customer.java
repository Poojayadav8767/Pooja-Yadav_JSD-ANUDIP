package com.EcoOrder.Ecohub.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CustomerInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cId;

    @Column(length = 25, nullable = false)
    @NotBlank(message = "Customer Name is mandatory to fill")
    private String cName;

    @Column(length = 35)
    private String cSurname;

    @Column(length = 25, nullable = false, unique = true)
    @NotBlank(message = "Customer Email is mandatory to fill")
    @Email(message = "Customer Email is not proper according to norms")
    private String cEmail;

    @Column(nullable = false, unique = true)
    @NotNull(message = "Customer phone is mandatory to fill")
    private Long cPhone;

    @Column(length = 40)
    private String addr;

    @OneToMany(mappedBy = "customer")
    @JsonManagedReference
    private List<Booking> bookingList;
}
