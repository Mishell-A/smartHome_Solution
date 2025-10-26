/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smart.home.dao;

import com.smart.home.model.Usuario;
import java.util.List;

/**
 *
 * @author USER
 */
public interface DaoUser {
    
   public void guardar(Usuario usuario) throws Exception;
   public void editar(Usuario usuario) throws Exception;
   public void eliminar(Usuario usuario) throws Exception;
   public List<Usuario> listar() throws Exception;
}
