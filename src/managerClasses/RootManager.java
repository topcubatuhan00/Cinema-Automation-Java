package managerClasses;

import MainClasses.Hall;
import MainClasses.Movie;
import java.sql.*;
import java.util.ArrayList;

public class RootManager implements IRoot{

    private static final String dbUrl = "jdbc:mysql://localhost:3306/project";
    private static final String dbUserName = "root";
    private static final String dbPassword = "";

    private static Connection conn;
    private static Statement statement = null;
    private static PreparedStatement prep;


    public RootManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver Not Found");
        }

        try {
            conn = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Did not Connect");
        }
    }

    @Override
    public boolean addMovie(Movie movie) {

        boolean added = false;

        String addMovieQuery = "Insert Into movies (title,language,type,publishdate,price) VALUES (?,?,?,?,?)";
        try {
            prep = conn.prepareStatement(addMovieQuery);

            prep.setString(1,movie.getTitle());
            prep.setString(2,movie.getLanguage());
            prep.setString(3,movie.getType());
            prep.setString(4,movie.getPublishingDate());
            prep.setInt(5,movie.getPrice());

            prep.executeUpdate();

            added = true;

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return added;
    }

    @Override
    public void deleteMovie(String movieTitle) {

        String deleteMovieQuery = "Delete from movies where title="+ "'"+movieTitle+"'";

        try {
            statement = conn.createStatement();

            statement.executeUpdate(deleteMovieQuery);
            System.out.println("Başarıyla Silindi...");

        } catch (SQLException throwable) {
            System.out.println("Sql Exception");
        }
    }

    @Override
    public boolean addMovieInHall(Hall hall, String movieName,String date,String startTime,String finishTime,int price) {
        boolean added = false;
        if(hallEmpty(hall.getName(),date,movieName)){
            String addMovieInHallQuery = "Insert Into "+hall.getName()+" (movieTitle,date,startTime,finishTime,price) VALUES (?,?,?,?,?)";
            try {
                prep = conn.prepareStatement(addMovieInHallQuery);

                prep.setString(1,movieName);
                prep.setString(2,date);
                prep.setString(3,startTime);
                prep.setString(4,finishTime);
                prep.setInt(5,price);

                prep.executeUpdate();

                added = true;

            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
        return added;
    }

    @Override
    public boolean deleteMovieInHall(String hallName,String movieTitle) {
        boolean delete = false;
        String deleteMovieInHallQuery = "Delete from "+ hallName+" where movieTitle="+ "'"+movieTitle+"'";

        try {
            statement = conn.createStatement();

            statement.executeUpdate(deleteMovieInHallQuery);
            delete = true;

        } catch (SQLException throwables) {
            System.out.println("Sql Exception");
        }
        return delete;
    }

    @Override
    public ArrayList<String> getMovie(){
        ArrayList<String> movies = new ArrayList<>();
        String getMovieQuery = "Select title from movies";
        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(getMovieQuery);
            String movie;
            while (rs.next()){
                movie = rs.getString("title");
                movie = movie.replace("-"," ");
                movies.add(movie);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return movies;
    }

    @Override
    public int getPrice(String title){
        String getPriceQuery = "Select * from movies where title="+"'"+title+"'";
        int price = 0;
        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(getPriceQuery);

            while (rs.next()){
                price = rs.getInt("price");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return price;
    }

    

    @Override
    public boolean hallEmpty(String hallName,String date,String movieName){
        boolean empty = true;

        String hallEmptyQuery = "Select * from "+hallName;

        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(hallEmptyQuery);

            while (rs.next()){

                String dateTime = rs.getString("date");
                String title = rs.getString("movieTitle");

                if(date.equals(dateTime) || title.equals(movieName)){
                    empty = false;
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return empty;
    }

}