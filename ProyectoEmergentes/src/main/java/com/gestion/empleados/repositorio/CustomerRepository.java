package com.gestion.empleados.repositorio;
//CustomerRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
