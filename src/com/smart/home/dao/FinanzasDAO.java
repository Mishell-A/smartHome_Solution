package com.smart.home.dao;
//import java.sql.*;
import java.util.*;
import com.smart.home.model.finanzas.*;

public class FinanzasDAO {
    // Lista temporal para simular base de datos
    private static List<MovimientoFinanciero> listaTemporal = new ArrayList<>();

    // Insertar movimiento (simulado)
    public boolean insertarMovimiento(MovimientoFinanciero mov) {
        listaTemporal.add(mov);
        return true; // simula que se guardó correctamente
    }

    // Eliminar movimiento (por índice o ID simulado)
    public boolean eliminarMovimiento(int index) {
        if (index >= 0 && index < listaTemporal.size()) {
            listaTemporal.remove(index);
            return true;
        }
        return false;
    }

    // Listar movimientos (simulado con filtro)
    public List<MovimientoFinanciero> listarMovimientos(String filtro) {
        if (filtro == null || filtro.isEmpty()) {
            return new ArrayList<>(listaTemporal);
        }

        List<MovimientoFinanciero> filtrada = new ArrayList<>();
        for (MovimientoFinanciero m : listaTemporal) {
            if (m.getTipo().equalsIgnoreCase(filtro)) {
                filtrada.add(m);
            }
        }
        return filtrada;
    }
}
