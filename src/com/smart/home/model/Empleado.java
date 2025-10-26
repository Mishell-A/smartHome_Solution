package com.smart.home.model;

public class Empleado {
    private String nombre;
    private int dni;
    private String celular;
    private String cargo;
    private String rol;

    
    public Empleado(String nombre, int dni, String celular, String cargo, String rol) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.cargo = cargo;
        this.rol = rol;
    }
    
    
}
