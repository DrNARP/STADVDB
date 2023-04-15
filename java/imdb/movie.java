package java.imdb;

import java.math.BigDecimal;
import java.sql.*;

public class movie {
    private int id;
    private String name;
    private int year;
    private BigDecimal rank;

    public movie() {

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
