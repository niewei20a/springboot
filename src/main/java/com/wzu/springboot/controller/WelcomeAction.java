package com.wzu.springboot.controller;

import com.wzu.springboot.pojo.TripShort;
import com.wzu.springboot.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class WelcomeAction {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/trip" , method = RequestMethod.GET)
    public String getTripShort(ModelMap modelMap){

        List<TripShort> list = tripService.getTripByType("自驾游").subList(0,6);
        List<TripShort> qianlist = tripService.getTripByPlace("千岛湖").subList(0,6);
        List<TripShort> shanglist = tripService.getTripByPlace("上海").subList(0,6);
        List<TripShort> hanglist = tripService.getTripByPlace("杭州").subList(0,6);

        List<TripShort> listNation = tripService.getTripByType("国内游").subList(0,6);

        List<TripShort> listWorld = tripService.getTripByType("出境游").subList(0,6);

        modelMap.addAttribute("qianTrips",qianlist);
        modelMap.addAttribute("trips", list);
        modelMap.addAttribute("shangTrips", shanglist);
        modelMap.addAttribute("hangTrips", hanglist);

        modelMap.addAttribute("listNations", listNation);

        modelMap.addAttribute("listWorlds", listWorld);

        return "welcome";
    }
}
