/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smart.home.model;

/**
 *
 * @author USER
 */
public class Proyectos {
  private int ID;
  private String Nombre;
  private String Encargado;
  private String Estado;
  private String Fecha;
  private String Fin;


    public Proyectos(int ID, String Nombre, String Encargado, String Estado, String Fecha, String Fin) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Encargado = Encargado;
        this.Estado = Estado;
        this.Fecha = Fecha;
        this.Fin = Fin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getFin() {
        return Fin;
    }

    public void setFin(String Fin) {
        this.Fin = Fin;
    }
  
    

   
    @Override
    public String toString() {
        return "Proyectos{Estado=" + Estado +",Doumento="+ID + ",Nombre="+Nombre+ ",Fecha=" + Fecha + ", Fin=" + Fin +",Encargado="+Encargado+'}';
    }

}
