package java.imdb;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

public class App {
    private String databaseURL = "";
    private ArrayList<Movie> movieList = new ArrayList<>();

    public App() {

    }

    public int loadMovies() {
        try {
            Connection conn = DriverManager.getConnection(databaseURL);
            System.out.println("Connection successful");

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM movies LIMIT 30");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                int year = Integer.parseInt(rs.getString("year"));
                BigDecimal rank = new BigDecimal(rs.getString("rank"));

                Movie movie = new Movie(rs.getString());
                movieList.add(movie);
            }

            rs.close();
            pstmt.close();
            conn.close();
            return 1;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
