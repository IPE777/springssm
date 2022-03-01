package com.wyh.dao;

import com.wyh.pojo.Customer;

import java.util.List;

public interface CustomerMapper {

    int addCustomer(Customer customer);

    int update(Customer customer);
    Customer findId(int id);

    int delete(int id);
    List<Customer> query();
}
