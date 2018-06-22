
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class frmPdetail extends javax.swing.JFrame {

    
    String id = "";
    
    public frmPdetail(String a) {
        
        id = a;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDos = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        setlbl = new javax.swing.JLabel();
        lblCustid = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblWelcome1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Details");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnUpdate.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(710, 550, 120, 36);

        lblName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name :");
        getContentPane().add(lblName);
        lblName.setBounds(110, 230, 130, 30);

        lblPhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone No :");
        getContentPane().add(lblPhone);
        lblPhone.setBounds(670, 230, 130, 30);

        lblGender.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender :");
        getContentPane().add(lblGender);
        lblGender.setBounds(110, 310, 130, 30);

        lblEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email :");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(110, 390, 130, 30);

        lblAddress.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("Address :");
        getContentPane().add(lblAddress);
        lblAddress.setBounds(670, 310, 130, 30);

        lblDos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDos.setText("Date_subs :");
        getContentPane().add(lblDos);
        lblDos.setBounds(670, 150, 130, 30);

        txtName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(310, 230, 220, 30);

        txtPhone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneFocusLost(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(850, 230, 220, 30);

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(310, 390, 220, 30);

        txtGender.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtGender);
        txtGender.setBounds(310, 310, 220, 30);
        getContentPane().add(setlbl);
        setlbl.setBounds(1075, 11, 26, 0);

        lblCustid.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCustid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustid.setText("Customer ID :");
        getContentPane().add(lblCustid);
        lblCustid.setBounds(120, 150, 130, 30);

        lblid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblid);
        lblid.setBounds(310, 150, 220, 30);

        lblDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblDate);
        lblDate.setBounds(850, 150, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\homegif (3).gif")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 40, 80, 80);

        lblWelcome1.setBackground(new java.awt.Color(204, 255, 255));
        lblWelcome1.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        lblWelcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome1.setText("YOUR  PERSONAL  DETAILS");
        getContentPane().add(lblWelcome1);
        lblWelcome1.setBounds(430, 40, 510, 47);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAddress.setRows(2);
        txtAddress.setTabSize(4);
        jScrollPane2.setViewportView(txtAddress);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(850, 320, 220, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\download--3-.jpg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 50, 150, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\update (3).jpg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 450, 100, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\url.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1440, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    public void update()
    {
        final JOptionPane jo = new JOptionPane();
        if(txtPhone.getText().equals("") || (txtGender.getText().equals("")) || txtEmail.getText().equals("") || txtAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(jo,"Please fill all the fields!!!","Error",JOptionPane.ERROR_MESSAGE);
            txtGender.setText("");
        }
        
        else
        {
            Connection c = new Connection();
            DBCollection dbc = c.connection("cust");
            BasicDBObject search = new BasicDBObject();
            search.put("Custid",id);
            BasicDBObject bdb = new BasicDBObject();

            bdb.put("Custid",id);
            bdb.put("Name",txtName.getText());
            bdb.put("Pno",txtPhone.getText());
            if(txtGender.getText().equals("male") || txtGender.getText().equals("MALE") || txtGender.getText().equals("Male") || txtGender.getText().equals("female") || txtGender.getText().equals("FEMALE") || txtGender.getText().equals("Female"))
                bdb.put("Gender",txtGender.getText());
            else
                JOptionPane.showMessageDialog(jo,"Please fill correct gender!!!","Error",JOptionPane.ERROR_MESSAGE);
            bdb.put("Email",txtEmail.getText());
            bdb.put("Address",txtAddress.getText());        
            bdb.put("Date_subs",lblDate.getText());
            dbc.update(search,bdb);
            
            JOptionPane.showMessageDialog(jo,"Record Updated!!!","Success",JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
            
        Connection j = new Connection();
        DBCollection dbc = j.connection("cust");
       
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("Custid", id);
        DBCursor cursor = dbc.find(whereQuery);
        
        String cid = "";
        String name = "";
        String phone = "";
        String gender = "";
        String email = "";
        String add = "";
        String dos = "";
                
        while(cursor.hasNext())
        {    
            DBObject obj = cursor.next();
            cid = (String) obj.get("Custid");
            name = (String)obj.get("Name");
            phone = (String)obj.get("Pno");
            gender = (String)obj.get("Gender");
            email = (String)obj.get("Email");
            add = (String)obj.get("Address");
            dos = (String)obj.get("Date_subs");
        }
        
        lblid.setText(cid);
        txtName.setText(name);
        txtPhone.setText(phone);
        txtGender.setText(gender);
        txtEmail.setText(email);
        txtAddress.setText(add);
        lblDate.setText(dos);
    }//GEN-LAST:event_formWindowActivated

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        
        final KeyEvent k=evt;

        txtPhone.addKeyListener(new KeyAdapter()
        {

            public void keyTyped(KeyEvent e) 
            {
                  final char c=k.getKeyChar();
                  if (((c < '0') || (c > '9')) && (c != '\b')) 
                  {
                    txtPhone.setBackground(Color.red);
                    txtPhone.setEditable(false);
                  }
                  else
                  {
                      txtPhone.setEditable(true);
                      txtPhone.setBackground(Color.white);
                  }
        }
        });
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        
        final KeyEvent k=evt;
        
        txtName.addKeyListener(new KeyAdapter(){
           
            public void keyTyped(KeyEvent e) 
            {
              final char c=k.getKeyChar();
              if(Character.isDigit(c))
              {
                  txtName.setBackground(Color.red);
                  txtName.setEditable(false);
              }
              else
              {
                  txtName.setBackground(Color.white);
                  txtName.setEditable(true);
              }
            }
        });
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
        
        JOptionPane jo = new JOptionPane();
        int i = txtPhone.getText().length();
        if(i!=10)
        {
            JOptionPane.showMessageDialog(jo,"Please enter a valid mobile no!!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPhoneFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        
        JOptionPane jo = new JOptionPane();
        String emailID = txtEmail.getText();
        String emailRE = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$" ;

        Boolean flag = emailID.matches(emailRE);

        if (flag)
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(jo,"Please enter a valid email ID!!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        new frmChoose().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        new frmDetails(id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        update();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(frmPdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCustid;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblWelcome1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel setlbl;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
