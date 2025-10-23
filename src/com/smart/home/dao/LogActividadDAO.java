/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogActividadDAO {
    private Connection con;

    public LogActividadDAO(Connection con) {
        this.con = con;
    }

    public void registrarActividad(int usuarioId, String accion) {
        String sql = "INSERT INTO LogActividad (usuarioId, accion) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, usuarioId); // OJO: columna es usuarioId
            ps.setString(2, accion);
            ps.executeUpdate();
            System.out.println("Actividad registrada: " + accion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

