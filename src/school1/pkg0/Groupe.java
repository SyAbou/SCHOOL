/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school1.pkg0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author abou
 */
public class Groupe extends javax.swing.JFrame {

    SCHOOL10 scl= new SCHOOL10();
Statement stm=null;
Connection conect=null;
    ResultSet Rst=null;
    
    /**
     * Creates new form Paiement
     */
    public Groupe() {
        
                   initComponents();
                    FillCombo();
                   conect=scl.obtenirconnexion();
                    }
        public void  FillCombo(){
                   try {
                            stm=scl.obtenirconnexion().createStatement();
   
                                  ResultSet Rst=stm.executeQuery("Select *from etudiant");
                                  while(Rst.next()){
               
                                            idEtudiant.addItem(Rst.getString("idEtudiant"));}
                                   ResultSet Rst1=stm.executeQuery("Select *from matiere");
                                   while(Rst1.next()){
               
                                            nomMatiere.addItem(Rst1.getString("nomMatiere"));}
                                    
    } 
    catch(Exception e1){System.err.println(e1);{
    }

}

    }

   
   
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idGroup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomGroup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salleG = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Session = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idEtudiant = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nomMatiere = new javax.swing.JComboBox<>();
        Hdeb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Hfin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("id_Groupe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 20));

        idGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idGroupActionPerformed(evt);
            }
        });
        getContentPane().add(idGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        jLabel3.setText("Nom_Groupe");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        nomGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomGroupActionPerformed(evt);
            }
        });
        getContentPane().add(nomGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, -1));

        jLabel4.setText("Salle");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 30, -1));

        salleG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALLE 1", "SALLE 2", "SALLE 3", "SALLE 4", "SALLE 5", "SALLE 6", "SALLE 7\t", "SALLE 8", "SALLE 9", "SALLE 10" }));
        getContentPane().add(salleG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jLabel5.setText("Heure_Debut");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setText("Session");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        Session.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionActionPerformed(evt);
            }
        });
        getContentPane().add(Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, -1));

        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel7.setText("id_etudiant");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        idEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtudiantActionPerformed(evt);
            }
        });
        getContentPane().add(idEtudiant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 20));

        jLabel8.setText("Matiere");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        nomMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomMatiereActionPerformed(evt);
            }
        });
        getContentPane().add(nomMatiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, -1));

        Hdeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HdebActionPerformed(evt);
            }
        });
        getContentPane().add(Hdeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, -1));

        jLabel9.setText("Heure_Fin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        getContentPane().add(Hfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomGroupActionPerformed

    private void idEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtudiantActionPerformed
       
    }//GEN-LAST:event_idEtudiantActionPerformed

    private void SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SessionActionPerformed

    private void idGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idGroupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String idg=idGroup.getText();
        String nomg=nomGroup.getText();
        String matiere=nomMatiere.getActionCommand();
        String salle=salleG.getActionCommand();
        String hdeb=Hdeb.getText();
        String hfin=Hfin.getText();
        String session=Session.getActionCommand();
        
        String requete="INSERT INTO groupe(idGroupe, nomGroupe,matiere,salle,heureDebut,heureFin,session) VALUES ('"+idg+"','"+nomg+"','"+matiere+"','"+salle+"','"+hdeb+"','"+hfin+"','"+session+"',)"; 
        try{
           stm.executeUpdate(requete);
           JOptionPane.showMessageDialog(null," groupe Enrigistrer");
        idGroup.setText("");nomGroup.setText("");
        nomMatiere.setActionCommand(matiere);
        salleG.setActionCommand(salle);Hdeb.setText("");Hfin.setText("");
         Session.setActionCommand(session);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HdebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HdebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HdebActionPerformed

    private void nomMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomMatiereActionPerformed
       
    }//GEN-LAST:event_nomMatiereActionPerformed

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
            java.util.logging.Logger.getLogger(Groupe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Groupe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Groupe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Groupe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Groupe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hdeb;
    private javax.swing.JTextField Hfin;
    private javax.swing.JComboBox<String> Session;
    private javax.swing.JComboBox<String> idEtudiant;
    private javax.swing.JTextField idGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomGroup;
    private javax.swing.JComboBox<String> nomMatiere;
    private javax.swing.JComboBox<String> salleG;
    // End of variables declaration//GEN-END:variables
}
