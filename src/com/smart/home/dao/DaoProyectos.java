/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smart.home.dao;

import com.smart.home.model.Proyectos;
import java.util.List;

public interface DaoProyectos {
    
    public void guardar (Proyectos proyectos) throws Exception;
    public void editar (Proyectos proyectos) throws Exception;
    public void eliminar (Proyectos proyectos) throws Exception;
    public List<Proyectos> listar()throws Exception;
    
}
