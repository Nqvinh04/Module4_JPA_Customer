package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.repository.Repository;

import javax.naming.Name;
import java.util.List;

public interface CusI extends Repository<Customer, Long> {
    List<Customer> findByFirstNameContaining(String firstName);
}
