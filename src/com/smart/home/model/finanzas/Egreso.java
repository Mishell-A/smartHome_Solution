
package com.smart.home.model.finanzas;


public class Egreso extends MovimientoFinanciero{

    public Egreso(String fecha, String tipo, String categoria, String descripcion, double monto) {
        super(fecha, tipo, categoria, descripcion, monto);
    }
    
    @Override
    public String mostrarTipoMovimiento() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
    
}
