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
    private String nombre;
    private String apellidos;
    private String Usuario;
    private String clave;

    public Persona() {
        idPersona = Persona.id++;
    }

    public Persona(String nombre, String apellidos, String Usuario, String clave) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Usuario = Usuario;
        this.clave = clave;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

