/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    public static Connection connect() throws Exception {

        Connection conn = DriverManager.getConnection(
                "jdbc:sqlite:seblak.db"
        );

        Statement stmt = conn.createStatement();

        stmt.executeUpdate(
                "CREATE TABLE IF NOT EXISTS pesanan ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nama TEXT,"
                + "level_pedas TEXT,"
                + "topping TEXT,"
                + "total_harga INTEGER)"
        );

        stmt.close();

        return conn;
    }
}
