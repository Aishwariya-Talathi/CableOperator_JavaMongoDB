import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aishwariya
 */
public class frmAdminDisplay extends javax.swing.JFrame {

    /**
     * Creates new form frmAdmin
     */
    public frmAdminDisplay() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCdetails = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCpack = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblWelcome1 = new javax.swing.JLabel();
        lblWelcome2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Details");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        tblCdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Phone No", "Gender", "Email", "Address", "Date subs"
            }
        ));
        jScrollPane1.setViewportView(tblCdetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 150, 830, 180);

        tblCpack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust Id", "Pack Name", "Cost"
            }
        ));
        jScrollPane2.setViewportView(tblCpack);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 500, 830, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\homegif (3).gif")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 50, 80, 80);

        lblWelcome1.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome1.setText("Customer  package  details");
        getContentPane().add(lblWelcome1);
        lblWelcome1.setBounds(450, 400, 510, 47);

        lblWelcome2.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblWelcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome2.setText("Customer  personal  details");
        getContentPane().add(lblWelcome2);
        lblWelcome2.setBounds(450, 50, 510, 47);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\url.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Connection c = new Connection();
        DBCollection dbc = c.connection("cust");
        BasicDBObject bdb = new BasicDBObject();

        String[] colNames = {"Customer ID","Name","Phone No","Gender","Email","Address","Date_subs"};
        DefaultTableModel dtm = new DefaultTableModel(colNames,0);
        DBCursor cursor = dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj = cursor.next();
            String id = (String) obj.get("Custid");
            String name = (String)obj.get("Name");
            String phone = (String)obj.get("Pno");
            String gender = (String)obj.get("Gender");
            String email = (String)obj.get("Email");
            String add = (String)obj.get("Address");
            String dos = (String)obj.get("Date_subs");

            dtm.addRow(new Object[]{id,name,phone,gender,email,add,dos});
            tblCdetails.setModel(dtm);
        }
        
        
    /////////////////////////////////////////////////////////////////
        
        DBCollection dbc1 = c.connection("pcust");
        
        String[] colNames1 = {"Customer ID","Packages","Cost"};
        DefaultTableModel dtm1 = new DefaultTableModel(colNames1,0);
        DBCursor cursor1 = dbc1.find();
       
        String c1 = "";
        
        while(cursor1.hasNext())
        {
            DBObject obj = cursor1.next();
            String id = (String)obj.get("Custid");
        
            BasicDBObject bdb1 = new BasicDBObject();
            bdb1.put("Custid",id);
            DBCursor cursor2 = dbc1.find(bdb1);
            while(cursor2.hasNext())
            {
                c1 = cursor2.next().get("Packages").toString();
            }
            String cost = (String)obj.get("Pack_cost");
            
            dtm1.addRow(new Object[]{id,c1,cost+"/-"});
            tblCpack.setModel(dtm1);
        }
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        new frmAdminOption().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(frmAdminDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdminDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblWelcome1;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JTable tblCdetails;
    private javax.swing.JTable tblCpack;
    // End of variables declaration//GEN-END:variables
}
