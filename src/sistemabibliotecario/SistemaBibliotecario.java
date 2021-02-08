/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Documento;

/**
 *
 * @author quizh
 */
public class SistemaBibliotecario {
    static Documento d;
    static ArrayList<Documento> docs;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        docs = new ArrayList<>();
        int op ;
        int tipo = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione que quiere realizar\n1. Ingresar Documento\n2. Modificar\n3. Eliminar"));

            switch (op) {
                case 1:
                    int id = 1;
                    id++;
                    String Usuario = JOptionPane.showInputDialog(null, "Ingrese Usuario");
                    String clave = JOptionPane.showInputDialog(null, "Ingrese autor");
//                    Usuario c  = new Usuario(id, Usuario, clave, persona);
//                    String codigo = JOptionPane.showInputDialog(null, "Ingrese codigo");
//                    String titulo = JOptionPane.showInputDialog(null, "Ingrese titulo");
//                    String autor = JOptionPane.showInputDialog(null, "Ingrese autor");
//                    String idioma = JOptionPane.showInputDialog(null, "Ingrese idioma");
//                    String Año = JOptionPane.showInputDialog(null, "Ingrese año");
//                    String pais = JOptionPane.showInputDialog(null, "Ingrese pais");
//                    int est = Integer.parseInt(JOptionPane.showInputDialog(null, "1. disponible\n2. No disponible"));
//
//                    boolean estado = false;
//                    if (est == 1 || est == 2) {
//                        if (est == 1) {
//                            estado = true;
//                        } else {
//                            estado = false;
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "El estado seleccionado no es valido");
//                    }
//
//                    tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Libro\n2. Tesis"));
//                    if (tipo == 1 || tipo == 2) {
//                        d = new Documento(codigo, titulo, autor, idioma, Año, pais, estado, tipo);
//                        d.ingresarDocumento();
//                    } else {
//                        JOptionPane.showMessageDialog(null, "El tipo seleccionado no es valido");
//                    }
//                    docs.add(d);

                    break;
                case 2:
                    
//                    if (tipo == 1) {
//                        for (Documento listDocumento : docs) {
//                            System.out.println("codigo: " + listDocumento.getCodigo());
//                            System.out.println("titulo: " + listDocumento.getTitulo());
//                            System.out.println("autor: " + listDocumento.getAutor());
//                            System.out.println("idioma: " + listDocumento.getIdioma());
//                            System.out.println("año: " + listDocumento.getAño());
//                            System.out.println("pais: " + listDocumento.getPais());
//                            System.out.println("estado: " + listDocumento.isEstado());
//                            System.out.println("volumen: " + listDocumento.getLibro().getVolumen());
//                            System.out.println("editorial: " + listDocumento.getLibro().getEditorial());
//                        }
//                    } else {
//                        for (Documento listDocumento : docs) {
//                            System.out.println("codigo: " + listDocumento.getCodigo());
//                            System.out.println("titulo: " + listDocumento.getTitulo());
//                            System.out.println("autor: " + listDocumento.getAutor());
//                            System.out.println("idioma: " + listDocumento.getIdioma());
//                            System.out.println("año: " + listDocumento.getAño());
//                            System.out.println("pais: " + listDocumento.getPais());
//                            System.out.println("estado: " + listDocumento.isEstado());
//                            System.out.println("carrera: " + listDocumento.getTesis().getCarrera_tes());
//                            System.out.println("director: " + listDocumento.getTesis().getDirector_tes());
//                        }
//                    }
                    break;
                case 3:
                    break;
                default:
                    break;

            }
        } while (op != 4);

    }
}
