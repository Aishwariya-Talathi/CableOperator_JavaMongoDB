
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aishwariya
 */
public class frmPacks extends javax.swing.JFrame {

    /**
     * Creates new form frmPacks
     */
    String id = "";
    public frmPacks(String a) {
        id = a;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblWelcome1 = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblPackNames = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPackages = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pack Details");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\homegif (3).gif")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 60, 80, 80);

        lblWelcome1.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome1.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        lblWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome1.setText("YOUR  Package  DETAILS");
        getContentPane().add(lblWelcome1);
        lblWelcome1.setBounds(410, 70, 510, 47);

        lblUpdate.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("Change Packs");
        getContentPane().add(lblUpdate);
        lblUpdate.setBounds(1070, 390, 150, 35);

        lblPackNames.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPackNames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPackNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblPackNames);
        lblPackNames.setBounds(580, 220, 340, 35);

        lblTotalCost.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCost.setText("Total Cost :");
        getContentPane().add(lblTotalCost);
        lblTotalCost.setBounds(360, 320, 150, 35);

        lblCost.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCost);
        lblCost.setBounds(580, 320, 140, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\updatepack (1).jpg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1080, 260, 130, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\download--3-.jpg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1130, 70, 150, 70);

        lblPackages.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPackages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPackages.setText("Packages :");
        getContentPane().add(lblPackages);
        lblPackages.setBounds(360, 220, 150, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\url.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1380, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Connection j = new Connection();
        DBCollection dbc = j.connection("pcust");
         
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("Custid", id);
        DBCursor cursor = dbc.find(whereQuery);
        String cost = "";
        String c1 = "";
        
        while(cursor.hasNext())
        {
            DBObject obj = cursor.next();
            cost = (String) obj.get("Pack_cost");

            BasicDBObject bdb = new BasicDBObject();
            bdb.put("Custid",id);
            DBCursor cursor1 = dbc.find(bdb);
            while(cursor1.hasNext())
            {
                c1 = cursor1.next().get("Packages").toString();
            }
        }
        
        lblPackNames.setText(c1);
        lblCost.setText(cost);
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        new frmDetails(id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        new frmDefPack(id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        new frmChoose().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(frmPacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblPackNames;
    private javax.swing.JLabel lblPackages;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblWelcome1;
    // End of variables declaration//GEN-END:variables
}
