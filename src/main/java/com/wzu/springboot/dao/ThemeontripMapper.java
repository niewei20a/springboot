package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Themeontrip;
import java.util.List;

public interface ThemeontripMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Themeontrip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Themeontrip selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Themeontrip> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Themeontrip record);
}