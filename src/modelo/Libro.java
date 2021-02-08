package modelo;

public class Libro {
    private String volumen;
    private String editorial;

    public Libro() {
    }

    public Libro(String volumen, String editorial) {
        this.volumen = volumen;
        this.editorial = editorial;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
