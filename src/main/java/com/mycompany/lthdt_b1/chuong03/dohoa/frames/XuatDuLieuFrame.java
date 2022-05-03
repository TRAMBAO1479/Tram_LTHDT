/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.lthdt_b1.chuong03.dohoa.frames;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author OS
 */
public class XuatDuLieuFrame extends javax.swing.JInternalFrame {
        int[] a;
    /**
     * Creates new form XuatDuLieuFrame
     */
    public XuatDuLieuFrame() {
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

        pnPanel = new javax.swing.JPanel();
        butVe = new javax.swing.JButton();
        butSapXep = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vẽ dữ liệu mảng 1 chiều");

        javax.swing.GroupLayout pnPanelLayout = new javax.swing.GroupLayout(pnPanel);
        pnPanel.setLayout(pnPanelLayout);
        pnPanelLayout.setHorizontalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        pnPanelLayout.setVerticalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        butVe.setText("Vẽ mảng một chiều ra màn hình");
        butVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVeActionPerformed(evt);
            }
        });

        butSapXep.setText("Sắp xếp mảng 1 chiều");
        butSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butVe)
                    .addComponent(butSapXep))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butSapXep, butVe, pnPanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butVe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butSapXep)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVeActionPerformed
        // TODO add your handling code here:
        
        Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step = 5;
        int n = maxX/step;
        int [] a = new int [n];
        Random rnd = new Random();
        gr.clearRect(0, 0, maxX, maxY);
        for (int i = 0; i < n; i ++) {
            a[i] = rnd.nextInt(maxY);
        }
        int beginX = 0; int beginY = 0; 
        for (int i = 0; i < n ; i++) {
            //gr.drawRect(beginX, beginY, step, a[i]);
            gr.drawRect(beginX, maxY - a[i] , step, a[i]);
            beginX += step;
        }
    }//GEN-LAST:event_butVeActionPerformed

    private void butSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSapXepActionPerformed
        // TODO add your handling code here:
        Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step = 5;
        int n = maxX/step;
        int beginX = 0; int beginX2 = 0;       
        for (int i = 0; i < n - 1; i++) {                   
            for (int j= i + 1; j < n; j++) {
                if (a[i]  > a[j]) {
                int temp = a[i];
                //xoa hinh a[i] cu
                gr.clearRect(beginX, maxY - a[i], step, a[i]);
                //ve hinh a[i] moi
                a[i] = a[j];
                gr.clearRect(beginX, maxY - a[i], step, a[i]);
                //xoa hinh a[j] cu
                beginX2 = j*step;
                gr.clearRect(beginX2, maxY - a[j], step, a[j]);
                //ve hinh a[j] moi
                a[j] = temp;
                gr.clearRect(beginX2, maxY - a[j], step, a[j]);
             }
                }
             beginX += step;
            }
       
    }//GEN-LAST:event_butSapXepActionPerformed
            
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butSapXep;
    private javax.swing.JButton butVe;
    private javax.swing.JPanel pnPanel;
    // End of variables declaration//GEN-END:variables
}
