package com.company.dao.model;

import java.sql.Timestamp;

public class News {
    private Integer id;
    private String title;
    private String newsText;
    private Timestamp publishTime;

    public News() { }

    public News(String title, String newsText, Timestamp publishTime) {
        this.title = title;
        this.newsText = newsText;
        this.publishTime = publishTime;
    }

    public News(Integer id, String title, String newsText, Timestamp publishTime) {
        this.id = id;
        this.title = title;
        this.newsText = newsText;
        this.publishTime = publishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", newsText='" + newsText + '\'' +
                ", publishTime=" + publishTime +
                '}';
    }
}
