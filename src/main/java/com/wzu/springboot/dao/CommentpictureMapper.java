package com.wzu.springboot.dao;

import com.wzu.springboot.pojo.Commentpicture;
import java.util.List;

public interface CommentpictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentpicture
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentpicture
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int insert(Commentpicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentpicture
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    Commentpicture selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentpicture
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    List<Commentpicture> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentpicture
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    int updateByPrimaryKey(Commentpicture record);
}