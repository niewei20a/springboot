package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Dates;
import java.util.List;

public interface DatesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dates
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dates
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Dates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dates
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Dates selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dates
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Dates> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dates
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Dates record);
}