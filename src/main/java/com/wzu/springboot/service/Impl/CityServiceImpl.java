package com.wzu.springboot.service.Impl;

import com.wzu.springboot.dao.CityMapper;
import com.wzu.springboot.pojo.City;
import com.wzu.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityMapper cityMapper;
    @Override
    public List<City> selectAll() {
        return cityMapper.selectAll();
    }
}
