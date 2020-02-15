package com.just.book_appoint_system.domain;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.school_number
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String schoolNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.school
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.grade
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.major
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String major;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.permission
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private Integer permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.head_portrait
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String headPortrait;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.deleted
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private Integer deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.null1
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String null1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.null2
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String null2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.null3
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    private String null3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.school_number
     *
     * @return the value of user.school_number
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.school_number
     *
     * @param schoolNumber the value for user.school_number
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber == null ? null : schoolNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.school
     *
     * @return the value of user.school
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.school
     *
     * @param school the value for user.school
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.grade
     *
     * @return the value of user.grade
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.grade
     *
     * @param grade the value for user.grade
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.major
     *
     * @return the value of user.major
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.major
     *
     * @param major the value for user.major
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.permission
     *
     * @return the value of user.permission
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.permission
     *
     * @param permission the value for user.permission
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.head_portrait
     *
     * @return the value of user.head_portrait
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.head_portrait
     *
     * @param headPortrait the value for user.head_portrait
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.deleted
     *
     * @return the value of user.deleted
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.deleted
     *
     * @param deleted the value for user.deleted
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.null1
     *
     * @return the value of user.null1
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getNull1() {
        return null1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.null1
     *
     * @param null1 the value for user.null1
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setNull1(String null1) {
        this.null1 = null1 == null ? null : null1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.null2
     *
     * @return the value of user.null2
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getNull2() {
        return null2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.null2
     *
     * @param null2 the value for user.null2
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setNull2(String null2) {
        this.null2 = null2 == null ? null : null2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.null3
     *
     * @return the value of user.null3
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public String getNull3() {
        return null3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.null3
     *
     * @param null3 the value for user.null3
     *
     * @mbggenerated Sat Feb 15 11:14:27 CST 2020
     */
    public void setNull3(String null3) {
        this.null3 = null3 == null ? null : null3.trim();
    }
}