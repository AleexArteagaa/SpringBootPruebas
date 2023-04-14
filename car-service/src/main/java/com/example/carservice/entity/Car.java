package com.example.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "users_service", name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "brand", length = 100, nullable = false)
	private String brand;
	@Column(name = "model", length = 100, nullable = true)
	private String model;
	@Column(name = "user_id", nullable = true)
	private int userId;

}
