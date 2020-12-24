/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author quizh
 */
public class FrameInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicio
     */
    public FrameInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        botonBibliotecario = new javax.swing.JButton();
        botonUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(463, 300));
        setMinimumSize(new java.awt.Dimension(463, 300));
        setPreferredSize(new java.awt.Dimension(463, 300));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        jLabel2.setText("SISTEMA BIBLIOTECARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 330, 80);

        botonBibliotecario.setBackground(new java.awt.Color(204, 255, 255));
        botonBibliotecario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonBibliotecario.setText("BIBLIOTECARIO");
        botonBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBibliotecarioActionPerformed(evt);
            }
        });
        getContentPane().add(botonBibliotecario);
        botonBibliotecario.setBounds(160, 180, 150, 25);

        botonUsuario.setBackground(new java.awt.Color(204, 255, 255));
        botonUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonUsuario.setText("USUARIO");
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botonUsuario);
        botonUsuario.setBounds(330, 180, 100, 25);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setText("AUTOR: Condoy Mayuri y Quizhpe Jennifer");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 220, 350, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoUNL.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 70, 320, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/biblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 463, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBibliotecarioActionPerformed
        // TODO add your handling code here:
        LoginBibliotecario ventanaBibliotecario = new LoginBibliotecario();
        ventanaBibliotecario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBibliotecarioActionPerformed

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioSeleccion ventanaSeleccion = new UsuarioSeleccion();
        ventanaSeleccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBibliotecario;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}