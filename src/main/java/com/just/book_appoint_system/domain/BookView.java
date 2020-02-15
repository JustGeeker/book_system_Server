package com.just.book_appoint_system.domain;

public class BookView {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.id
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.book_name
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String bookName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.isbn
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String isbn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.classification
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String classification;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.press
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String press;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.publish_time
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String publishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.author
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.description
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.book_imgs
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private String bookImgs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.total
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private Integer total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.borrow_number
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private Integer borrowNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.inventory
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private Integer inventory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_view.count
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.id
     *
     * @return the value of book_view.id
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.id
     *
     * @param id the value for book_view.id
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.book_name
     *
     * @return the value of book_view.book_name
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.book_name
     *
     * @param bookName the value for book_view.book_name
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.isbn
     *
     * @return the value of book_view.isbn
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.isbn
     *
     * @param isbn the value for book_view.isbn
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.classification
     *
     * @return the value of book_view.classification
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getClassification() {
        return classification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.classification
     *
     * @param classification the value for book_view.classification
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.press
     *
     * @return the value of book_view.press
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getPress() {
        return press;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.press
     *
     * @param press the value for book_view.press
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.publish_time
     *
     * @return the value of book_view.publish_time
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.publish_time
     *
     * @param publishTime the value for book_view.publish_time
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.author
     *
     * @return the value of book_view.author
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.author
     *
     * @param author the value for book_view.author
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.description
     *
     * @return the value of book_view.description
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.description
     *
     * @param description the value for book_view.description
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.book_imgs
     *
     * @return the value of book_view.book_imgs
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public String getBookImgs() {
        return bookImgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.book_imgs
     *
     * @param bookImgs the value for book_view.book_imgs
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setBookImgs(String bookImgs) {
        this.bookImgs = bookImgs == null ? null : bookImgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.total
     *
     * @return the value of book_view.total
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.total
     *
     * @param total the value for book_view.total
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.borrow_number
     *
     * @return the value of book_view.borrow_number
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public Integer getBorrowNumber() {
        return borrowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.borrow_number
     *
     * @param borrowNumber the value for book_view.borrow_number
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setBorrowNumber(Integer borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.inventory
     *
     * @return the value of book_view.inventory
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.inventory
     *
     * @param inventory the value for book_view.inventory
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_view.count
     *
     * @return the value of book_view.count
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_view.count
     *
     * @param count the value for book_view.count
     *
     * @mbggenerated Sat Feb 15 11:02:50 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}