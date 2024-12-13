package com.gestion.empleados.repositorio;

//OrderRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
