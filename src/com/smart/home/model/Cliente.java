/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.model;

/**
 *
 * @author INTEL
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dniRuc;
    private int telefono;
    private String correo;
    private String tipo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dniRuc, int telefono, String correo, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dniRuc = dniRuc;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDniRuc() {
        return dniRuc;
    }

    public void setDniRuc(int dniRuc) {
        this.dniRuc = dniRuc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
 


}
