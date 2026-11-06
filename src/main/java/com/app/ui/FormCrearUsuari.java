/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.app.ui;

import com.app.model.GestorLloguers;
import com.app.model.Usuari;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class FormCrearUsuari extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCrearUsuari.class.getName());

    /**
     * Creates new form FormCrearUsuari
     */
    public FormCrearUsuari(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    aplicarIdioma();
 
    java.time.format.DateTimeFormatter format = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
    jTextFieldDataR.setText(java.time.LocalDate.now().format(format));
}
private void aplicarIdioma() {
    java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com.app.resources.Bundle", java.util.Locale.getDefault());

    // 1. Títol de la finestra i capçalera
    if (bundle.containsKey("usuari.titol")) {
        setTitle(bundle.getString("usuari.titol"));
        jLabelTitol.setText(bundle.getString("usuari.titol"));
    }

    // 2. Etiquetes dels camps de text
    if (bundle.containsKey("usuari.nom")) jLabelNom.setText(bundle.getString("usuari.nom"));
    if (bundle.containsKey("usuari.cognom1")) jLabelCognom1.setText(bundle.getString("usuari.cognom1"));
    if (bundle.containsKey("usuari.cognom2")) jLabelCognom2.setText(bundle.getString("usuari.cognom2"));
    if (bundle.containsKey("usuari.dni")) jLabelDNI.setText(bundle.getString("usuari.dni"));
    if (bundle.containsKey("usuari.tel")) jLabelTel.setText(bundle.getString("usuari.tel"));
    if (bundle.containsKey("usuari.data_registre")) jLabelDataR.setText(bundle.getString("usuari.data_registre"));

    // 3. Botons d'acció
    if (bundle.containsKey("boto.confirmar")) jButtonConf.setText(bundle.getString("boto.confirmar"));
    if (bundle.containsKey("boto.cancelar")) jButtonCanc.setText(bundle.getString("boto.cancelar"));
}    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitol = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelCognom1 = new javax.swing.JLabel();
        jLabelCognom2 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelDataR = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldCog1 = new javax.swing.JTextField();
        jTextFieldCog2 = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldDataR = new javax.swing.JTextField();
        jButtonConf = new javax.swing.JButton();
        jButtonCanc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTitol.setForeground(new java.awt.Color(102, 153, 255));
        jLabelTitol.setText("Crear Usuari");

        jLabelNom.setText("Nom:");

        jLabelCognom1.setText("1er Cognom:");

        jLabelCognom2.setText("2n Cognom:");

        jLabelDNI.setText("DNI:");

        jLabelTel.setText("Telèfon:");

        jLabelDataR.setText("Data de Registre:");

        jTextFieldNom.addActionListener(this::jTextFieldNomActionPerformed);

        jTextFieldCog1.addActionListener(this::jTextFieldCog1ActionPerformed);

        jTextFieldDNI.addActionListener(this::jTextFieldDNIActionPerformed);

        jButtonConf.setBackground(new java.awt.Color(102, 255, 102));
        jButtonConf.setText("Confirmar");
        jButtonConf.addActionListener(this::jButtonConfActionPerformed);

        jButtonCanc.setBackground(new java.awt.Color(204, 0, 0));
        jButtonCanc.setText("Cancel·lar");
        jButtonCanc.addActionListener(this::jButtonCancActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataR, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCognom1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNom)
                                    .addComponent(jTextFieldCog1)
                                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCog2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextFieldDataR, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonCanc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitol, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitol)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelCognom1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCognom2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDataR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCanc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCog1ActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jButtonConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfActionPerformed
        // TODO add your handling code here:
        String nom = jTextFieldNom.getText().trim();
        String cog1 = jTextFieldCog1.getText().trim();
        String cog2 = jTextFieldCog2.getText().trim();
        String dni = jTextFieldDNI.getText().trim();
        String tel = jTextFieldTel.getText().trim();
        
        //Validacoó des camps
        if(nom.isEmpty()|| cog1.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR De Validació, ompleix els camps", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        String cognoms = (cog1 + " " + cog2).trim();
        
        com.app.model.Usuari nouUsuari = new com.app.model.Usuari(nom, cognoms);
        com.app.model.GestorLloguers.getInstance().afegirUsuari(nouUsuari);
        javax.swing.JOptionPane.showMessageDialog(this, "Usuari registrat correctament", "Èxit", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
    }//GEN-LAST:event_jButtonConfActionPerformed

    private void jButtonCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCanc;
    private javax.swing.JButton jButtonConf;
    private javax.swing.JLabel jLabelCognom1;
    private javax.swing.JLabel jLabelCognom2;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDataR;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelTitol;
    private javax.swing.JTextField jTextFieldCog1;
    private javax.swing.JTextField jTextFieldCog2;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDataR;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
