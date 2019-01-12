package com.hust.edu.service;

import com.hust.edu.pojo.Airport;

import java.util.List;

/**
 * locate com.hust.edu.service
 * Created by MasterTj on 2019/1/10.
 */
public interface AirportService {
    public List<Airport> findAllAirport();
    public int insertAirport(Airport airport);
}
