package com.wzu.springboot.service;

import com.wzu.springboot.pojo.Trip;
import com.wzu.springboot.pojo.TripShort;

import java.util.List;

public interface TripService {
    public List<TripShort> getTripByType(String value);
    public List<TripShort> getTripByPlace(String value);
}
