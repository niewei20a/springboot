package com.wzu.springboot.pojo;

import java.util.Date;

public class Contact {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.id
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private Integer user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.phone
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.name
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.sex
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private Byte sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.email
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.cardno
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.birthday
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    private Date birthday;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.id
     *
     * @return the value of contact.id
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.id
     *
     * @param id the value for contact.id
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.user
     *
     * @return the value of contact.user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public Integer getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.user
     *
     * @param user the value for contact.user
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.phone
     *
     * @return the value of contact.phone
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.phone
     *
     * @param phone the value for contact.phone
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.name
     *
     * @return the value of contact.name
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.name
     *
     * @param name the value for contact.name
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.sex
     *
     * @return the value of contact.sex
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.sex
     *
     * @param sex the value for contact.sex
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.email
     *
     * @return the value of contact.email
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.email
     *
     * @param email the value for contact.email
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.cardno
     *
     * @return the value of contact.cardno
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.cardno
     *
     * @param cardno the value for contact.cardno
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.birthday
     *
     * @return the value of contact.birthday
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.birthday
     *
     * @param birthday the value for contact.birthday
     *
     * @mbggenerated Mon Jun 17 08:41:45 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}