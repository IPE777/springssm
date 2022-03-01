package com.wyh.service;

import com.wyh.pojo.Customer;

import java.util.List;

public interface CustomerService {

     int addCustomer(Customer customer);
     int delete(int id);
     int update(Customer customer);
     Customer findId(int id);
     List<Customer> query();
}
