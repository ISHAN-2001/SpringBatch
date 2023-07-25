package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Customer;
import com.javatechie.spring.batch.entity.CustomerDao;

import lombok.NonNull;

import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,CustomerDao> {

    @Override
    public CustomerDao process(@NonNull Customer customer) throws Exception {
        CustomerDao customerDao = new CustomerDao(customer);
        return customerDao;
    }
}
