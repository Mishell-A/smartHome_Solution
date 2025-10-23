
package com.smart.home.model.finanzas;

public abstract class MovimientoFinanciero {
    private String fecha;
    private String tipo;
    private String categoria;
    private String descripcion;
    private double monto;

    public MovimientoFinanciero() {
    }

    public MovimientoFinanciero(String fecha, String tipo, String categoria, String descripcion, double monto) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public abstract String mostrarTipoMovimiento();
}
