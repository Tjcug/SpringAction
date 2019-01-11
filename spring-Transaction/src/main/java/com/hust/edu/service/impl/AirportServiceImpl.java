package com.hust.edu.service.impl;

import com.hust.edu.mapper.AirPortMapper;
import com.hust.edu.pojo.Airport;
import com.hust.edu.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * locate com.hust.edu.service
 * Created by MasterTj on 2019/1/10.
 */
@Service("airportService")
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirPortMapper airPortMapper;

    @Override
    public List<Airport> findAllAirport() {
        List<Airport> airports2 = airPortMapper.selAll();
        List<Airport> airports1 = airPortMapper.selAll();
        airports2.addAll(airports1);
        return airports2;
    }
}
