/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;

/**
 *
 * @author quizh
 */
public class CtrlFrmRegistro implements ActionListener {

    Inicio inicio;
    Registro register;
    CtrlUsuario ctrlUsuario;
    ArrayList<Persona> clientes = new ArrayList<>();

    /**
     * Constructor de CtrlFrmRegistro 
     *
     */
    public CtrlFrmRegistro(Inicio inicio, Registro register, CtrlUsuario ctrlUsuario) {
        this.inicio = inicio;
        this.register = register;
        this.ctrlUsuario = ctrlUsuario;
        this.register.btRegister.addActionListener(this);
    }

    /**
     * Metodo que permite registrar la informacón de persona
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == register.btRegister) {
            if (register.txtUserName.getText().length() > 0 && register.txtUserLastN.getText().length() > 0 && register.txtUseerUser.getText().length() > 0 && register.txtPasword.getText().length() > 0 && register.txtPaswordConfir.getText().length() > 0) {
                String nombre = register.txtUserName.getText();
                String apellido = register.txtUserLastN.getText();
                String usuario = register.txtUseerUser.getText();
                String clave = register.txtPasword.getText();
                String pasword2 = register.txtPaswordConfir.getText();
                if (clave.equals(pasword2)) {
                    Persona cliente = new Persona(nombre, apellido, usuario, clave);
                    clientes.add(cliente);
                    ctrlUsuario.guardarClientes(clientes);
                    inicio.setVisible(true);
                    inicio.revalidate();
                    register.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales", "", JOptionPane.ERROR_MESSAGE);
                    register.txtPasword.setText("");
                    register.txtPaswordConfir.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Faltan datos por llenar", "", JOptionPane.ERROR_MESSAGE);
                
            }

        }
    }

}
