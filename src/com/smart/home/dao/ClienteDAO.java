/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import com.smart.home.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TAREA;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa"; 
    private static final String PASSWORD = "123"; 

    private Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método seguro: inserta solo si no existe dniRuc
    public void insertarCliente(Cliente cliente) {
        String sql = "MERGE INTO Cliente AS target " +
                     "USING (SELECT ? AS dniRuc, ? AS nombre, ? AS apellido, ? AS telefono, ? AS correo) AS source " +
                     "ON target.dniRuc = source.dniRuc " +
                     "WHEN NOT MATCHED THEN " +
                     "INSERT (dniRuc, nombre, apellido, telefono, correo) " +
                     "VALUES (source.dniRuc, source.nombre, source.apellido, source.telefono, source.correo);";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getDniRuc());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getCorreo());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Cliente insertado correctamente: " + cliente.getDniRuc());
            } else {
                System.out.println("El cliente ya existe con DNI/RUC: " + cliente.getDniRuc());
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> obtenerClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";

        try (Connection con = getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dniRuc"),
                        rs.getString("telefono"),
                        rs.getString("correo")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener clientes: " + e.getMessage());
        }
        return lista;
    }
}


