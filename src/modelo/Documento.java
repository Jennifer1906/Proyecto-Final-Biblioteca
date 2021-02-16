package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Documento {

    private String codigo;
    private String titulo;
    private String autor;
    private String idioma;
    private String Año;
    private String pais;
    private boolean estado;
    private int tipo;
    private Libro libro;
    private Tesis tesis;

    public Documento() {
    }

    public Documento(String codigo, String titulo, String autor, String idioma, String Año, String pais, boolean estado, int tipo ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.Año = Año;
        this.pais = pais;
        this.estado = estado;
        this.tipo = tipo;
    }
    public Documento(String codigo, String titulo, String autor, String idioma, String Año, String pais, boolean estado, Libro libro ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.Año = Año;
        this.pais = pais;
        this.estado = estado;
        this.libro = libro;
    }
    public Documento(String codigo, String titulo, String autor, String idioma, String Año, String pais, boolean estado, Tesis tesis ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.Año = Año;
        this.pais = pais;
        this.estado = estado;
        this.tesis = tesis;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

}
