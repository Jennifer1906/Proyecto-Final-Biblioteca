package modelo;

public class Devolucion {

    private String codigo_pres;
    private String fecha_pres;
    private String fecha_dev;
    private boolean estado;
    private boolean sancion;

    public Devolucion() {
    }

    public Devolucion(String codigo_pres, String fecha_pres, String fecha_dev, boolean estado, boolean sancion) {
        this.codigo_pres = codigo_pres;
        this.fecha_pres = fecha_pres;
        this.fecha_dev = fecha_dev;
        this.estado = estado;
        this.sancion = sancion;
    }

    public String getCodigo_pres() {
        return codigo_pres;
    }

    public void setCodigo_pres(String codigo_pres) {
        this.codigo_pres = codigo_pres;
    }

    public String getFecha_pres() {
        return fecha_pres;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }

    public String getFecha_dev() {
        return fecha_dev;
    }

    public void setFecha_dev(String fecha_dev) {
        this.fecha_dev = fecha_dev;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isSancion() {
        return sancion;
    }

    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }

}
