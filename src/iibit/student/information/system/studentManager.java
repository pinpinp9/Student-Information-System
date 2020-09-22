
package iibit.student.information.system;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import net.proteanit.sql.DbUtils;// import table
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class studentManager extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
 FileOutputStream fos = null;
String filename = null;

   
    public studentManager() throws SQLException {
        initComponents();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        Update_Table();
    }
 
  
    public void Update_Table(){
        try{
            String sql="SELECT * FROM students";
            conn = database.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Student_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
    }
     
 
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextStudentId = new javax.swing.JTextField();
        TextFirstName = new javax.swing.JTextField();
        TextLastName = new javax.swing.JTextField();
        TextAddress = new javax.swing.JTextField();
        TextContactNumber = new javax.swing.JTextField();
        TextCourse = new javax.swing.JTextField();
        TextGrade = new javax.swing.JTextField();
        TextUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Add_button = new javax.swing.JButton();
        Update_button = new javax.swing.JButton();
        Delete_button = new javax.swing.JButton();
        Clear_button = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        imageFrame = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Text_SearchID = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Student_table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 220, 220));

        jPanel5.setBackground(new java.awt.Color(173, 169, 169));

        jPanel2.setBackground(new java.awt.Color(231, 227, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Firstname");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lastname");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Phone");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Course");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Grade");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Username");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Password");

        TextStudentId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLastNameActionPerformed(evt);
            }
        });

        TextAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextContactNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextCourse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextGrade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsernameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Email");

        TextEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(231, 227, 227));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Add_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Add_button.setText("Add");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        Update_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Update_button.setText("Update");
        Update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_buttonActionPerformed(evt);
            }
        });

        Delete_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete_button.setText("Delete");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });

        Clear_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Clear_button.setText("Clear");
        Clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Clear_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Add_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(Delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(male)
                        .addGap(28, 28, 28)
                        .addComponent(female))
                    .addComponent(TextStudentId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextEmail)
                    .addComponent(TextAddress)
                    .addComponent(TextLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextContactNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextGrade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextUsername)
                    .addComponent(jPasswordField1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Text_SearchID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text_SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_SearchIDActionPerformed(evt);
            }
        });

        Search_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Search_button.setText("Search");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Student_table);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setText("                     Student  Information ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Attach image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        // TODO add your handling code here:
             
                 try{
                

                    conn = database.getConnection();
                    String sql = "SELECT * from students where student_id=?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,Text_SearchID.getText());
                    rs=pst.executeQuery();
                    
                    //If there is a row, then...
                    if(rs.next()){
                        
                    //Data is retrieved
                    String add1 =rs.getString("student_id");
                    TextStudentId.setText(add1);
                    
                    String add2 =rs.getString("firstname");
                    TextFirstName.setText(add2);
                    
                    String add3 =rs.getString("lastname");
                    TextLastName.setText(add3);
                    
                    String add4 =rs.getString("contactnumber");
                    TextContactNumber.setText(add4);
                    
                    String add5 =rs.getString("email");
                    TextEmail.setText(add5);
                    
                    String add6 =rs.getString("address");
                    TextAddress.setText(add6);
                    
                    String add7 =rs.getString("course");
                    TextCourse.setText(add7);
                    
                    String add8 =rs.getString("grade");
                    TextGrade.setText(add8);
                    
                    String add9 =rs.getString("username");
                    TextUsername.setText(add9);
                    
                    String add10 =rs.getString("password");
                    jPasswordField1.setText(add10);  
                    
                    String Gen = rs.getString("gender");
                    if(Gen.equals("female")){
                        female.setSelected(true);
                        male.setSelected(false);
                    }if(Gen.equals("male")){
                        female.setSelected(false);
                        male.setSelected(true);
                    }
                    
//                     Blob blob=rs.getBlob(1);
//                      f=file.getSelectedFile();
//                      FileOutputStream fout=new FileOutputStream(f);
//   fout.write(blob.getBytes(12, (int)blob.length()));
//   fout.flush();
//   fout.close();
// 
                     InputStream is=rs.getBinaryStream("image");
                     byte[] b=new byte[is.available()];
   is.read(b);
   ImageIcon icon=new ImageIcon(b);
   imageFrame.setIcon(icon);
   is.close();
                    
                  //imageFrame.setIcon(ResizeImage(null,  rs.getBytes("image"))); 
                  
                                     

                    
                    }
                    
                 
                    
                    
                    
       }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
         finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
                 }
                
    }//GEN-LAST:event_Search_buttonActionPerformed

    private void Text_SearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_SearchIDActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_Text_SearchIDActionPerformed

    private void Clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_buttonActionPerformed
        // TODO add your handling code here:
        Text_SearchID.setText("");
        TextStudentId.setText("");
        TextFirstName.setText("");
        TextLastName.setText("");
        TextContactNumber.setText("");
        TextEmail.setText("");
        TextAddress.setText("");
        TextCourse.setText("");
        TextGrade.setText("");
        TextUsername.setText("");
        jPasswordField1.setText("");
        imageFrame.setIcon(null);
    }//GEN-LAST:event_Clear_buttonActionPerformed

    private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            
            try{
            conn = database.getConnection();
            String delete ="delete from students where student_id =?";
            pst=conn.prepareStatement(delete);
            pst.setString(1, TextStudentId.getText());
            pst.execute();
            //Pop-up Message 
            JOptionPane.showMessageDialog(null, "Record Deleted");  
            
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }    
                
            
        finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
          Update_Table(); 
        }
    }//GEN-LAST:event_Delete_buttonActionPerformed

    private void Update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_buttonActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null,"Are you sure you want to save record?","Save Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            try{
                String student_id = TextStudentId.getText();
                String sql="UPDATE students SET firstname=?,lastname=?,gender=?,"
                        + "contactnumber=?, email=?,address=?',course=?,"
                        + "grade=?,username=?,password=?,image=?,"
                         + "WHERE student_id ='"+student_id+"' ";
                conn = database.getConnection();
                pst=conn.prepareStatement(sql);
                  pst.setString(1,TextFirstName.getText());
            pst.setString(2,TextLastName.getText());
            pst.setString(3,gender); 
            pst.setString(4,TextContactNumber.getText());
            pst.setString(5,TextEmail.getText());
            pst.setString(6,TextAddress.getText());
            pst.setString(7,TextCourse.getText());
            pst.setString(8,TextGrade.getText());
            pst.setString(9,TextUsername.getText());
            pst.setString(10,jPasswordField1.getText());
            InputStream img = new FileInputStream(new File(imgPath));
            pst.setBlob(11,img);
            
                pst.executeUpdate();
                // POP-UP Message
                JOptionPane.showMessageDialog(null, "Record Updated");
                                              
            }catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
              finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
            
                 //Data is updated on the right side of the page
             Update_Table();       
            
            
            
            
        }
    }//GEN-LAST:event_Update_buttonActionPerformed

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        //pop up
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        //If yes, the data will be inserted.
        if(p==0){
        try{
            String sql1="INSERT INTO students(firstname,lastname,gender,contactnumber,email,address,course,grade,username,password,division,image)"
                    
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,'student',?)";
            
                   
            conn = database.getConnection();
            pst=conn.prepareStatement(sql1);
           
            pst.setString(1,TextFirstName.getText());
            pst.setString(2,TextLastName.getText());
            pst.setString(3,gender); 
            pst.setString(4,TextContactNumber.getText());
            pst.setString(5,TextEmail.getText());
            pst.setString(6,TextAddress.getText());
            pst.setString(7,TextCourse.getText());
            pst.setString(8,TextGrade.getText());
            pst.setString(9,TextUsername.getText());
            pst.setString(10,jPasswordField1.getText());
            InputStream img = new FileInputStream(new File(imgPath));
            pst.setBlob(11,img);
            pst.execute();
            // POP-UP Message
                JOptionPane.showMessageDialog(null,"Data added successfully");
                     
      }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
                  finally {

                try{
                    rs.close();
                    pst.close();
                }                  
                catch(Exception e){
                                 
            }
         }
        //Data is updated on the right side of the page
           Update_Table();
        }
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void TextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsernameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender ="male";
        male.setSelected(true);
        female.setSelected(false);
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender ="female";
        female.setSelected(true);
        male.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       //        Path currentRelativePath = Paths.get("");
