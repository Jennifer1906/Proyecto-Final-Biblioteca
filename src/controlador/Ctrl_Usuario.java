/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Usuario;

/**
 *
 * @author quizh
 */
public class Ctrl_Usuario {
    Persona persona;
    Usuario usuario;
    
    public boolean iniciarSecion(Persona persona, Usuario usuario) {
        if (persona.getUsuario().equals(usuario.getUsuario()) && persona.getClave().equals(usuario.getClave())) {
            return true;
        } else {
            return false;
        }
    }
    
    public void crearCuenta(Usuario usuario, Persona persona, String pas) {
        String user = persona.getUsuario();
        String clave = persona.getClave();
        if (persona.getClave().equals(pas)) {
            
            usuario.setClave(clave);
            usuario.setUsuario(user);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
    }
}
