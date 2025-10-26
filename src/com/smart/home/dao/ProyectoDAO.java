package com.smart.home.dao;

import com.smart.home.model.Proyecto;
import java.util.ArrayList;
import java.util.List;

public class ProyectoDAO {
    
    private List<Proyecto> proyectos = new ArrayList<>();

    public List<Proyecto> listarProyectos() {
        return proyectos;
    }
    
    public boolean verificarIdUnico(int id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getID() == id) {
                return false; // El ID ya existe
            }
        }
        return true; // El ID es único
    }
    
    public boolean insertarProyecto(Proyecto p) {
        for (Proyecto pr : proyectos) {
            if (pr.getID() == p.getID()) return false; // Evita duplicados
        }
        proyectos.add(p);
        return true;
    }

    public boolean actualizarProyecto(Proyecto p) {
        for (int i = 0; i < proyectos.size(); i++) {
            if (proyectos.get(i).getID() == p.getID()) {
                proyectos.set(i, p);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProyecto(int id) {
        return proyectos.removeIf(p -> p.getID() == id);
    }

    public Proyecto buscarPorEstado(String estado) {
        for (Proyecto p : proyectos) {
            if (p.getEstado().equalsIgnoreCase(estado)) return p;
        }
        return null;
    }
}
