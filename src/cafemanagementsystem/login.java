/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    SIGN db;
    public login() {
        initComponents();
        db=new SIGN();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf9 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));
        getContentPane().add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 130, 30));

        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });
        getContentPane().add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 130, -1));

        tf8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.jpg"))); // NOI18N
        tf8.setText("jLabel4");
        getContentPane().add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -60, 1330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String db_Username=null;
         String db_Password=null;
         
//         Object user_pass1=tf7.getText();
         String user_pass=tf7.getText();
         String Username=tf9.getText();
//         String Password=tf8.getText();
         
         String query="select * from SIGN where USERNAME='"+Username+"'";
         System.out.println(query);
         try
         {
             db.rs=db.stmt.executeQuery(query);
             db.rs.next();
             db_Username=db.rs.getString(3);
             db_Password=db.rs.getString(4);
             
             if(user_pass.equalsIgnoreCase(db_Password))
             {
                 this.dispose();

                  new pizza().setVisible(true);
             }
             else
             {
                
                 JOptionPane.showMessageDialog(this, "Password do not match","Alert",JOptionPane.WARNING_MESSAGE);
             }
         }
         catch(Exception e)
         {
           e.printStackTrace();  
         }
//           new pizza().setVisible(true);
//         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf7;
    private javax.swing.JLabel tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
