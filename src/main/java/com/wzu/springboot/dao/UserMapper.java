package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(User record);

    int checkUser(User user);
    int checkUserByName(User user);
    int checkUserByEmail(User user);
    int checkByEmail(User user);
    int checkByPhone(User user);

    int insertByEmail(User user);
    int insertByPhone(User user);
}