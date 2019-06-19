package com.wzu.springboot.service;

import com.wzu.springboot.pojo.City;

import java.util.List;

public interface CityService {
    List<City> selectAll();
}
