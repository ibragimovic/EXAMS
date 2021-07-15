package com.company;

import com.company.dao.NewsDao;
import com.company.dao.model.News;
import com.sun.source.tree.NewArrayTree;

import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) {
        NewsDao newsDao = new NewsDao();
        newsDao.connection();

//        News news = new News("IT-Academy курсы", "Начинаем курсы по JAVA", Timestamp.valueOf("2021-02-25 19:00:00"));
        News news2 = new News("IT-Academy", "Выпуск по JAVA", Timestamp.valueOf("2021-09-25 15:00:00"));
        News news3 = new News("IT-Academy", "Новый офис", Timestamp.valueOf("2022-02-25 13:00:00"));

//        newsDao.createNews(news2);
//        newsDao.createNews(news3);

        System.out.println(newsDao.getNewsList());
//        newsDao.removeNewsById(1);
        System.out.println(newsDao.getNewsList());
        newsDao.updateNewsById(3, "IT-Academy новый адрес", "Мы переехали по адресу Ибраимова 115/1");
        System.out.println(newsDao.getNewsList());

    }
}
