package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Ordercontact;
import java.util.List;

public interface OrdercontactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordercontact
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordercontact
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Ordercontact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordercontact
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Ordercontact selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordercontact
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Ordercontact> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordercontact
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Ordercontact record);
}