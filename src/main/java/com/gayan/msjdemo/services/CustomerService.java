package com.gayan.msjdemo.services;

import com.gayan.msjdemo.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
