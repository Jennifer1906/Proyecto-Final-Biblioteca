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
public class Persona {

    private static int id = 1;
    private int idPersona;
    private String nombres;
    private String cedula;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String Email;
    private String Usuario;
    private String clave;
    private Rol rol;

    public Persona() {
        idPersona = Persona.id++;
    }

    public Persona(int idPersona, String nombres, String cedula, String apellidos, String direccion, String telefono, String Email, String Usuario, String clave, Rol rol) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Email = Email;
        this.Usuario = Usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public Persona(String nombres, String cedula, String apellidos, String direccion, String telefono, String Email, Rol rol, String Usuario, String clave) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Email = Email;
        this.Usuario = Usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void registrarUsuario() {

    }

    public void modificarUsuario() {

    }

    public void eliminarUsuario() {

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

