/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login {

    public void validarUsuario(JTextField usuario, JPasswordField contraseña) {
        String consulta = "SELECT * FROM Usuario WHERE nombre = ? AND contraseña = ?";

        try (
            Connection con = Conexion.getConnection();               // usa tu clase Conexion
            PreparedStatement ps = con.prepareStatement(consulta)          // crea la consulta
        ) {
            
            String contra = String.valueOf(contraseña.getPassword());
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "USUARIO CORRECTO");
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL VALIDAR USUARIOS: " + e.toString());
        }
    }
}