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
public class SaisieNote extends javax.swing.JFrame {

        SCHOOL10 scl= new SCHOOL10();
Statement stm=null;
Connection conect=null;
    ResultSet Rst=null;
    public SaisieNote() {
        initComponents();
                      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        noteE = new javax.swing.JTextField();
        assiduteE = new javax.swing.JTextField();
        evaluationE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idEtudiant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        matiere = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Id_Etudiant");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setText("Note_Examen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Assiduté");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("Evaluation");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        noteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteEActionPerformed(evt);
            }
        });
        getContentPane().add(noteE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, -1));

        assiduteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assiduteEActionPerformed(evt);
            }
        });
        getContentPane().add(assiduteE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, -1));
        getContentPane().add(evaluationE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, 60));

        jButton1.setText("Enrigistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        idEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtudiantActionPerformed(evt);
            }
        });
        getContentPane().add(idEtudiant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));

        jLabel6.setText("Matiere");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        matiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matiereActionPerformed(evt);
            }
        });
        getContentPane().add(matiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteEActionPerformed

    private void assiduteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assiduteEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assiduteEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id=idEtudiant.getText();
        String note=noteE.getText();
        String assidute=assiduteE.getText();
        String evaluation=evaluationE.getText();
        String matier=matiere.getText();
        String requete="INSERT INTO note(idEtudiant,noteEtudiant,assidute,evaluation,matiere) VALUES ('"+id+"','"+note+"','"+assidute+"','"+evaluation+"','"+matier+"')"; 
        try{
           stm.executeUpdate(requete);
           JOptionPane.showMessageDialog(null,"ajouter");
           idEtudiant.setText("");noteE.setText("");assiduteE.setText("");evaluationE.setText("");matiere.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEtudiantActionPerformed

    private void matiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matiereActionPerformed

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
            java.util.logging.Logger.getLogger(SaisieNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaisieNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaisieNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaisieNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaisieNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assiduteE;
    private javax.swing.JTextField evaluationE;
    private javax.swing.JTextField idEtudiant;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField matiere;
    private javax.swing.JTextField noteE;
    // End of variables declaration//GEN-END:variables
}
