package com.javatechie.spring.batch.repository;

import com.javatechie.spring.batch.entity.CustomerDao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<CustomerDao,UUID> {
}
