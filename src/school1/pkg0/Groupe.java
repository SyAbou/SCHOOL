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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idEtudiant = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Hdeb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Hfin = new javax.swing.JTextField();
        salleG = new javax.swing.JTextField();
        Session = new javax.swing.JTextField();
        nomMatiere = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("id_Groupe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 20));

        idGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idGroupActionPerformed(evt);
            }
        });
        getContentPane().add(idGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom_Groupe");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        nomGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomGroupActionPerformed(evt);
            }
        });
        getContentPane().add(nomGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salle");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 30, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Heure_Debut");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Session");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id_etudiant");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtudiantActionPerformed(evt);
            }
        });
        getContentPane().add(idEtudiant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Matiere");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Hdeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HdebActionPerformed(evt);
            }
        });
        getContentPane().add(Hdeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 60, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Heure_Fin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));
        getContentPane().add(Hfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, -1));

        salleG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleGActionPerformed(evt);
            }
        });
        getContentPane().add(salleG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, -1));
        getContentPane().add(Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 130, -1));
        getContentPane().add(nomMatiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(Anglais,Francais,Allemand,Arabe,Espagnole)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\abou\\Desktop\\groupe.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomGroupActionPerformed

    private void idEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtudiantActionPerformed
       
    }//GEN-LAST:event_idEtudiantActionPerformed

    private void idGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idGroupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String idg=idGroup.getText();
        String nomg=nomGroup.getText();
        String matiere=nomMatiere.getText();
        String salle=salleG.getText();
        String hdeb=Hdeb.getText();
        String hfin=Hfin.getText();
        String session=Session.getText();
        String requete="INSERT INTO groupe(idGroupe, nomGroupe,matiere,salle,heureDebut,heureFin,session) VALUES ('"+idg+"','"+nomg+"','"+matiere+"','"+salle+"','"+hdeb+"','"+hfin+"','"+session+"')"; 
        try{
           stm.executeUpdate(requete);
           JOptionPane.showMessageDialog(null," groupe Enrigistrer");
        idGroup.setText("");nomGroup.setText("");
        nomMatiere.setActionCommand(matiere);
        salleG.setText("");Hdeb.setText("");Hfin.setText("");
         Session.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HdebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HdebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HdebActionPerformed

    private void salleGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salleGActionPerformed

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
    private javax.swing.JTextField Session;
    private javax.swing.JComboBox<String> idEtudiant;
    private javax.swing.JTextField idGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField nomGroup;
    private javax.swing.JTextField nomMatiere;
    private javax.swing.JTextField salleG;
    // End of variables declaration//GEN-END:variables
}
