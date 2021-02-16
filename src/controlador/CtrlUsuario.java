/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Usuario;

/**
 *
 * @author quizh
 */
public class CtrlUsuario {
    /**
     * Metodo que permite igresar la información del cliente
     *
     * @param usuario  
     * @param pasword
     */
    public boolean ingresarCliente(String usuario, String contrasena) {
        String[] clientes = obtenerClientes();
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(usuario) && clientes[i + 1].equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que permite guardar la informacón de persona
     *
     * @param personas
     */
    public void guardarClientes(ArrayList<Persona> personas) {
        FileWriter fw;
        try {
            fw = new FileWriter("Clientes.txt");
            for (Persona persona : personas) {
                fw.write(persona.getUsuario() + ":" + persona.getClave()+ ":");
            }
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear Archivo", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo que permite obtener la informacón de persona para guardar en el archivo de texto
     *
     */
    public String[] obtenerClientes() {
        StringTokenizer tokenizer;
        File archivo;
        BufferedReader br;
        String line;
        String[] users = null;
        try {
            archivo = new File("Clientes.txt");
            br = new BufferedReader(new FileReader(archivo));
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                tokenizer = new StringTokenizer(line, ":");
                users = new String[tokenizer.countTokens()];
                while (tokenizer.hasMoreTokens()) {
                    for (int i = 0; i < users.length; i++) {
                        users[i] = tokenizer.nextToken();
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer Archivo\nEl archivo no existe", "", JOptionPane.ERROR_MESSAGE);
        }
        return users;
    }
}
