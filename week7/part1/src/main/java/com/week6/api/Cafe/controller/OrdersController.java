package com.week6.api.Cafe.controller;


import com.week6.api.Cafe.entity.Cakes;
import com.week6.api.Cafe.entity.Customers;
import com.week6.api.Cafe.entity.Drinks;
import com.week6.api.Cafe.entity.Orders;
import com.week6.api.Cafe.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    public final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @GetMapping
    public List<Orders> getOrders(){
        return ordersService.getOrders();
    }
    @GetMapping("/{id}")
    public Optional<Orders> getOrder(@PathVariable Long id){
        return ordersService.getOrder(id);
    }
    @PostMapping("/add")
    public Orders addOrder(@RequestBody Orders order){
        return ordersService.addOrder(order);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id){
        return ordersService.deleteOrder(id);
    }
    @PutMapping("/update/{id}")
    public Orders updateOrder(@PathVariable Long id,
                              @RequestParam(required = false) Customers customerId,
                              @RequestParam(required = false) Cakes cakeId,
                              @RequestParam(required = false) Drinks drinkId,
                              @RequestParam LocalDateTime date){
        return ordersService.updateOrder(id, customerId, cakeId, drinkId, date);
    }
}
