/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgencyWelcome;

import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sumesh
 */
public class TravelAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgentJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel; 
    public TravelAgentJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookFlight = new javax.swing.JButton();
        btnPastBookings = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Travel Agent");

        btnBookFlight.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBookFlight.setForeground(new java.awt.Color(153, 0, 0));
        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        btnPastBookings.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnPastBookings.setForeground(new java.awt.Color(153, 0, 0));
        btnPastBookings.setText("View Past Bookings");
        btnPastBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)
                    .addComponent(btnPastBookings)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPastBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
        SearchFlightToBookJPanel searchFlightToBookJPanel = new SearchFlightToBookJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("SearchFlightToBookJPanel" , searchFlightToBookJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void btnPastBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastBookingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastBookingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JButton btnPastBookings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
