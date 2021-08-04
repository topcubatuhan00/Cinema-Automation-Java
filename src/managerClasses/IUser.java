package managerClasses;

import MainClasses.*;
import java.util.ArrayList;

public interface IUser {
    boolean register(GeneralUser user);
    boolean login(String username, String password);
    ArrayList<String> lookMovie(String hallName);
    ArrayList<Movie> search(String searchQuery);
    boolean checkMovieInHall(String title,String hallName);
}
