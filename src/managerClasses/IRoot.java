package managerClasses;

import MainClasses.Hall;
import MainClasses.Movie;
import java.util.ArrayList;

public interface IRoot {
    
    boolean addMovie(Movie movie);
    void deleteMovie(String movieTitle);
    boolean addMovieInHall(Hall hall, String movieName,String date,String startTime,String finishTime,int price);
    boolean deleteMovieInHall(String hallName,String movieTitle);
    ArrayList<String> getMovie();
    int getPrice(String title);
    boolean hallEmpty(String hallName,String date,String movieName);
    
}
