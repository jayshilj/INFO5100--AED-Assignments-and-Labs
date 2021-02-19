/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AirlineManagers;

import Business.Airliner;
import Business.Fleet;
import Business.FlytSchedule;
import Business.FlytScheduleDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAINHEMANT
 */
public class NewSchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewSchJPanel
     */
    private JPanel rightPanel;
    private Airliner airliner;
    private Fleet fleet;
    private FlytSchedule flsch;
    private FlytScheduleDirectory fschDir;
    public NewSchJPanel(JPanel rightPanel,Airliner airliner, Fleet fleet,FlytScheduleDirectory fschDir) {
        initComponents();
        
        
        this.airliner = airliner;
        this.fleet = fleet;
        this.rightPanel = rightPanel ;
        this.fschDir = fschDir ;      
        flytFleetModeljTextField.setText(fleet.getFleetModel());
        flytSeatsjTextField.setText(String.valueOf(fleet.getTotalSeats()));
        flytAirNamejTextField.setText(airliner.getAirlinerName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    private boolean getDateRegex(String date)
   {
       
       //String regex= "\\d{2}\\-\\d{2}\\-\\d{4}";
       String dRegex="^(0[0-9]|1[0-2])\\-(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\-(199[0-9]|20[0-1][0-8])";
       final Pattern pattern = Pattern.compile(dRegex);
       boolean bool=pattern.matcher(date).matches();
       return bool;
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flytSeatsjTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        flytFlyingTimejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        flytFleetModeljTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        flytFromjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flytTojTextField = new javax.swing.JTextField();
        flytNumjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flytFlyingDatejTextField = new javax.swing.JTextField();
        flytAirNamejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        flytPricejTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        flytSeatsjTextField.setEditable(false);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fleet* :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Flying Time*:");

        flytFleetModeljTextField.setEditable(false);

        jLabel10.setText("mm-dd-yyyy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Departure Loc* :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("* Required");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Flight Schedule");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Arrival Loc* :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Flight No.* :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Flying Date* :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Airliner* :");

        flytAirNamejTextField.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Seats* :");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Price* :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flytAirNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytFleetModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytFromjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytTojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytFlyingDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flytFlyingTimejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(flytPricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flytNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flytAirNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flytFleetModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(flytFromjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(flytTojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(flytFlyingDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flytFlyingTimejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(flytSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(flytPricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(saveBtn))
                .addContainerGap(318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
       //Validations of all the text fields
        if(flytNumjTextField.getText()==null || flytNumjTextField.getText().equals(""))
        {
            flytNumjTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Number cannot be empty!");
            return;
        }
        
        if(flytAirNamejTextField.getText()==null || flytAirNamejTextField.getText().equals(""))
        {
            flytAirNamejTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Air Name cannot be empty!");
            return;
        }
        
         if(flytFromjTextField.getText()==null || flytFromjTextField.getText().equals(""))
        {
            flytFromjTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight From cannot be empty!");
            return;
        }
         
          if(flytTojTextField.getText()==null || flytTojTextField.getText().equals(""))
        {
            flytTojTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight To cannot be empty!");
            return;
        }
          
          if(flytSeatsjTextField.getText()==null || flytSeatsjTextField.getText().equals(""))
        {
            flytSeatsjTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel6.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Seats cannot be empty!");
            return;
        }
          if(flytFlyingDatejTextField.getText()==null || flytFlyingDatejTextField.getText().equals(""))
        {
            flytFlyingDatejTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel7.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Flying Date cannot be empty!");
            return;
        }
         if(flytFlyingTimejTextField.getText()==null || flytFlyingTimejTextField.getText().equals(""))
        {
            flytFlyingTimejTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel8.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Flying Time cannot be empty!");
            return;
        }
         if(flytFleetModeljTextField.getText()==null || flytFleetModeljTextField.getText().equals(""))
        {
            flytFleetModeljTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel9.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"Flight Fleet Model cannot be empty!");
            return;
        }

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date BOD = null ;
        
//        if(flytFlyingDatejTextField.getText().length()!=10)
//        {
//             JOptionPane.showMessageDialog(null, "Please enter a valid date in MM-dd-yyyy format");
//            return;
//        }
//        
        if(!getDateRegex(flytFlyingDatejTextField.getText()))
               {
                 
                   JOptionPane.showMessageDialog(null,"Please Enter date in format MM-dd-YYYY","ERROR",0);
                   return;
               }
        try
        {
            BOD = df.parse(flytFlyingDatejTextField.getText());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid date in MM-dd-yyyy format");
            return;
        }
        try
        {
            int temp = (Integer.parseInt(flytFlyingTimejTextField.getText()));
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Time should be in 24hrs format e.g 1200 or 0050");
            return;
        }
         try 
            {
              double temp1 = (Double.parseDouble(flytPricejTextField.getText()));
            }
            catch(NumberFormatException nfe)
            {
                  JOptionPane.showMessageDialog(null, "Price should be a floating point number");
                return;                
            }

        int flyttime = Integer.parseInt(flytFlyingTimejTextField.getText());
        if (flytFlyingTimejTextField.getText().length() != 4)
        {
            JOptionPane.showMessageDialog(this, "Time should be in 24hrs format and in the range 0000-2400");
            return;
        }
        else
        {
            if (flyttime >= 0000
                &&
                flyttime <= 2400
            )
            {
            }
            else{
                JOptionPane.showMessageDialog(this, "Time should be in 24hrs format and in the range 0000-2400");
                return;
            }
        }

        FlytSchedule fsch = fschDir.addFlytSchedule();

        fsch.setFlytNum(flytNumjTextField.getText());
        fsch.setFlytAirline(flytAirNamejTextField.getText());
        fsch.setFlytFleet(flytFleetModeljTextField.getText());
        fsch.setFlytFrom(flytFromjTextField.getText());
        fsch.setFlytTo(flytTojTextField.getText());
        fsch.setFlytDate(flytFlyingDatejTextField.getText());
        fsch.setFlytTime(flytFlyingTimejTextField.getText());
        try
        {
            fsch.setFlytAvlSeats(Integer.parseInt(flytSeatsjTextField.getText()));
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Seats should be in integer");
            return;
        }
          fsch.setFlyPrice(Double.parseDouble(flytPricejTextField.getText()));
        fsch.setSeatsDirectory();

        JOptionPane.showMessageDialog(null, "New Schedule Captured Successfully");
         rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        Component[] components = rightPanel.getComponents();
        for(Component c : components){
            if(c instanceof FlytSchJPanel){
                FlytSchJPanel panel = (FlytSchJPanel)c;
                panel.populate();
            }
        }
//        flytAirNamejTextField.setText("");
//        flytNumjTextField.setText("");
//        flytFleetModeljTextField.setText("");
//        flytFromjTextField.setText("");
//        flytTojTextField.setText("");
//        flytSeatsjTextField.setText("");
//        flytFlyingDatejTextField.setText("");
//        flytFlyingTimejTextField.setText("");
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        Component[] components = rightPanel.getComponents();
        for(Component c : components){
            if(c instanceof FlytSchJPanel){
                FlytSchJPanel panel = (FlytSchJPanel)c;
                panel.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField flytAirNamejTextField;
    private javax.swing.JTextField flytFleetModeljTextField;
    private javax.swing.JTextField flytFlyingDatejTextField;
    private javax.swing.JTextField flytFlyingTimejTextField;
    private javax.swing.JTextField flytFromjTextField;
    private javax.swing.JTextField flytNumjTextField;
    private javax.swing.JTextField flytPricejTextField;
    private javax.swing.JTextField flytSeatsjTextField;
    private javax.swing.JTextField flytTojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}