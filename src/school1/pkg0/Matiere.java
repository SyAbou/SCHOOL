/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school1.pkg0;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author abou
 */
public class Matiere extends javax.swing.JFrame {

    SCHOOL10 scl= new SCHOOL10();
Statement stm;
    ResultSet Rst;
    public Matiere() {
        initComponents();
          try {
        stm=scl.obtenirconnexion().createStatement();
   
        ResultSet Rst=stm.executeQuery("Select *from matiere");
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
        Matiere = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idMatiere = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LIbelle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LogLM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Niveau = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matiere :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        getContentPane().add(Matiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 100, -1));

        jButton2.setText("Modifier");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 100, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("id_Matiere");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        idMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMatiereActionPerformed(evt);
            }
        });
        getContentPane().add(idMatiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Libelle");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        LIbelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIbelleActionPerformed(evt);
            }
        });
        getContentPane().add(LIbelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("loglibellematiere");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        getContentPane().add(LogLM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Niveau");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        Niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NiveauActionPerformed(evt);
            }
        });
        getContentPane().add(Niveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abou\\Desktop\\mat.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LIbelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIbelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LIbelleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String idm=idMatiere.getText();
        String matiere=Matiere.getText();
        String libelle=LIbelle.getText();
        String loglm=LogLM.getText();
          String niveau=Niveau.getText();
        
        String requete="INSERT INTO matiere(idMatiere, nomMatiere,libelleMatiere,loglilbelleMatiere,niveauMatiere) VALUES ('"+idm+"','"+matiere+"','"+libelle+"','"+loglm+"','"+niveau+"')"; 
        try{
           stm.executeUpdate(requete);
           JOptionPane.showMessageDialog(null," matiere ajouter");
        idMatiere.setText("");Matiere.setText("");LIbelle.setText("");
        LogLM.setText("");Niveau.setText("");
         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                                           

    }//GEN-LAST:event_jButton1ActionPerformed

    private void NiveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NiveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NiveauActionPerformed

    private void idMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMatiereActionPerformed

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
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LIbelle;
    private javax.swing.JTextField LogLM;
    private javax.swing.JTextField Matiere;
    private javax.swing.JTextField Niveau;
    private javax.swing.JTextField idMatiere;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
