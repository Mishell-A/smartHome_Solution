
package com.smart.home.model;

import java.util.ArrayList;
import java.util.List;


public class Producto {
    private int ID;
    private String Estado;
    private int StokActu;
    private int StokMin;
    private String Nombre;
    private double PrecioUni;
    private String Categoria;
    private List <Producto> MiListProducto;
    

    public Producto(int ID, String Estado, int StokActu, int StokMin, String Nombre, double PrecioUni, String Categoria) {
        this.ID = ID;
        this.Estado = Estado;
        this.StokActu = StokActu;
        this.StokMin = StokMin;
        this.Nombre = Nombre;
        this.PrecioUni = PrecioUni;
        this.Categoria = Categoria;
        
        this.MiListProducto = new ArrayList<Producto>();
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getStokActu() {
        return StokActu;
    }

    public void setStokActu(int StokActu) {
        this.StokActu = StokActu;
    }

    public int getStokMin() {
        return StokMin;
    }

    public void setStokMin(int StokMin) {
        this.StokMin = StokMin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioUni() {
        return PrecioUni;
    }

    public void setPrecioUni(double PrecioUni) {
        this.PrecioUni = PrecioUni;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public void AgregarProducto(Producto p){
        MiListProducto.add(p);
    }
    
}
