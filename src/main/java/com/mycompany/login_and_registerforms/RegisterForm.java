/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login_and_registerforms;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rootkali
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    //create a variable to set the image path in it
    String image_path=null;
    public RegisterForm() {
     
        
        initComponents();
        
        //creating a button group for radio buttons
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadiofemale);
        bg.add(jRadiomale);
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
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Close = new javax.swing.JLabel();
        jLabel3Min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        last = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        createaccount = new javax.swing.JButton();
        haveaccountlogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jTextFieldphoneNo = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadiomale = new javax.swing.JRadioButton();
        jRadiofemale = new javax.swing.JRadioButton();
        jButtonselectimage = new javax.swing.JButton();
        jLabel_imgpath = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Create Account");

        jLabel2Close.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2Close.setText("X");
        jLabel2Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2CloseMouseClicked(evt);
            }
        });

        jLabel3Min.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3Min.setText("-");
        jLabel3Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel2Close)
                .addGap(29, 29, 29)
                .addComponent(jLabel3Min)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2Close)
                    .addComponent(jLabel3Min))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(48, 42, 80));

        last.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        last.setForeground(new java.awt.Color(246, 234, 234));
        last.setText("Last Name:");

        phone.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(246, 234, 234));
        phone.setText("Phone no:");

        LastName.setBackground(new java.awt.Color(108, 122, 137));
        LastName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(240, 52, 37));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 229, 229));
        jButton1.setText("Cancel");

        createaccount.setBackground(new java.awt.Color(37, 167, 240));
        createaccount.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        createaccount.setForeground(new java.awt.Color(222, 213, 213));
        createaccount.setText("Create Account");
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccountMouseClicked(evt);
            }
        });
        createaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountActionPerformed(evt);
            }
        });

        haveaccountlogin.setForeground(new java.awt.Color(225, 227, 238));
        haveaccountlogin.setText("have an account? click here to login");
        haveaccountlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haveaccountloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                haveaccountloginMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(246, 234, 234));
        jLabel6.setText("Username:");

        confirmpassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        confirmpassword.setForeground(new java.awt.Color(246, 234, 234));
        confirmpassword.setText("Retype Pass:");

        Password.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(246, 234, 234));
        Password.setText("Password:");

        jTextFieldphoneNo.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldphoneNo.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jTextFieldphoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldphoneNoActionPerformed(evt);
            }
        });
        jTextFieldphoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldphoneNoKeyTyped(evt);
            }
        });

        username.setBackground(new java.awt.Color(108, 122, 137));
        username.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(108, 122, 137));
        password.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        confirmpass.setBackground(new java.awt.Color(108, 122, 137));
        confirmpass.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(246, 234, 234));
        jLabel9.setText("First Name:");

        FirstName.setBackground(new java.awt.Color(108, 122, 137));
        FirstName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(246, 234, 234));
        jLabel10.setText("GENDER:");

        jRadiomale.setSelected(true);
        jRadiomale.setText("male");

        jRadiofemale.setText("female");

        jButtonselectimage.setText("select image");
        jButtonselectimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonselectimageActionPerformed(evt);
            }
        });

        jLabel_imgpath.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel_imgpath.setForeground(new java.awt.Color(223, 44, 44));
        jLabel_imgpath.setText("imagepath");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(haveaccountlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmpassword)
                                    .addComponent(jLabel6)
                                    .addComponent(last)
                                    .addComponent(Password)
                                    .addComponent(phone)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldphoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(LastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(password)
                                    .addComponent(confirmpass)
                                    .addComponent(FirstName)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jRadiomale)
                                .addGap(18, 18, 18)
                                .addComponent(jRadiofemale))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonselectimage)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_imgpath)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(jTextFieldphoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadiomale)
                        .addComponent(jRadiofemale)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonselectimage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_imgpath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(haveaccountlogin)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2CloseMouseClicked
        System.exit(0); //exit the jframe window
    }//GEN-LAST:event_jLabel2CloseMouseClicked

    private void jLabel3MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MinMouseClicked

        this.setState(JFrame.ICONIFIED); //minimise the window

    }//GEN-LAST:event_jLabel3MinMouseClicked

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void haveaccountloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveaccountloginMouseClicked
        LoginForm reg=new LoginForm();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_haveaccountloginMouseClicked

    private void jTextFieldphoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldphoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldphoneNoActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_FirstNameActionPerformed

    private void createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseClicked
        
        
        
    }//GEN-LAST:event_createaccountMouseClicked

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void jTextFieldphoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldphoneNoKeyTyped
        // allow only numbers
        //give it the key typed event
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
            
    }//GEN-LAST:event_jTextFieldphoneNoKeyTyped

    private void jButtonselectimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonselectimageActionPerformed
        //select image and set the image path into a jlabel
        String path=null;
        JFileChooser chooser=new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extension=new FileNameExtensionFilter("*Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        int filestate=chooser.showSaveDialog(null);
        //check if the user selects an image
        if(filestate==JFileChooser.APPROVE_OPTION){
        File selectedImage=chooser.getSelectedFile();
        path=selectedImage.getAbsolutePath();
        jLabel_imgpath.setText(path);
        image_path=path;
        //create a function to verify the empty filed
        }
    }//GEN-LAST:event_jButtonselectimageActionPerformed

    private void createaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountActionPerformed
       
        String finame=FirstName.getText();
        String laname=LastName.getText();
        String usename=username.getText();
        String phne=phone.getText();
        String pass1=String.valueOf(password.getPassword());
        String pass2=String.valueOf(confirmpassword);
       String gender="Male";
       if(jRadiofemale.isSelected()){
           gender="Female";
       }
       if(VerifyFields()){
       
       if(!checkUsername(usename)){
       {
       PreparedStatement ps;
       ResultSet rs;
       String registerUserQuery="INSERT INTO `users`(`FirstName`,`LastName`,`username`,`phone`,`password`,`confirmpassword`,`Gender`,`picture`)VALUES(?,?,?,?,?,?,?,?)";
       
           try {
               ps=connectivity.getConnection().prepareStatement(registerUserQuery);
                 ps.setString(1,finame);
                 ps.setString(2,laname);
                 ps.setString(3,usename);
                 ps.setString(4,phne);
                 ps.setString(5,pass1);
                 ps.setString(6,pass2);
                 ps.setString(7,gender);
           try {
               //save image as blob
               if(image_path !=null){
               InputStream image=new FileInputStream(new File(image_path));
               ps.setBlob(8,image);
               
               }else{
               ps.setNull(8,java.sql.Types.NULL);
               }
             if(ps.executeUpdate() !=0){
             
             JOptionPane.showMessageDialog(null,"your account has been created");
             }else{
             JOptionPane.showMessageDialog(null,"Opps Account creation failed please try again");
            
             }
           
           } catch (FileNotFoundException ex) {
               Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (SQLException ex) {
               Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
           }
      
       }
       
       }
       }
       
    }//GEN-LAST:event_createaccountActionPerformed

    private void haveaccountloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveaccountloginMouseEntered
Border label_border=BorderFactory.createMatteBorder(0,0,1,0, new Color(0,204,0));
    haveaccountlogin.setBorder(label_border);    
        
        
    }//GEN-LAST:event_haveaccountloginMouseEntered
