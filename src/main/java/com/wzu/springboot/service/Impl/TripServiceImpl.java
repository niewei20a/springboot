package com.wzu.springboot.service.Impl;

import com.wzu.springboot.dao.TripMapper;
import com.wzu.springboot.pojo.TripShort;
import com.wzu.springboot.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    TripMapper tripMapper;
    @Override
    public List<TripShort> getTripByType(String value) {
        return tripMapper.getTripByType(value);
    }

    @Override
    public List<TripShort> getTripByPlace(String value) {
        return tripMapper.getTripByPlace(value);
    }
}
