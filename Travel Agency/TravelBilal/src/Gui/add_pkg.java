/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author PAKLAP.pk
 */
public class add_pkg extends javax.swing.JFrame {
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs=null;
   /* public void filldata(){
        conn = Connect.ConnectDB();
        try{
            String query="select trp_id from transport";
            Statement pst=conn.createStatement();
            ResultSet rs = pst.executeQuery(query);
            while(rs.next())
            {
                trp_id.addItem(rs.getString("trp_id"));
            }
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
        }
    }
    public void filldata1(){
        conn = Connect.ConnectDB();
        try{
            String query="select city_code from city";
            Statement pst=conn.createStatement();
            ResultSet rs = pst.executeQuery(query);
            while(rs.next())
            {
                destination.addItem(rs.getString("city_code"));
            }
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
        }
    }
    public void filldata2(){
        conn = Connect.ConnectDB();
        try{
            String query="select city_code from city";
            Statement pst=conn.createStatement();
            ResultSet rs = pst.executeQuery(query);
            while(rs.next())
            {
                source.addItem(rs.getString("city_code"));
            }
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
        }
    }*/
    
    /**
     * Creates new form add_pkg
     */
    public add_pkg() {
        initComponents();
        //filldata();
        //filldata1();
        //filldata2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        back3 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        add_pkg = new javax.swing.JButton();
        trp_id = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        destination = new javax.swing.JTextField();
        source = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pkg_id = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Capacity");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 280, 130, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Duration");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 320, 130, 30);

        jLabel10.setBackground(new java.awt.Color(0, 0, 102));
        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Packages");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 20, 670, 52);
        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(548, 248, 0, 0);
        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(579, 389, 0, 0);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        back3.setBackground(new java.awt.Color(0, 0, 102));
        back3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back3.setForeground(new java.awt.Color(255, 255, 255));
        back3.setText("Back");
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        add_pkg.setBackground(new java.awt.Color(0, 0, 102));
        add_pkg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_pkg.setForeground(new java.awt.Color(255, 255, 255));
        add_pkg.setText("Add");
        add_pkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pkgActionPerformed(evt);
            }
        });

        trp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        duration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        destination.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        source.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        capacity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Amount");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Source");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Destination");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Transport ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Package ID");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkg_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add_pkg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pkg_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pkg_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_pkg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 660, 390);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_pkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pkgActionPerformed
        // TODO add your handling code here:
        conn = Connect.ConnectDB();
        try{
            String query="insert into Package"+"(pkg_id,trp_id,destination,source,capacity,duration,amount)"+"values(?,?,?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(query);
           pst.setString(1,pkg_id.getText());
           pst.setString(2,trp_id.getText());
           pst.setString(3,destination.getText());
           pst.setString(4,source.getText());
           pst.setString(5,capacity.getText());
           pst.setString(6,duration.getText());
           pst.setString(7,amount.getText());
            //String value=trp_id.getSelectedItem().toString();
            //pst.setString(1,value);
           // String value1=destination.getSelectedItem().toString();
            //pst.setString(2,value1);
            //String value2=source.getSelectedItem().toString();
            //pst.setString(3,value2);

            rs=(OracleResultSet) pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this, "Inserted!");
                String qu="select max(pkg_id) from package";
                PreparedStatement pst1=conn.prepareStatement(qu);
                rs=(OracleResultSet) pst1.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Your Package ID is: "+rs.getString(1));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error showing in ID");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Not Inserted!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_add_pkgActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        // TODO add your handling code here:
        Admin_package back = new Admin_package();
        dispose();
        back.show();
    }//GEN-LAST:event_back3ActionPerformed

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
            java.util.logging.Logger.getLogger(add_pkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_pkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_pkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_pkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_pkg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_pkg;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back3;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField destination;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pkg_id;
    private javax.swing.JTextField source;
    private javax.swing.JTextField trp_id;
    // End of variables declaration//GEN-END:variables
}
