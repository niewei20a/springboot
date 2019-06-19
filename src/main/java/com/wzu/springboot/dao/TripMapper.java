package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Trip;
import com.wzu.springboot.pojo.TripShort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface TripMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Trip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Trip selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Trip> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Trip record);


    List<TripShort> getTripByType(@Param("value") String value);
    List<TripShort>  getTripByPlace(@Param("value") String value);
}