/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TuBD;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "123"; // tu clave real

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            throw e;
        }
    }
}