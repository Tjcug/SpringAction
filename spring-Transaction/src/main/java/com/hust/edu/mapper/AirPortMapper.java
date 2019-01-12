package com.hust.edu.mapper;

import com.hust.edu.pojo.Airport;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * locate com.hust.edu.mapper
 * Created by MasterTj on 2019/1/10.
 */
@Repository
@Mapper
public interface AirPortMapper {
    @Select("select * from airport")
    public List<Airport> selAll();

    @Insert("insert into airport(portName,cityName) values(#{portName},#{cityName})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @SelectKey(statement="SELECT LAST_INSERT_ID()",keyProperty="id",before=false,resultType=Integer.class)
    public int insertAirport(Airport airport);
}
