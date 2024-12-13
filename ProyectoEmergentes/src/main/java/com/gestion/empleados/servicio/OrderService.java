package com.gestion.empleados.servicio;

//OrderService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.empleados.modelo.Order;
import com.gestion.empleados.repositorio.OrderRepository;

import java.util.List;

@Service
public class OrderService {
 @Autowired
 private OrderRepository orderRepository;

 public List<Order> getAllOrders() {
     return orderRepository.findAll();
 }
}
