/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aury
 */
public class Vehiculo2 extends javax.swing.JFrame {

    /**
     * Creates new form Vehiculo2
     */
    public Vehiculo2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_chasis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_palca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dueño = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cedulaDueño = new javax.swing.JTextField();
        btn_guardar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("VEHICULO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("OTRAS CARACTERÍSTICAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("N° Chasis");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Placa");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Dueño");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cedula del Dueño");

        btn_guardar2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_guardar2.setText("GUARDAR");
        btn_guardar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_guardar2MouseMoved(evt);
            }
        });
        btn_guardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardar2MouseClicked(evt);
            }
        });
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txt_cedulaDueño, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(31, 31, 31))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(42, 42, 42))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_palca, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txt_dueño)
                                    .addComponent(txt_chasis)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_palca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cedulaDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
        String placa = txt_palca.getText();
        int chasis = Integer.parseInt(txt_chasis.getText());
        String dueño = txt_dueño.getText();
        String cedula = txt_cedulaDueño.getText();

        try {
            FileReader texto = new FileReader("informacion_auto.txt");
            BufferedReader bufferedReader = new BufferedReader(texto);

            StringBuilder contenido = new StringBuilder();
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            bufferedReader.close();
              contenido.append("--------OTRAS CARACTERISTICAS------\n");
            contenido.append("Placa: ").append(placa).append("\n");
            contenido.append("Chasis: ").append(chasis).append("\n");
            contenido.append("Dueño: ").append(dueño).append("\n");
            contenido.append("Cédula del Dueño: ").append(cedula).append("\n");
            contenido.append("======================================\n");

            FileWriter texto2 = new FileWriter("informacion_auto.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(texto2);
            bufferedWriter.write(contenido.toString());
            bufferedWriter.close();

            JOptionPane.showMessageDialog(null, "¡Listo!Información guardada.");
            txt_palca.setText("");
            txt_chasis.setText("");
            txt_dueño.setText("");
            txt_cedulaDueño.setText("");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información.");
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////////////////////
        Vehiculo vehiculoFrame = new Vehiculo();
        vehiculoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    private void btn_guardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MouseClicked
        // TODO add your handling code here:
        btn_guardar2.setBackground(Color.PINK);
    }//GEN-LAST:event_btn_guardar2MouseClicked

    private void btn_guardar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardar2MouseMoved
        // TODO add your handling code here:
        btn_guardar2.setBackground(Color.PINK);
    }//GEN-LAST:event_btn_guardar2MouseMoved

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
            java.util.logging.Logger.getLogger(Vehiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehiculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehiculo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cedulaDueño;
    private javax.swing.JTextField txt_chasis;
    private javax.swing.JTextField txt_dueño;
    private javax.swing.JTextField txt_palca;
    // End of variables declaration//GEN-END:variables
}