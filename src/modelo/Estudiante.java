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
public class Estudiante {
    private String nombres;
    private String cedula;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private String Email;
    private String Ciclo;
    
    public Estudiante() {
    }

    public Estudiante(String nombres, String cedula, String Apellidos, String Direccion, String Telefono, String Email, String Ciclo) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Ciclo = Ciclo;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

}