//create a function to verify the empty fields
    public boolean VerifyFields(){
    String fname=FirstName.getText();
    String lname=LastName.getText();
    String uname=username.getText();
    String ph=phone.getText();
    String pass1=String.valueOf(password);
    String pass2=String.valueOf(confirmpassword);
    //check empty fields
    if(fname.trim().equals("") || uname.trim().equals("") || ph.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
    {
        JOptionPane.showMessageDialog(null,"one or more fields are empty","Empty Fields",2);
        return false;
    }
    
    //check if the password and confimr password are equal and match
    
    else if(!pass1.equals(pass2)){
    
    JOptionPane.showMessageDialog(null,"password dont match","confirm password",2);
   
    return false;
    }
    else{
    //if everything is ok
    
    return true;
    }
    }
    
    //create a unction to check if the username already exsist in the database
    public boolean checkUsername(String username){
    PreparedStatement st;
    ResultSet rs;
    boolean username_exist=false;
    String query ="SELECT FORM `users` WHERE `username`=?";
    
        try {
            st=connectivity.getConnection().prepareStatement(query);
            st.setString(1,username);
             rs=st.executeQuery();
             
             if(rs.next()){
             
             username_exist=true;
             JOptionPane.showMessageDialog(null,"this username is already taken","username already in use",2);
      
             
             }
         } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    return username_exist;
    }
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel confirmpassword;
    private javax.swing.JButton createaccount;
    private javax.swing.JLabel haveaccountlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonselectimage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2Close;
    private javax.swing.JLabel jLabel3Min;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_imgpath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadiofemale;
    private javax.swing.JRadioButton jRadiomale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldphoneNo;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel last;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
