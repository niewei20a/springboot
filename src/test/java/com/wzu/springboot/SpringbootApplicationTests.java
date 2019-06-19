package com.wzu.springboot;

import com.wzu.springboot.service.CityService;
import com.wzu.springboot.service.TripService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    CityService cityService;

    @Autowired
    TripService tripService;
    @Test
    public void contextLoads() {
        System.out.println(tripService.getTripByType("自驾游").toString());
    }

}
