package com.springbatch.demo.config;

import com.springbatch.demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if (customer.getSex().equals("Male")) { // here just add a condition where data will process only for Male customer.
            return customer;
        } else {
            return null;
        }
    }
}
