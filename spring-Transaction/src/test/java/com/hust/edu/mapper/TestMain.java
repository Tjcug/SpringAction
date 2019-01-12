package com.hust.edu.mapper;

import com.hust.edu.pojo.Airport;
import org.junit.Test;

/**
 * locate com.hust.edu.mapper
 * Created by mastertj on 2019/1/12.
 */
public class TestMain {
    @Test
    public void testAirPort(){
        Airport airport = new Airport("黄花机场", "北京");
        System.out.println(airport);
    }
}
