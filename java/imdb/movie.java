package java.imdb;

import java.math.BigDecimal;
import java.sql.*;

public class Movie {
    private int id;
    private String name;
    private int year;
    private BigDecimal rank;

    public Movie(id, name, year, rank) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rank = rank;
    }

    public int modRecord() {
        try {
            Connection conn;

            conn = DriverManager.getConnection("");

            System.out.println("Connection Successful");

            PreparedStatement pstmt = conn.prepareStatement("UPDATE movie " +
                                                            "SET rank = ?" +
                                                            "WHERE id = ?");

            return 1;
        } catch (Exception e) {
            // TODO: handle exception
            return 0;
        }
    }
}
