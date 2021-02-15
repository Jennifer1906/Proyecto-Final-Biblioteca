package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Documento;
import modelo.Libro;
import modelo.Tesis;

public class CtrlDocs {

    private ArrayList<Documento> documentos = new ArrayList<>();

    public void Write(ArrayList<Documento> documentos) {
        FileWriter fw;
        try {
            fw = new FileWriter("InfProductos.txt");
            for (Documento documento : documentos) {
                fw.write(documento.getCodigo() + ":" + documento.getTitulo() + ":" + documento.getAutor() + ":" + documento.getIdioma() + ":" + documento.getAño() + ":" + documento.getPais() + ":" + documento.getTipo() + ":\n");
            }
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear Archivo", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String Read() {
        File archivo;
        BufferedReader br;
        String line;
        try {
            archivo = new File("InfProductos.txt");
            br = new BufferedReader(new FileReader(archivo));
            while ((line = br.readLine()) != null) {
                return line;
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer Archivo\nEl archivo no existe", "", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void registrarDocL(String codigo, String titulo, String autor, String idioma, String Año, String pais, Libro libro) {
        Documento doc = new Documento(codigo, titulo, autor, idioma, Año, pais, true, libro);
        documentos.add(doc);
    }

    public void registrarDocT(String codigo, String titulo, String autor, String idioma, String Año, String pais, Tesis tesis) {
        Documento doc = new Documento(codigo, titulo, autor, idioma, Año, pais, true, tesis);
        documentos.add(doc);
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

}
