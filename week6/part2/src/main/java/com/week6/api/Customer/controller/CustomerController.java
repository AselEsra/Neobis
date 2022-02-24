package com.week6.api.Customer.controller;


import com.week6.api.Customer.service.CustomerService;
import com.week6.api.Customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {


    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping("/{id}")
    public Optional<Customer> getDessert(@PathVariable("id") Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping("/add")
    public Customer newCustomer(@RequestBody Customer customer){
       return customerService.addCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id){
        return customerService.deleteCustomer(id);
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable Long id,
                                   @RequestParam(required = false) String firstName,
                                   @RequestParam(required = false) String lastName,
                                   @RequestParam(required = false) String phoneNumber,
                                   @RequestParam(required = false) String address){
        return customerService.updateCustomer(id, firstName, lastName, phoneNumber, address);
    }
}

