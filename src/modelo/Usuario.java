/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author quizh
 */
public class Usuario {
    private String idCuenta;
    private String Usuario;
    private String clave;
    
    public Usuario() {
    }

    public Usuario(String idCuenta, String Usuario, String clave) {
        this.idCuenta = idCuenta;
        this.Usuario = Usuario;
        this.clave = clave;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
