package com.gayan.msjdemo.services;

import com.gayan.msjdemo.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
