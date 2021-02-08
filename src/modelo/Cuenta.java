package modelo;

public class Cuenta {

    private String idCuenta;
    private String Usuario;
    private String clave;
    private Persona persona;

    public Cuenta() {
    }

    public Cuenta(String idCuenta, String Usuario, String clave, Persona persona) {
        this.idCuenta = idCuenta;
        this.Usuario = Usuario;
        this.clave = clave;
        this.persona = persona;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean iniciarSesion() {
        return false;
    }

    public void crerCuenta() {

    }
}
