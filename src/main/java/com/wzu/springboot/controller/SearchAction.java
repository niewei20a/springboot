package com.wzu.springboot.controller;

import com.wzu.springboot.pojo.TripShort;
import com.wzu.springboot.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SearchAction {

    @Autowired
    TripService tripService;

    @RequestMapping("/search")
    public String search(ModelMap modelMap){
        List<TripShort> list = tripService.getTripByPlace("杭州");
        modelMap.addAttribute("key",list);
        return "search";
    }
    @RequestMapping(value = "/search/{key}")
    public String search(@PathVariable("key") String key, ModelMap modelMap){
        List<TripShort> list = tripService.getTripByPlace(key);
        System.out.println("list = " +list.toString());
        modelMap.addAttribute("key",list);
        return "search";
    }
}
