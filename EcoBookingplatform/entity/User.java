package com.ecobookingplatform.ebp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
	@Table(name="UserInfo")
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	
	public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int uId;
		
		@Column(length = 25, nullable = false)
		@NotBlank(message=" User Name is mandotory to fill ")
		private String uName;
		
		@Column(length = 35)
		private String uSurname;
		
		
		
		@Column(length = 12, nullable = false,unique = true)
		@NotNull(message="User phone is mandotory to fill")
		private long uPhone;
		
		@Column(length = 40)
		private String addr;
		
		@OneToMany(mappedBy = "user")
		@JsonManagedReference
		List<Order> orderList;
	}



