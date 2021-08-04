package managerClasses;

import MainClasses.*;
import java.sql.*;
import java.util.*;

public class UserManager implements IUser{

    private static final String dbUrl = "jdbc:mysql://localhost:3306/project";
    private static final String dbUserName = "root";
    private static final String dbPassword = "";


    private boolean registerBool = false;
    private boolean loginBool = false;

    private String gelenUser;
    private String gelenPass;
    

    private static Connection conn;
    private static Statement statement = null;
    private static PreparedStatement prep;
    
    
    private static ArrayList<String> movies;


    public UserManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver Not Found");
        }

        try {
            conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        } catch (SQLException throwable) {
            System.out.println("Did not Connect");
        }
    }

    @Override
    public boolean register(GeneralUser user) {

        String registerQuery = "Insert Into users (name,mail,phoneNumber,username,password) VALUES (?,?,?,?,?)";

        try {
            prep = conn.prepareStatement(registerQuery);

            prep.setString(1, user.getName());
            prep.setString(2, user.getMail());
            prep.setString(3, user.getPhoneNumber());
            prep.setString(4, user.getUsername());
            prep.setString(5, user.getPassword());

            prep.executeUpdate();

            registerBool = true;

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return registerBool;
    }

    @Override
    public boolean login(String username, String password) {
        String loginQuery = "Select username,password from users";

        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(loginQuery);

            while (rs.next()) {
                gelenUser = rs.getString("username");
                gelenPass = rs.getString("password");

                if (username.equals(gelenUser) && password.equals(gelenPass)) {
                    loginBool = true;
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return loginBool;
    }
    
    
    
    
    @Override
    public ArrayList<String> lookMovie(String hallName){
        ArrayList<String> hallMovies = new ArrayList<>();
        String lookHallQuery = "Select * from " + hallName;
        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(lookHallQuery);
            String movie;
            while (rs.next()) {
                
                movie = rs.getString("movieTitle");
                hallMovies.add(movie);
                             
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return hallMovies;
    }
    


    @Override
    public ArrayList<Movie> search(String searchQuery) {
        ArrayList<Movie> result = new ArrayList<Movie>();
        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(searchQuery);
            String title2, language2, type, publishDate;
            int price;
            
            while (rs.next()) {
                
                title2 = rs.getString("title");
                language2 = rs.getString("language");
                type = rs.getString("type");
                publishDate = rs.getString("publishDate");
                price = rs.getInt("price");

                result.add(new Movie(title2,language2,type,publishDate,price));
            }
            
            return result;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        
    }

    @Override
    public boolean checkMovieInHall(String title,String hallName){
        boolean checked = false;

        String checkMovieInHallQuery = "Select * from "+hallName;

        try {
            statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(checkMovieInHallQuery);

            while (rs.next()){
                String dbTitle = rs.getString("movieTitle");
                if (title.equals(dbTitle)){
                    checked = true;
                }
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return checked;
    }

}
