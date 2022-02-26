package com.week6.api.Cafe.repository;

import com.week6.api.Cafe.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> { }
