/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDAO {
    private Connection con;

    public ProductoDAO(Connection con) {
        this.con = con;
    }

    public void insertarProducto(String nombre, String descripcion, double precio, int stock) {
        String sql = "INSERT INTO Producto (nombre, descripcion, precio, stock) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.executeUpdate();
            System.out.println("Producto agregado: " + nombre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarProductos() {
        String sql = "SELECT * FROM Producto";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   " | Nombre: " + rs.getString("nombre") +
                                   " | Descripción: " + rs.getString("descripcion") +
                                   " | Precio: " + rs.getDouble("precio") +
                                   " | Stock: " + rs.getInt("stock"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

