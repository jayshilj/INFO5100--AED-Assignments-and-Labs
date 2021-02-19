/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Booking;
import Business.BookingDirectory;
import Business.Customer;
import Business.FlytSchedule;
import Business.FlytScheduleDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jaysh
 */
public class CustBookingJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private Customer customer;
    private FlytScheduleDirectory fschDir;
    private FlytSchedule flsch;
    private BookingDirectory bookDir;
    /**
     * Creates new form CustBookingJPanel
     */
    public CustBookingJPanel(JPanel rightPanel,Customer customer,BookingDirectory bookDir,FlytScheduleDirectory fschDir,FlytSchedule flsch) {
        initComponents();
        this.rightPanel = rightPanel;
        this.customer = customer;
        this.fschDir = fschDir;
        this.bookDir = bookDir;
        this.flsch = flsch;
  
        Booking b =  bookDir.searchAccount(customer.getCustomerName());
        
          if( b == null){
              flyNumjTextField.setText("");
              flytFromjTextField.setText("");
              flytTojTextField.setText("");
              flytDatejTextField.setText("");
              flytSeatNojTextField.setText("");
              flytBookingIdjTextField.setText("");
              initiateBookingBtn.setEnabled(true);
          }else{                      
              flyNumjTextField.setText(b.getFlytNum());
              flytFromjTextField.setText(b.getFlytFrom());
              flytTojTextField.setText(b.getFlytTo());
              flytDatejTextField.setText(b.getFlytDate());
              flytSeatNojTextField.setText(String.valueOf(b.getFlytSeatNum()));
              flytBookingIdjTextField.setText(String.valueOf(b.getFlytBookingId()));
              initiateBookingBtn.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        initiateBookingBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        flyNumjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        flytFromjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        flytTojTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        flytDatejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        flytSeatNojTextField = new javax.swing.JTextField();
        flytBookingIdjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Existing Bookings");

        initiateBookingBtn.setText("Initiate Booking");
        initiateBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiateBookingBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Flight No. :");

        flyNumjTextField.setEditable(false);

        jLabel3.setText("From :");

        flytFromjTextField.setEditable(false);

        jLabel4.setText("To :");

        flytTojTextField.setEditable(false);

        jLabel5.setText("Date :");

        flytDatejTextField.setEditable(false);

        jLabel6.setText("Seat No. :");

        flytSeatNojTextField.setEditable(false);

        flytBookingIdjTextField.setEditable(false);

        jLabel7.setText("Booking Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(initiateBookingBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(67, 67, 67)
                                .addComponent(flytFromjTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45)
                                .addComponent(flyNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flytTojTextField)
                                    .addComponent(flytDatejTextField)
                                    .addComponent(flytBookingIdjTextField)
                                    .addComponent(flytSeatNojTextField))))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flyNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(flytFromjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flytTojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(flytDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(flytSeatNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(flytBookingIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initiateBookingBtn)
                    .addComponent(backBtn))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initiateBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiateBookingBtnActionPerformed
        // TODO add your handling code here:
        SearchJPanel sPanel = new SearchJPanel(rightPanel, customer, bookDir, fschDir);
        rightPanel.add("SearchJPanel",sPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_initiateBookingBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField flyNumjTextField;
    private javax.swing.JTextField flytBookingIdjTextField;
    private javax.swing.JTextField flytDatejTextField;
    private javax.swing.JTextField flytFromjTextField;
    private javax.swing.JTextField flytSeatNojTextField;
    private javax.swing.JTextField flytTojTextField;
    private javax.swing.JButton initiateBookingBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}