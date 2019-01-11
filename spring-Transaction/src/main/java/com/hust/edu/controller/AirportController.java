package com.hust.edu.controller;

import com.google.gson.Gson;
import com.hust.edu.pojo.Airport;
import com.hust.edu.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * locate com.hust.edu.controller
 * Created by MasterTj on 2019/1/11.
 */
@Controller
public class AirportController {
    private Gson gson=new Gson();

    @Autowired
    private AirportService airportService;

    @RequestMapping(value = "/airport/findAirports",
            produces = "application/json;charset=UTF-8")
    @ResponseBody()
    public String findAirports(){
        List<Airport> allAirport = airportService.findAllAirport();
        System.out.println(allAirport);
        return gson.toJson(allAirport);
    }
}
