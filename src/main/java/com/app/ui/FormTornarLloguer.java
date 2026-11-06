/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.app.ui;

import com.app.model.GestorLloguers;
import com.app.model.Lloguer;
import com.app.model.Videojoc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class FormTornarLloguer extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormTornarLloguer.class.getName());
    private List<Lloguer> llistaLloguersEnOrdre;

    /**
     * Creates new form FormTornarLloguer
     */
    public FormTornarLloguer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        carregarLloguers();
        configurarEventSeleccio();
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com.app.resources.Bundle");
        aplicarTraduccions(bundle);
    }
    public void carregarLloguers(){
        DefaultTableModel model = (DefaultTableModel) jTableLloguers.getModel();
        model.setRowCount(0);
        
        List<Lloguer> tots = GestorLloguers.getInstance().getLloguers();
        llistaLloguersEnOrdre = new ArrayList<>();
        
        for(Lloguer l : tots){
            if(!l.isRetornat()){
                llistaLloguersEnOrdre.add(l);
            }
        }   
        Collections.sort(llistaLloguersEnOrdre, new Comparator<Lloguer>(){
        @Override
        public int compare(Lloguer l1, Lloguer l2){
        return Integer.compare(l2.getNumRegistre(), l1.getNumRegistre());
    }
    });
    // Carregar files a la taula
        for (Lloguer l : llistaLloguersEnOrdre) {
            model.addRow(new Object[]{
                String.format("%02d", l.getNumRegistre()),
                l.getVideojoc().getTitol(),
                l.getUsuari().toString(),
                l.getPlataforma(),
                l.getDataInici()
            });
        }

        netegarDetalls();
    }

    private void netegarDetalls(){
        jLabelTJoc.setText("-");
        jLabelTUsuari.setText("-");
        jLabelTPlataforma.setText("-");
        jLabelTDinici.setText("-");
    }
    
    private void configurarEventSeleccio() {
        jTableLloguers.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = jTableLloguers.getSelectedRow();
                if (selectedRow != -1 && selectedRow < llistaLloguersEnOrdre.size()) {
                    Lloguer l = llistaLloguersEnOrdre.get(selectedRow);

                    // La 1a columna es queda igual; només canviem els valors de la 2a columna:
                    jLabelTJoc.setText(l.getVideojoc().getTitol());
                    jLabelTUsuari.setText(l.getUsuari().toString());
                    jLabelTPlataforma.setText(l.getPlataforma());
                    jLabelTDinici.setText(l.getDataInici());
                } else {
                    netegarDetalls();
                }
            }
        });
    }
    public void aplicarTraduccions(java.util.ResourceBundle bundle) {
        if (bundle == null) {
            System.out.println("ERROR: El ResourceBundle recibido es NULL");
            return;
        }

        try {
            // 1. Título del diálogo
            this.setTitle(bundle.getString("title.tornar_lloguer"));
            jLabelTLloguer.setText(bundle.getString("title.tornar_lloguer"));
            // 2. Cabeceras de la JTable
            javax.swing.table.JTableHeader header = jTableLloguers.getTableHeader();
            jTableLloguers.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("col.num_registre"));
            jTableLloguers.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("col.titol_joc"));
            jTableLloguers.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("col.usuari"));
            jTableLloguers.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("col.plataforma"));
            jTableLloguers.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("col.data_inici"));
            header.repaint(); // Redibujar la cabecera de la tabla

            // 3. Etiquetes fijas de la columna izquierda (comprueba el nombre de tus JLabels en el Navigator)
            jLabelTJocPerm.setText(bundle.getString("label.t_joc"));
            jLabelTUsuariPerm.setText(bundle.getString("label.t_usuari"));
            jLabelTPlataformaPerm.setText(bundle.getString("label.t_plataforma"));
            jLabelTDiniciPerm.setText(bundle.getString("label.t_data_inici"));

            // 4. Botones
            jButtonConf.setText(bundle.getString("button.marcar_retornat"));
            jButtonCan.setText(bundle.getString("button.tancar"));

        } catch (java.util.MissingResourceException e) {
            System.err.println("Falta una clave en el archivo .properties: " + e.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTLloguer = new javax.swing.JLabel();
        jScrollPaneTLloguer = new javax.swing.JScrollPane();
        jTableLloguers = new javax.swing.JTable();
        jPanelTLloguer = new javax.swing.JPanel();
        jButtonConf = new javax.swing.JButton();
        jButtonCan = new javax.swing.JButton();
        jLabelTJoc = new javax.swing.JLabel();
        jLabelTUsuari = new javax.swing.JLabel();
        jLabelTPlataforma = new javax.swing.JLabel();
        jLabelTDinici = new javax.swing.JLabel();
        jLabelTJocPerm = new javax.swing.JLabel();
        jLabelTUsuariPerm = new javax.swing.JLabel();
        jLabelTPlataformaPerm = new javax.swing.JLabel();
        jLabelTDiniciPerm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTLloguer.setForeground(new java.awt.Color(102, 153, 255));
        jLabelTLloguer.setText("Tornar Lloguer");

        jTableLloguers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Núm. registre", "Títol del joc", "Usuari ", "Plataforma", "Data d'inici"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTLloguer.setViewportView(jTableLloguers);
        if (jTableLloguers.getColumnModel().getColumnCount() > 0) {
            jTableLloguers.getColumnModel().getColumn(1).setResizable(false);
            jTableLloguers.getColumnModel().getColumn(2).setResizable(false);
            jTableLloguers.getColumnModel().getColumn(3).setResizable(false);
            jTableLloguers.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonConf.setBackground(new java.awt.Color(51, 255, 102));
        jButtonConf.setText("Marcar com retornat");
        jButtonConf.addActionListener(this::jButtonConfActionPerformed);

        jButtonCan.setBackground(new java.awt.Color(153, 0, 0));
        jButtonCan.setText("Cancel·lar");
        jButtonCan.addActionListener(this::jButtonCanActionPerformed);

        jLabelTJoc.setText("Joc");

        jLabelTUsuari.setText("Usuari");

        jLabelTPlataforma.setText("Plataforma");

        jLabelTDinici.setText("Data d'inici");

        jLabelTJocPerm.setText("Joc");

        jLabelTUsuariPerm.setText("Usuari");

        jLabelTPlataformaPerm.setText("Plataforma");

        jLabelTDiniciPerm.setText("Data d'inici");

        javax.swing.GroupLayout jPanelTLloguerLayout = new javax.swing.GroupLayout(jPanelTLloguer);
        jPanelTLloguer.setLayout(jPanelTLloguerLayout);
        jPanelTLloguerLayout.setHorizontalGroup(
            jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTLloguerLayout.createSequentialGroup()
                .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTLloguerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTLloguerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelTLloguerLayout.createSequentialGroup()
                                .addComponent(jLabelTDiniciPerm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTDinici, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTLloguerLayout.createSequentialGroup()
                                .addComponent(jLabelTPlataformaPerm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTLloguerLayout.createSequentialGroup()
                                .addComponent(jLabelTUsuariPerm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTLloguerLayout.createSequentialGroup()
                                .addComponent(jLabelTJocPerm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTJoc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConf, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanelTLloguerLayout.setVerticalGroup(
            jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTLloguerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTJoc)
                    .addComponent(jLabelTJocPerm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTUsuari)
                    .addComponent(jLabelTUsuariPerm))
                .addGap(27, 27, 27)
                .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTPlataforma)
                    .addComponent(jLabelTPlataformaPerm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanelTLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTDinici)
                    .addComponent(jLabelTDiniciPerm))
                .addGap(21, 21, 21)
                .addComponent(jButtonCan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTLloguer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneTLloguer, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanelTLloguer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTLloguer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTLloguer, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTLloguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfActionPerformed
        int selectedRow = jTableLloguers.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecciona un lloguer de la taula.",
                    "Atenció",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Lloguer lloguer = llistaLloguersEnOrdre.get(selectedRow);

        // 1. Marcar com a retornat
        lloguer.setRetornat(true);

        // 2. Incrementar (+1) l'estoc segons plataforma
        Videojoc joc = lloguer.getVideojoc();
        if (joc != null) {
            switch (lloguer.getPlataforma()) {
                case "PS5":
                    joc.setUnitatsPS5(joc.getUnitatsPS5() + 1);
                    break;
                case "Xbox":
                case "XBOX":
                    joc.setUnitatsXbox(joc.getUnitatsXbox() + 1);
                    break;
                case "PC":
                    joc.setUnitatsPC(joc.getUnitatsPC() + 1);
                    break;
                case "Switch 2":
                case "SWITCH 2":
                    joc.setUnitatsSwitch2(joc.getUnitatsSwitch2() + 1);
                    break;
            }
        }

        JOptionPane.showMessageDialog(this,
                "Lloguer marcat com a retornat i estoc actualitzat!",
                "Èxit",
                JOptionPane.INFORMATION_MESSAGE);

        // 3. Actualitzar taula principal
        if (getParent() instanceof FinestraPrincipal) {
            ((FinestraPrincipal) getParent()).actualitzarTaula();
        }

        // 4. Recarregar taula local
        carregarLloguers();
    }//GEN-LAST:event_jButtonConfActionPerformed

    private void jButtonCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCan;
    private javax.swing.JButton jButtonConf;
    private javax.swing.JLabel jLabelTDinici;
    private javax.swing.JLabel jLabelTDiniciPerm;
    private javax.swing.JLabel jLabelTJoc;
    private javax.swing.JLabel jLabelTJocPerm;
    private javax.swing.JLabel jLabelTLloguer;
    private javax.swing.JLabel jLabelTPlataforma;
    private javax.swing.JLabel jLabelTPlataformaPerm;
    private javax.swing.JLabel jLabelTUsuari;
    private javax.swing.JLabel jLabelTUsuariPerm;
    private javax.swing.JPanel jPanelTLloguer;
    private javax.swing.JScrollPane jScrollPaneTLloguer;
    private javax.swing.JTable jTableLloguers;
    // End of variables declaration//GEN-END:variables
}
