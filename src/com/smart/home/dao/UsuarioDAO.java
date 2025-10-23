/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    public void insertarUsuario(String nombre, String contrasena, String rol) {
        String sql = "INSERT INTO Usuario (nombre, [contraseña], rol) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, contrasena);
            ps.setString(3, rol);
            ps.executeUpdate();
            System.out.println("Usuario agregado: " + nombre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarUsuarios() {
        String sql = "SELECT id, nombre, [contraseña], rol FROM Usuario";
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   " | Nombre: " + rs.getString("nombre") +
                                   " | Contraseña: " + rs.getString("contraseña") +
                                   " | Rol: " + rs.getString("rol"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

