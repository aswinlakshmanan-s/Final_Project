/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ShopRep;

import Business.EcoSystem;
import UserInterface.Homepage.MainJFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import UserInterface.Analyst.AnalyzeMarketJpanel;

/**
 *
 * @author anirudh
 */
public class ShopRepDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShopRepDashboardJPanel
     */
    EcoSystem system;
    public ShopRepDashboardJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
        //method for click-response action buttons
        ArrayList<JButton> buttonList = new ArrayList<>();
        buttonList.add(btnViewApp);
        buttonList.add(btnViewOrders);

        
        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                for (JButton btn : buttonList) {
                    btn.setForeground(Color.BLACK); 
                    btn.setBackground(Color.DARK_GRAY);
                    Font originalFont = btn.getFont();
                    Font plainFont = originalFont.deriveFont(Font.PLAIN);
                    btn.setFont(plainFont);
                }
                clickedButton.setForeground(Color.red); 
                clickedButton.setBackground(Color.white);
                Font originalFont = clickedButton.getFont();
                Font boldFont = originalFont.deriveFont(Font.BOLD);
                clickedButton.setFont(boldFont);
            }
        };
        for (JButton btn : buttonList) {
        btn.addActionListener(buttonActionListener);
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnViewApp = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        jPanel2 = new AnalyzeMarketJpanel.jPanelGradient();

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btnViewApp.setText("View Appointments");
        btnViewApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/logoutNew20.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/logout_filled20.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnViewOrders.setText("View Orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnViewApp)
                .addGap(51, 51, 51)
                .addComponent(btnViewOrders)
                .addGap(120, 120, 120)
                .addComponent(btnLogout)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1289, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
                MainJFrame.changeScreen(MainJFrame.LandinPageJPanel);

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppActionPerformed
        // TODO add your handling code here:
        ShopRepViewAppointmentsJPanel panel = new ShopRepViewAppointmentsJPanel(system);
        
    }//GEN-LAST:event_btnViewAppActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        ShopRrepViewOnlineOrdersJPanel panel = new ShopRrepViewOnlineOrdersJPanel(system);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnViewOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewApp;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
