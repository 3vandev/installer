/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package io.github.solclient.installer.ui.step;

import io.github.solclient.installer.locale.Locale;
import io.github.solclient.installer.ui.InstallerFrame;

/**
 *
 * @author maks
 */
public class CustomizeStep extends javax.swing.JPanel {
    InstallerFrame frame;
    /**
     * Creates new form CustomizeStep
     */
    public CustomizeStep(InstallerFrame frame) {
        this.frame = frame;
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

        optiFineCheckbox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        optiFineCheckbox.setText(Locale.getString(Locale.UI_ENABLE_OPTIFINE));
        optiFineCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optiFineCheckboxItemStateChanged(evt);
            }
        });

        jLabel1.setFont(jLabel1.getFont().deriveFont((float)20));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(Locale.getString(Locale.UI_CUSTOMIZE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optiFineCheckbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(optiFineCheckbox)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optiFineCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optiFineCheckboxItemStateChanged
        // TODO add your handling code here:
        frame.getInstaller().setOptifineEnabled(optiFineCheckbox.isSelected());
    }//GEN-LAST:event_optiFineCheckboxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox optiFineCheckbox;
    // End of variables declaration//GEN-END:variables
}