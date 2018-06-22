
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class frmDetails extends javax.swing.JFrame {

    String id = "";
    
    public frmDetails(String s) {
        
        id = s;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDetails = new javax.swing.JButton();
        btnPackage = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblWelcome1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome User");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnDetails.setBackground(new java.awt.Color(102, 153, 255));
        btnDetails.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText("PERSONAL DETAILS");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetails);
        btnDetails.setBounds(90, 390, 229, 36);

        btnPackage.setBackground(new java.awt.Color(102, 153, 255));
        btnPackage.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        btnPackage.setForeground(new java.awt.Color(255, 255, 255));
        btnPackage.setText("MY PACKAGES");
        btnPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPackageActionPerformed(evt);
            }
        });
        getContentPane().add(btnPackage);
        btnPackage.setBounds(540, 440, 190, 36);

        btnDelete.setBackground(new java.awt.Color(102, 153, 255));
        btnDelete.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE ACCOUNT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(930, 510, 210, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\pdetails (2).png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 230, 170, 165);

        lblWelcome1.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lblWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWelcome1.setText("Welcome ");
        getContentPane().add(lblWelcome1);
        lblWelcome1.setBounds(400, 70, 240, 47);

        lblName.setBackground(new java.awt.Color(204, 255, 255));
        lblName.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblName);
        lblName.setBounds(650, 70, 220, 47);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\packages (1).jpg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 280, 160, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\download--3-.jpg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1110, 130, 150, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\remove-user-icon (1).png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(960, 350, 150, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\url.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1370, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        
        this.setVisible(false);
        new frmPdetail(id).setVisible(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPackageActionPerformed
        
        this.setVisible(false);
        new frmPacks(id).setVisible(true);
    }//GEN-LAST:event_btnPackageActionPerformed

    public void delete()
    {
        Connection c = new Connection();
        DBCollection dbc = c.connection("cust");
        DBCollection dbc1 = c.connection("pcust");
        
        BasicDBObject document = new BasicDBObject();
        document.put("Custid",id);
        
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete account?", "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION)
        {   
            dbc.remove(document);
            dbc1.remove(document);
            new frmChoose().setVisible(true);
            this.setVisible(false);
        } 
        else if (response == JOptionPane.NO_OPTION) 
        {   
        }        
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Connection c = new Connection();
        DBCollection dbc = c.connection("cust");

        BasicDBObject Query = new BasicDBObject();
        Query.put("Custid", id);
        DBCursor cursor = dbc.find(Query);
        String n = "";
        
        while(cursor.hasNext()) 
        {
            DBObject obj = cursor.next();
            n = (String)obj.get("Name");  
        }
        
        lblName.setText(n+"!!!");
    }//GEN-LAST:event_formWindowActivated

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        new frmChoose().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        this.setVisible(false);
        new frmPdetail(id).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.setVisible(false);
        new frmPacks(id).setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        delete();
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
            java.util.logging.Logger.getLogger(frmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnPackage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWelcome1;
    // End of variables declaration//GEN-END:variables
}
