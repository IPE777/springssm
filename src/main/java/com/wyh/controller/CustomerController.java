package com.wyh.controller;

import com.wyh.pojo.Customer;
import com.wyh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/asd")
public class CustomerController {
    @Autowired
    @Qualifier("CustomerServiceImpl")
    CustomerService customerService;

    @RequestMapping("/allCustomer")
    public String all(Model model){
        List<Customer> list= customerService.query();
        model.addAttribute("lis" ,list);

        return "aa";
    }
    @RequestMapping("/toAddCustomer")
    public String toAddCustomer(){
        return "addCustomer";
    }
    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer){
        System.out.println(customer);
    customerService.addCustomer(customer);
    return "redirect:/asd/allCustomer";
    }
    @RequestMapping("/del/{id}")
    public String delete(@PathVariable("id") int id){
        customerService.delete(id);
        return "redirect:/asd/allCustomer/";
    }
    @RequestMapping("/toupdate")
    public String toUpdate(Model model,int id){
        Customer customer=customerService.findId(id);
        System.out.println(customer);
        model.addAttribute("customer",customer);
        return "update";

    }
    @RequestMapping("/update")
    public String update(Model model,Customer customer){
        System.out.println(customer);
        customerService.update(customer);
        Customer customer1=customerService.findId(customer.getId());

        model.addAttribute("customer1",customer1);
        return "redirect:/asd/allCustomer";
    }
}