//        String s = currentRelativePath.toAbsolutePath().toString();
//        System.out.println("Current relative path is: " + s);
        
        JFileChooser file = new JFileChooser();
        //file.showOpenDialog(null);
        File f = file.getSelectedFile();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));   //All window users use this path for directory
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
             System.out.println(path);
            imageFrame.setIcon(ResizeImage(path,null));
            
            imgPath = path;
        }
        
        /* JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
        image.setIcon(imageIcon);
      try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream(); 
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
       */
                
       
                                        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);       
        admin a = new admin();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLastNameActionPerformed

 
    public static void main(String args[]) {           
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new studentManager().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(studentManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Clear_button;
    private javax.swing.JButton Delete_button;
    private javax.swing.JButton Search_button;
    private javax.swing.JTable Student_table;
    private javax.swing.JTextField TextAddress;
    private javax.swing.JTextField TextContactNumber;
    private javax.swing.JTextField TextCourse;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextFirstName;
    private javax.swing.JTextField TextGrade;
    private javax.swing.JTextField TextLastName;
    private javax.swing.JTextField TextStudentId;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JTextField Text_SearchID;
    private javax.swing.JButton Update_button;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel imageFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    // End of variables declaration//GEN-END:variables

   private String gender;
     //String filename = null;
      //byte[] person_image = null;
      
     // private ImageIcon format =null;
     String imgPath=null;
     
     //Resize Image
      public ImageIcon ResizeImage(String ImagePath, byte[] pic)
      {
          ImageIcon MyImage = null;
          if (ImagePath != null){
              MyImage = new ImageIcon(ImagePath);
          }else
          {
              MyImage = new ImageIcon(pic);
          }
          Image img = MyImage.getImage();
          Image newImg = img.getScaledInstance(imageFrame.getWidth(), imageFrame.getHeight(), Image.SCALE_SMOOTH);
          ImageIcon Proimage = new ImageIcon(newImg);
          return Proimage;
              
      }
      


     

}
