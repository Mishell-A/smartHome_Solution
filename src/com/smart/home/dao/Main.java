/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.dao;
import com.smart.home.model.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        try {
            Cliente cliente1 = new Cliente("Carlos", "Ramirez", "99988877", "987654321", "carlos@mail.com");
            Cliente cliente2 = new Cliente("Maria", "Lopez", "12344321", "912345678", "maria@mail.com");

            clienteDAO.insertarCliente(cliente1);
            clienteDAO.insertarCliente(cliente2);
        } catch (Exception e) {
            System.out.println("️Error al insertar clientes: " + e.getMessage());
        }

        try {
            System.out.println("\nLista de clientes en la BD:");
            List<Cliente> clientes = clienteDAO.obtenerClientes();
            for (Cliente c : clientes) {
                System.out.println(
                    "ID: " + c.getId() +
                    " | Nombre: " + c.getNombre() +
                    " | Apellido: " + c.getApellido() +
                    " | DNI/RUC: " + c.getDniRuc() +
                    " | Telefono: " + c.getTelefono() +
                    " | Correo: " + c.getCorreo()
                );
            }
        } catch (Exception e) {
            System.out.println("️Error al obtener clientes: " + e.getMessage());
        }
    }
}





