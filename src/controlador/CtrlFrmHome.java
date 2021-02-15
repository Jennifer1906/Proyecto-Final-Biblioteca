package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;

public class CtrlFrmHome implements ActionListener {

    Home home;
    Registro register;
    CtrlDocs ctrlDocs;
    CtrlUsuario ctrlUsuario;
    //ArrayList<Producto> productos = ctrlAdministrador.getProductos();
    ArrayList<Persona> clientes;

    public CtrlFrmHome(Home home, CtrlDocs ctrlProducto, CtrlUsuario ctrlUsuario, Registro register) {
        this.home = home;
        this.register = register;
        this.ctrlUsuario = ctrlUsuario;
        this.ctrlDocs = ctrlProducto;
        this.home.btAgregar.addActionListener(this);
        this.home.btEliminar.addActionListener(this);
        this.home.btModificar.addActionListener(this);
        this.home.btClientes.addActionListener(this);
        this.home.btHome.addActionListener(this);
        this.home.btAggPAgg.addActionListener(this);
        this.home.btDev.addActionListener(this);
        this.home.btGuardarPres.addActionListener(this);
        this.home.btNuevoCliente.addActionListener(this);
        this.home.cbxTipoDoc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home.btAgregar) {
            home.panelAgg.setBackground(new Color(180, 81, 72));
            home.panelEliminar.setBackground(new Color(72, 4, 3));
            home.panelMod.setBackground(new Color(72, 4, 3));
            home.panelClientes.setBackground(new Color(72, 4, 3));
            home.panelHome.setBackground(new Color(72, 4, 3));

            home.jLayeredPane1.removeAll();
            home.jLayeredPane1.add(home.Pdocs);
            home.jLayeredPane1.repaint();
            home.jLayeredPane1.revalidate();
        }
        if (e.getSource() == home.btEliminar) {
            home.panelEliminar.setBackground(new Color(180, 81, 72));
            home.panelAgg.setBackground(new Color(72, 4, 3));
            home.panelMod.setBackground(new Color(72, 4, 3));
            home.panelClientes.setBackground(new Color(72, 4, 3));
            home.panelHome.setBackground(new Color(72, 4, 3));

            home.jLayeredPane1.removeAll();
            home.jLayeredPane1.add(home.pDevolucion);
            home.jLayeredPane1.repaint();
            home.jLayeredPane1.revalidate();
        }
        if (e.getSource() == home.btClientes) {
            home.panelEliminar.setBackground(new Color(72, 4, 3));
            home.panelAgg.setBackground(new Color(72, 4, 3));
            home.panelMod.setBackground(new Color(72, 4, 3));
            home.panelClientes.setBackground(new Color(180, 81, 72));
            home.panelHome.setBackground(new Color(72, 4, 3));

            home.jLayeredPane1.removeAll();
            home.jLayeredPane1.add(home.pClientes);
            home.jLayeredPane1.repaint();
            home.jLayeredPane1.revalidate();
        }
        if (e.getSource() == home.btModificar) {
            home.panelEliminar.setBackground(new Color(72, 4, 3));
            home.panelAgg.setBackground(new Color(72, 4, 3));
            home.panelMod.setBackground(new Color(180, 81, 72));
            home.panelClientes.setBackground(new Color(72, 4, 3));
            home.panelHome.setBackground(new Color(72, 4, 3));

            home.jLayeredPane1.removeAll();
            home.jLayeredPane1.add(home.pPrestamo);
            home.jLayeredPane1.repaint();
            home.jLayeredPane1.revalidate();
        }
        if (e.getSource() == home.btHome) {
            home.panelEliminar.setBackground(new Color(72, 4, 3));
            home.panelAgg.setBackground(new Color(72, 4, 3));
            home.panelMod.setBackground(new Color(72, 4, 3));
            home.panelClientes.setBackground(new Color(72, 4, 3));
            home.panelHome.setBackground(new Color(180, 81, 72));

            home.jLayeredPane1.removeAll();
            home.jLayeredPane1.add(home.pHome);
            home.jLayeredPane1.repaint();
            home.jLayeredPane1.revalidate();
            limpiar(home.tbClientesHome);
            limpiar(home.tbProductosHome);
            cargarTablaClientes();
            cargarTablaDocs();
        }

