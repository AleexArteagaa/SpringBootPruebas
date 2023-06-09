package com.example.carservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carservice.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByUserId(int userId);

}
