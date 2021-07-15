package com.company.dao;

import com.company.dao.model.News;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsDao {

    private final static String URL = "jdbc:postgresql://localhost:5432/exam3";
    private final static String USER = "postgres";
    private final static String PASSWORD = "4342";

    public Connection connection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }

    public boolean createNews(News news) {
        String SQL = "insert into news(title, news_text, publish_time) values(?, ?, ?)";
        boolean result = false;
        try (Connection connection = connection();
             PreparedStatement statement = connection.prepareStatement(SQL)){

            statement.setString(1, news.getTitle());
            statement.setString(2, news.getNewsText());
            statement.setTimestamp(3, news.getPublishTime());
            result = statement.execute();


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public List<News> getNewsList() {
        String SQL = "select * from news";
        List<News> newsList = new ArrayList<>();

        try(Connection connection = connection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL)){

            while (rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setTitle(rs.getString("title"));
                news.setNewsText(rs.getString("news_text"));
                news.setPublishTime(rs.getTimestamp("publish_time"));
                newsList.add(news);
            }

        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return  newsList;
    }

    public boolean removeNewsById(int id) {
        String sql = "delete from news where id = ?";
        boolean result = false;
        try (Connection connection = connection();
            PreparedStatement statement = connection.prepareStatement(sql))   {
            statement.setInt(1, id);
            result = statement.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return  result;
    }

    public boolean updateNewsById(int id, String title, String newsText ) {
        String sql = "update news set title = ?, news_text = ? where id = ?";
        boolean result = false;
        try (Connection connection = connection();
            PreparedStatement statement = connection.prepareStatement(sql))   {
            statement.setString(1, title);
            statement.setString(2, newsText);
            statement.setInt(3, id);
            result = statement.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return  result;
    }






}
