package controlador;

import vista.*;

public class Main {
    
    public static void main(String[] args) {
        Home home = new Home();
        Inicio inicio = new Inicio();
        Registro register = new Registro();
        CtrlDocs ctrlDocs = new CtrlDocs();
        CtrlUsuario ctrlUsuario = new CtrlUsuario();
        
        CtrlFrmHome frmHome = new CtrlFrmHome(home, ctrlDocs, ctrlUsuario, register);
        CtrlFrmLogin ctrlFrmLogin = new CtrlFrmLogin(ctrlUsuario, inicio, register, home);
        CtrlFrmRegistro ctrlFrmRegister = new CtrlFrmRegistro(inicio, register, ctrlUsuario);
        inicio.setVisible(true);
       
    }
    
}
