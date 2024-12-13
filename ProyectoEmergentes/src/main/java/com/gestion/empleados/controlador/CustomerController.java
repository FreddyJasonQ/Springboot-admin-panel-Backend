package com.gestion.empleados.controlador;

//CustomerController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelo.Customer;
import com.gestion.empleados.servicio.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {
 @Autowired
 private CustomerService customerService;

 @GetMapping
 public List<Customer> getAllCustomers() {
     return customerService.getAllCustomers();
 }
}
