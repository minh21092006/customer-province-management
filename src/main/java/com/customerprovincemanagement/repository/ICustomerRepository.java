package com.customerprovincemanagement.repository;

import com.customerprovincemanagement.model.Customer;
import com.customerprovincemanagement.model.Province;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICustomerRepository extends CrudRepository<Customer,Long> {
    @Query("select c from Customer c where c.province=?1")
    List<Customer> findAllByProvince(Province province);
}
