/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author Julian David
 */
public class UsuarioDAO {

    private static final List<UsuarioDTO> lista = new ArrayList<>();

    public UsuarioDAO() {

    }

    public void datosPrueba() {
        UsuarioDTO usu1 = new UsuarioDTO(1, "jose", "jose@hot.com", "12345", UsuarioDTO.ADMINISTRADOR);
        UsuarioDTO usu2 = new UsuarioDTO(1, "jose", "jose@hot.com", "12345", UsuarioDTO.CLIENTE);
        UsuarioDTO usu3 = new UsuarioDTO(1, "jose", "jose@hot.com", "12345", UsuarioDTO.VENDEDOR);
        lista.add(usu1);
        lista.add(usu2);
        lista.add(usu3);

    }

    public boolean crear(UsuarioDTO c) {
        if (c != null) {
            lista.add(c);
            return true;
        } else {
            return false;
        }
    }

    public List<UsuarioDTO> readAll() {
        List<UsuarioDTO> obj = null;
        obj = UsuarioDAO.lista;
        return obj;
    }
}
