
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;
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
public class frmFinalpack extends javax.swing.JFrame {

    /**
     * Creates new form frmFinalpack
     */
    String id = "";
    
    
    @SuppressWarnings("empty-statement")
    public frmFinalpack(Vector v,String s) {
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);    
        id = s;
        
        
        if(v!=null)
        {
           DefaultTableModel dtm = (DefaultTableModel) tblTotal.getModel();
            
            for(int i=0;i<v.size();i++)
            {
                String[] a = null;
                a = (String[]) v.elementAt(i);
                System.out.println(a);
                dtm.addRow(a);
            }        
        }
        getSum();
        
    }
    public void getSum()
    {
        
        int sum = 0;
        for(int i=0; i<tblTotal.getRowCount(); i++)
        {
            sum=sum+Integer.parseInt(tblTotal.getValueAt(i,2).toString());
            
        }
        lblCost.setText(Integer.toString(sum));
        lblt.setText("12%");
        
        final double tax = sum+(0.12*sum);
        
        lblc.setText(Integer.toString((int)tax));
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
        tblTotal = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblt = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        lblFinalCost = new javax.swing.JLabel();
        lblWelcome1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirm Packs");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        tblTotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "Default", "500"}
            },
            new String [] {
                "Pack ID", "Pack Name", "Pack Cost"
            }
        ));
        tblTotal.setIntercellSpacing(new java.awt.Dimension(10, 1));
        tblTotal.setRowHeight(30);
        jScrollPane1.setViewportView(tblTotal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 220, 370, 180);

        lblTotal.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total Amount :");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(780, 220, 150, 30);

        lblCost.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCost);
        lblCost.setBounds(1010, 220, 100, 30);

        lblTax.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTax.setText("Tax :");
        getContentPane().add(lblTax);
        lblTax.setBounds(810, 290, 100, 30);

        lblt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblt);
        lblt.setBounds(1010, 290, 100, 30);

        lblc.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblc);
        lblc.setBounds(1010, 360, 100, 30);

        lblFinalCost.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblFinalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalCost.setText("Final Cost :");
        getContentPane().add(lblFinalCost);
        lblFinalCost.setBounds(780, 360, 150, 30);

        lblWelcome1.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome1.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        lblWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome1.setText("Confirm  final  packages");
        getContentPane().add(lblWelcome1);
        lblWelcome1.setBounds(390, 50, 510, 47);

        lblBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\back.png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(90, 50, 90, 90);

        lblConfirm.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\confirm.jpg")); // NOI18N
        lblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmMouseClicked(evt);
            }
        });
        getContentPane().add(lblConfirm);
        lblConfirm.setBounds(730, 490, 210, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\url.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1420, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked

        this.setVisible(false);
        new frmDefPack(id).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseClicked
        
        Connection j = new Connection();
        DBCollection dbc = j.connection("pcust");
        int t = tblTotal.getRowCount();
        String[] ab = new String[t];
                
        for(int i = 0;i<t;i++)
        {
            ab[i] = tblTotal.getValueAt(i, 1).toString();
        }
        
        String abc = "";
        BasicDBObject search = new BasicDBObject();
        search.put("Custid", id);
        BasicDBObject bdb = new BasicDBObject();
        DBCursor cursor = dbc.find(search);
        while(cursor.hasNext())
        {
            DBObject obj = cursor.next();
            abc = (String)obj.get("Custid");  
        }
        
        if(abc!="")
        {
            bdb.put("Custid",id);
            bdb.put("Packages",ab);
            bdb.put("Pack_cost",lblc.getText());
            dbc.update(search,bdb);
        }    
        else
        {
            DBObject document = new BasicDBObject("Custid",id)
               .append("Packages", Arrays.asList(ab))
               .append("Pack_cost", lblc.getText());

            dbc.insert(document);
        }
        
  ///////////// For count ////////////////
        
        if(t>1)
        {
            DBCollection dbc1 = j.connection("Analysis");
            String pid = "";
            for(int i = 1; i<t;i++)
            {
                BasicDBObject bdb1 = new BasicDBObject();
                pid = tblTotal.getValueAt(i,0).toString();
                bdb1.put("Packid",pid);
                dbc1.insert(bdb1);
            }
        }
        
        final JOptionPane jo = new JOptionPane();
        JOptionPane.showMessageDialog(jo,"Done!!!","Success",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        new  frmBill(id).setVisible(true);
    }//GEN-LAST:event_lblConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(frmFinalpack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFinalpack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFinalpack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFinalpack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblFinalCost;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblWelcome1;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblt;
    private javax.swing.JTable tblTotal;
    // End of variables declaration//GEN-END:variables
}
