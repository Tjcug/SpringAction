package com.hust.edu.mapper;

import com.hust.edu.pojo.Airport;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * locate com.hust.edu.mapper
 * Created by MasterTj on 2019/1/10.
 */
@Repository
public interface AirPortMapper {
    @Select("select * from airport")
    public List<Airport> selAll();
}
