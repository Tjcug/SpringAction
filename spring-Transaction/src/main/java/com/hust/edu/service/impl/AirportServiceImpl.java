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

    @Override
    public int insertAirport(Airport airport){
        int result = airPortMapper.insertAirport(new Airport("黄花机场", "北京"));
        //抛出异常,事务加载不成功
        int i=1/0;
        return result;
    }
}
