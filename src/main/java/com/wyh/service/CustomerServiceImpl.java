package com.wyh.service;

import com.wyh.dao.CustomerMapper;
import com.wyh.pojo.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerMapper customerMapper;

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }


    public List<Customer> query(){
        return customerMapper.query();
    }

    public int addCustomer(Customer customer){
return customerMapper.addCustomer(customer);
    }

    public int delete(int id){
        return customerMapper.delete(id);
    }

    public int update(Customer customer){
        return customerMapper.update(customer);
    }

    public Customer findId(int id){
        return customerMapper.findId(id);
    }

}
