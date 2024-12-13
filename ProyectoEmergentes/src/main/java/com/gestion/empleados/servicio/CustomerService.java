package com.gestion.empleados.servicio;

//CustomerService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.empleados.modelo.Customer;
import com.gestion.empleados.repositorio.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
 @Autowired
 private CustomerRepository customerRepository;

 public List<Customer> getAllCustomers() {
     return customerRepository.findAll();
 }
}

