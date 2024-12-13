package com.gestion.empleados.controlador;

//OrderController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelo.Order;
import com.gestion.empleados.servicio.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
 @Autowired
 private OrderService orderService;

 @GetMapping
 public List<Order> getAllOrders() {
     return orderService.getAllOrders();
 }
}

