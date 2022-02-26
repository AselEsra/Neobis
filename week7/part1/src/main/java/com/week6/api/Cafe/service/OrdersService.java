package com.week6.api.Cafe.service;

import com.week6.api.Cafe.entity.Cakes;
import com.week6.api.Cafe.entity.Customers;
import com.week6.api.Cafe.entity.Drinks;
import com.week6.api.Cafe.entity.Orders;
import com.week6.api.Cafe.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }

    public Optional<Orders> getOrder(Long id){
        return ordersRepository.findById(id);
    }

    public Orders addOrder(Orders order){
        return ordersRepository.save(order);
    }

    public String deleteOrder(Long id){
        boolean exists = ordersRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("order with id: " + id + " doesn't exist");
        }
        ordersRepository.deleteById(id);
        return "order with id: "+ id + " deleted";
    }

    public Orders updateOrder(Long id, Customers customerId, Cakes cakeId, Drinks drinkId, LocalDateTime localDateTime){
        Orders order = ordersRepository.findById(id).orElseThrow(
                () ->new IllegalStateException("order with id: " + id + "doesn't exist"));
        order.setCustomerId(customerId);
        order.setCakeId(cakeId);
        order.setDrinkId(drinkId);
        if (localDateTime != null) {
            order.setDate(localDateTime);
        }
        return ordersRepository.save(order);
    }
}
