
package com.smart.home.model.finanzas;

public class Ingreso extends MovimientoFinanciero{

    public Ingreso(String fecha, String tipo, String categoria, String descripcion, double monto) {
        super(fecha, tipo, categoria, descripcion, monto);
    }
    
    @Override
    public String mostrarTipoMovimiento() {
        return "Este movimiento es un Ingreso.";
    }
    
}