        if (e.getSource() == home.cbxTipoDoc) {
            if (home.cbxTipoDoc.getSelectedIndex() == 0) {
                home.jLabel16.setText("Carrera:");
                home.jLabel20.setText("Director:");
                home.txtdato1.setText("");
                home.txtdato2.setText("");
            } else {
                home.jLabel16.setText("Volumen:");
                home.jLabel20.setText("Editorial:");
                home.txtdato1.setText("");
                home.txtdato2.setText("");
            }
        }
        if (e.getSource() == home.btAggPAgg) {
            if (home.txtCodigo.getText().length() > 0 && home.txtTitulo.getText().length() > 0 && home.txtAutor.getText().length() > 0 && home.txtIdioma.getText().length() > 0 && home.txtAño.getText().length() > 0 && home.txtPais.getText().length() > 0 && home.txtdato1.getText().length() > 0 && home.txtdato2.getText().length() > 0) {
                String codigo = home.txtCodigo.getText();
                String titulo = home.txtTitulo.getText();
                String autor = home.txtAutor.getText();
                String idioma = home.txtIdioma.getText();
                String año = home.txtAño.getText();
                String pais = home.txtPais.getText();
                String dato1 = home.txtdato1.getText();
                String dato2 = home.txtdato2.getText();

                if (home.cbxTipoDoc.getSelectedIndex() == 0) {
                    Libro libro = new Libro(dato1, dato2);
                    ctrlDocs.registrarDocL(codigo, titulo, autor, idioma, año, pais, libro);
                    ctrlDocs.Write(ctrlDocs.getDocumentos());
                    limpiar(home.tbDocs);
                    cargarTablaDocs();
                } else {
                    Tesis tesis = new Tesis(dato1, dato2);
                    ctrlDocs.registrarDocT(codigo, titulo, autor, idioma, año, pais, tesis);
                    ctrlDocs.Write(ctrlDocs.getDocumentos());
                    limpiar(home.tbDocs);
                    cargarTablaDocs();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan datos por llenar", "", JOptionPane.ERROR_MESSAGE);
            }
        }

//        if (e.getSource() == home.btGuardarPres) {
//            int index = home.tbProductosMod.getSelectedRow();
//            String nombre = home.codigopres.getText();
//            String marca = home.fechapres.getText();
//            int cantidad = Integer.parseInt(home.txtCantidadMod.getText());
//            double precio = Double.parseDouble(home.txtPrecioMod.getText());
//            ctrlAdministrador.actualizarProducto(index, nombre, marca, cantidad, precio);
//            limpiar(home.tbProductosMod);
//            cargarTablaDocs();
//        }
//
//        if (e.getSource() == home.btNuevoCliente) {
//            register.setVisible(true);
//            register.revalidate();
//            home.dispose();
//        }

    }

    private void cargarTablaDocs() {
        DefaultTableModel modelo = (DefaultTableModel) home.tbDocs.getModel();
        ArrayList<Documento> documentos = ctrlDocs.getDocumentos();

        try {
            for (int i = 0; i < documentos.size(); i++) {
                if (documentos.get(i).getTipo() == 0) {
                    modelo.addRow(new Object[]{documentos.get(i).getCodigo(), documentos.get(i).getTitulo(), documentos.get(i).getAutor(), documentos.get(i).getIdioma(), documentos.get(i).getAño(), documentos.get(i).getPais(), documentos.get(i).getTipo(), documentos.get(i).getLibro().getEditorial(), documentos.get(i).getLibro().getVolumen()});
                } else {
                    modelo.addRow(new Object[]{documentos.get(i).getCodigo(), documentos.get(i).getTitulo(), documentos.get(i).getAutor(), documentos.get(i).getIdioma(), documentos.get(i).getAño(), documentos.get(i).getPais(), documentos.get(i).getTipo(), documentos.get(i).getTesis().getCarrera_tes(), documentos.get(i).getTesis().getDirector_tes()});
                }
            }
            home.tbDocs.setModel(modelo);
        } catch (Exception e) {
        }
    }

    private void cargarTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) home.tbClientesHome.getModel();
        try {
            for (int i = 0; i < clientes.size(); i++) {
                modelo.addRow(new Object[]{clientes.get(i).getIdPersona(), clientes.get(i).getNombres(), clientes.get(i).getEdad(), clientes.get(i).getUsuario()});
            }
            home.tbClientesHome.setModel(modelo);
            home.tbClientesPClientes.setModel(modelo);
        } catch (Exception e) {
        }
    }

    private void limpiar(JTable tabla) {
        try {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
}
