package com.codegym.cms.service.Customer;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;

import java.util.List;

public interface CustomerService  {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    List<Customer> findByFirstName(String firstName);

    Iterable<Customer>findAllByProvince(Province province);
}
