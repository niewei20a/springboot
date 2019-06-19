package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Schedule;
import java.util.List;

public interface ScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Schedule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Schedule> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Schedule record);
}