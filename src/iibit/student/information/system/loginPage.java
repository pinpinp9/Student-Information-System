
package iibit.student.information.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class loginPage extends javax.swing.JFrame {
       Connection conn = null;
       PreparedStatement pst = null;
       ResultSet rs=null;
       
    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        jPanel3.setBackground(new Color(180,150,160,180));
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
       
        
    }
    public void loginAsStudent(){
           try{                   
              //if login person is a student         
              String S = "select * from students Where (username =? and password =? and division=?)";      
                             
               conn=database.getConnection();  
               pst = conn.prepareStatement(S);  
               pst.setString(1,TextUsername.getText());
               pst.setString(2,jPasswordField1.getText());
               pst.setString(3,division.getSelectedItem().toString());
               rs = pst.executeQuery();
                   System.out.println(rs);
               // looking for the matched account
                if(rs.next()){
                    
                    
                     JOptionPane.showMessageDialog(null, "Matched");
                     this.setVisible(false);   
                      studentInfo Sinfo = new studentInfo();
                      Sinfo.setVisible(true);
                    String add1 =rs.getString("student_id");
                    Sinfo.TextStudentId.setText(add1);
                    
                    String add2 =rs.getString("firstname");
                    Sinfo.TextFirstName.setText(add2);
                    
                    String add3 =rs.getString("lastname");
                    Sinfo.TextLastName.setText(add3);
                    
                    String add4 =rs.getString("contactnumber");
                    Sinfo.TextContactNumber.setText(add4);
                    
                    String add5 =rs.getString("email");
                    Sinfo.TextEmail.setText(add5);
                    
                    String add6 =rs.getString("address");
                    Sinfo.TextAddress.setText(add6);
                    
                    String add7 =rs.getString("course");
                    Sinfo.TextCourse.setText(add7);
                    
                    String add8 =rs.getString("grade");
                    Sinfo.TextGrade.setText(add8);
                                                     
                    String add9 = rs.getString("gender");                
                    Sinfo.TextGender.setText(add9);
                      
                      
                      
                      
                      
                      
                      
                      
                      
                    
                      
                              
              }    else{  
            JOptionPane.showMessageDialog(null, "Not Matched");
       }            
              }                   
          catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }                
    }
        
    
               
        
    
      public void loginAsAdmin(){
        try{                   
              //if login person is an admin       
              String A = "select * from  admin  Where (username =? and password =? and division=?)";      
                             
               conn=database.getConnection();  
               pst = conn.prepareStatement(A);  
               pst.setString(1,TextUsername.getText());
               pst.setString(2,jPasswordField1.getText());
               pst.setString(3,division.getSelectedItem().toString());
               rs = pst.executeQuery();
                   System.out.println(rs);
               // looking for the matched account
                if(rs.next()){
                      JOptionPane.showMessageDialog(null, "Matched");
                      this.setVisible(false);                           
                      new admin().setVisible(true);             
                              
              }    else{  
            JOptionPane.showMessageDialog(null, "Not Matched");
       }            
              }                   
          catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           } 
                        
               
        
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        division = new javax.swing.JComboBox<>();
        TextUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Division");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        Login_Button.setBackground(new java.awt.Color(0, 0, 0));
        Login_Button.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(240, 240, 240));
        Login_Button.setText("Login");
        Login_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        division.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "student", "admin" }));

        TextUsername.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addComponent(jPasswordField1)))
                    .addComponent(Login_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login_Button)
                .addGap(18, 18, 18))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sydney-bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        String access = (division.getSelectedItem().toString());
        if(access.equals("student")){
        loginAsStudent();
        }else{
       loginAsAdmin();
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_Button;
    public javax.swing.JTextField TextUsername;
    private javax.swing.JComboBox<String> division;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
