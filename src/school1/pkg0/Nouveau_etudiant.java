/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school1.pkg0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abou
 */
public class Nouveau_etudiant extends javax.swing.JFrame {
SCHOOL10 scl= new SCHOOL10();
Connection conect;
Statement stm;
    ResultSet Rst;
    PreparedStatement ps;
    
    
    public Nouveau_etudiant() {
        initComponents();
        try {
        stm=scl.obtenirconnexion().createStatement();
   
        ResultSet Rst=stm.executeQuery("Select *from etudiant");
    } 
    catch(Exception e1){System.err.println(e1);}
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nomE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenomE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idiE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        diE = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nom_etudiant");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));
        getContentPane().add(nomE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        jLabel3.setText("Prenom_etudiant");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));
        getContentPane().add(prenomE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, -1));

        jLabel4.setText("Id_etudiant");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));
        getContentPane().add(idE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, -1));

        jButton1.setBackground(new java.awt.Color(40, 156, 210));
        jButton1.setText("inscrire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 100, 40));

        jLabel5.setText("Id_inscription");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        idiE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiEActionPerformed(evt);
            }
        });
        getContentPane().add(idiE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, -1));

        jLabel6.setText("Date_inscription");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));
        getContentPane().add(diE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abou\\Documents\\NetBeansProjects\\SCHOOL1.0\\Icone-Inscription.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 90));

        jButton2.setBackground(new java.awt.Color(40, 156, 210));
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\abou\\Documents\\NetBeansProjects\\SCHOOL1.0\\tabl.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idiEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String id=idE.getText();
        String nom=nomE.getText();
        String prenom=prenomE.getText();
        String idi=idiE.getText();
          String die=diE.getText();
        
        String requete="INSERT INTO etudiant(idEtudiant, nomEtudiant,prenomEtudiant,idInscription,dateInscription) VALUES ('"+id+"','"+nom+"','"+prenom+"','"+idi+"','"+die+"')"; 
        try{
           stm.executeUpdate(requete);
           JOptionPane.showMessageDialog(null," inscris");
        idE.setText("");nomE.setText("");prenomE.setText("");
        idiE.setText("");diE.setText("");
         Paiement paie= new Paiement();
              paie.setVisible(rootPaneCheckingEnabled);
              new Nouveau_etudiant();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String id=idE.getText();
        String nom=nomE.getText();
        String prenom=prenomE.getText();
        String idi=idiE.getText();
          String die=diE.getText();
            String requete="UPDATE  etudiant set idEtudiant='"+id+"', nomEtudiant='"+nom+"',prenomEtudiant=='"+prenom+"',idInscription='"+idi+"',dateInscription='"+die+"' where idEtudiant='"+id+"'"; 
    try {
        ps=conect.prepareStatement(requete);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Modifier");
    } catch (SQLException ex) {
       System.out.println(ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Nouveau_etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nouveau_etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nouveau_etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nouveau_etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nouveau_etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField diE;
    private javax.swing.JTextField idE;
    private javax.swing.JTextField idiE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomE;
    private javax.swing.JTextField prenomE;
    // End of variables declaration//GEN-END:variables
}
