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
import modelo.*;
import vista.*;

/**
 *
 * @author quizh
 */
public class CtrlFrmLogin implements ActionListener {

    CtrlUsuario ctrlUsuario;
    ArrayList<Persona> personas = new ArrayList<>();
    Inicio inicio;
    Registro registro;
    Home home;

    /**
     * Constructor de CtrlFrmLogin
     * @param ctrlUsuario
     * @param inicio
     * @param registro
     * @param home
     */
    public CtrlFrmLogin(CtrlUsuario ctrlUsuario, Inicio inicio, Registro registro, Home home) {
        this.ctrlUsuario = ctrlUsuario;
        this.inicio = inicio;
        this.registro = registro;
        this.home = home;
        this.inicio.btLogin.addActionListener(this);
        this.inicio.btRegister.addActionListener(this);
    }

    /**
     * Metodo que permite validar credenciales para acceso al sistema 
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inicio.btRegister) {
            registro.setVisible(true);
            registro.revalidate();
            inicio.dispose();
        }

        if (e.getSource() == inicio.btLogin) {
            if (inicio.txtUserName.getText().length() > 0 && inicio.txtPasword.getText().length() > 0) {
                String user = inicio.txtUserName.getText();
                String pasword = inicio.txtPasword.getText();

                if (ctrlUsuario.ingresarCliente(user, pasword)) {
                    home.setVisible(true);
                    home.revalidate();
                    inicio.dispose();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales invalidas", "", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Metodo que permite limpiar campos de texto
     *
     */
    private void limpiar() {
        inicio.txtUserName.setText("");
        inicio.txtPasword.setText("");
    }
}
