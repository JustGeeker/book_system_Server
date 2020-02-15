package com.just.book_appoint_system.domain;

import java.util.Date;

public class BorrowHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.order_num
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private String orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.user_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.book_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.appoint_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date appointTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.borrow_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date borrowTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.return_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date returnTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.fail_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date failTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.status
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.create_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.update_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.deleted
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private Integer deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.null2
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private String null2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_history.null3
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    private String null3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.id
     *
     * @return the value of borrow_history.id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.id
     *
     * @param id the value for borrow_history.id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.order_num
     *
     * @return the value of borrow_history.order_num
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.order_num
     *
     * @param orderNum the value for borrow_history.order_num
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.user_id
     *
     * @return the value of borrow_history.user_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.user_id
     *
     * @param userId the value for borrow_history.user_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.book_id
     *
     * @return the value of borrow_history.book_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.book_id
     *
     * @param bookId the value for borrow_history.book_id
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.appoint_time
     *
     * @return the value of borrow_history.appoint_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getAppointTime() {
        return appointTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.appoint_time
     *
     * @param appointTime the value for borrow_history.appoint_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.borrow_time
     *
     * @return the value of borrow_history.borrow_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getBorrowTime() {
        return borrowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.borrow_time
     *
     * @param borrowTime the value for borrow_history.borrow_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.return_time
     *
     * @return the value of borrow_history.return_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.return_time
     *
     * @param returnTime the value for borrow_history.return_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.fail_time
     *
     * @return the value of borrow_history.fail_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getFailTime() {
        return failTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.fail_time
     *
     * @param failTime the value for borrow_history.fail_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.status
     *
     * @return the value of borrow_history.status
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.status
     *
     * @param status the value for borrow_history.status
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.create_time
     *
     * @return the value of borrow_history.create_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.create_time
     *
     * @param createTime the value for borrow_history.create_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.update_time
     *
     * @return the value of borrow_history.update_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.update_time
     *
     * @param updateTime the value for borrow_history.update_time
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.deleted
     *
     * @return the value of borrow_history.deleted
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.deleted
     *
     * @param deleted the value for borrow_history.deleted
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.null2
     *
     * @return the value of borrow_history.null2
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public String getNull2() {
        return null2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.null2
     *
     * @param null2 the value for borrow_history.null2
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setNull2(String null2) {
        this.null2 = null2 == null ? null : null2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_history.null3
     *
     * @return the value of borrow_history.null3
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public String getNull3() {
        return null3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_history.null3
     *
     * @param null3 the value for borrow_history.null3
     *
     * @mbggenerated Fri Feb 14 22:39:30 CST 2020
     */
    public void setNull3(String null3) {
        this.null3 = null3 == null ? null : null3.trim();
    }
}