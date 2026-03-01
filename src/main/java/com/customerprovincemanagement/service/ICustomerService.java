package com.customerprovincemanagement.service;

import com.customerprovincemanagement.model.Customer;
import com.customerprovincemanagement.model.Province;

import java.util.List;

public interface ICustomerService extends IGeneralService<Customer> {
    List<Customer> findAllByProvince(Province province);
}
