/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.UserDAO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.UserModel;
import service.UserService;

/**
 *
 * @author Hamer
 */
public class ConfigUserPanelView extends javax.swing.JPanel {

    private Path projectDir;
    private Path imagePerfilSourcePath;
    private String imageBookfileExtentions;
    private UserService userService;
    private  UserView userView;
    private int idUser;
    private UserModel user;
    
    public ConfigUserPanelView() {
        initComponents();
    }
    public ConfigUserPanelView(UserModel user) {
        projectDir = Paths.get(System.getProperty("user.dir"));
        initComponents();
        userService = new UserService(new UserDAO());
        namesTextField.setText(user.getNombres());
        dniTextField.setText(user.getDni());
        surnamesTextField.setText(user.getApellidos());
        passwordTextField.setText(user.getPassword());
        usernameTextField.setText(user.getUsername());
        emailTextField.setText(user.getEmail());
        addressTextField.setText(user.getUsername());
        setProfilePhotoImageLabel(user.getUrlProfilePhoto());
        this.idUser = user.getId();
        this.user = user;
        imageBookfileExtentions = user.getUrlProfilePhoto().toString().substring(user.getUrlProfilePhoto().toString().lastIndexOf(".") + 1);
        
    }
    
     public ConfigUserPanelView(UserModel user, UserView userview) {
        projectDir = Paths.get(System.getProperty("user.dir"));
        initComponents();
        userService = new UserService(new UserDAO());
        namesTextField.setText(user.getNombres());
        dniTextField.setText(user.getDni());
        surnamesTextField.setText(user.getApellidos());
        passwordTextField.setText(user.getPassword());
        usernameTextField.setText(user.getUsername());
        emailTextField.setText(user.getEmail());
        addressTextField.setText(user.getUsername());
        setProfilePhotoImageLabel(user.getUrlProfilePhoto());
        this.idUser = user.getId();
        this.user = user;
        imageBookfileExtentions = user.getUrlProfilePhoto().toString().substring(user.getUrlProfilePhoto().toString().lastIndexOf(".") + 1);
        this.userView=userview;
        
    }
    
    public void setProfilePhotoImageLabel(String url) {
        Icon icon = new ImageIcon(
               new ImageIcon(projectDir+"/imagenes"+url.trim()).getImage().getScaledInstance(230, 280, 0)
        );
        profilePhotoImageLabel.setIcon(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePhotoImageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namesTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        surnamesTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        saveButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilePhotoImageLabel.setBackground(new java.awt.Color(204, 204, 204));
        profilePhotoImageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilePhotoImageLabel.setOpaque(true);
        profilePhotoImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePhotoImageLabelMouseClicked(evt);
            }
        });
        add(profilePhotoImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 194, 267));

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, 20));

        usernameTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        usernameTextField.setText("jTextField1");
        usernameTextField.setBorder(null);
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 20));

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel3.setText("Nombres");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 60, 20));

        namesTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        namesTextField.setText("jTextField2");
        namesTextField.setBorder(null);
        add(namesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 260, 20));

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 20));

        passwordTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        passwordTextField.setText("jTextField2");
        passwordTextField.setBorder(null);
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 20));

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel5.setText("email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 20));

        emailTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        emailTextField.setText("jTextField2");
        emailTextField.setBorder(null);
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 20));

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("Apellidos");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, -1));

        surnamesTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        surnamesTextField.setText("jTextField1");
        surnamesTextField.setBorder(null);
        add(surnamesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 266, -1));

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("DNI");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 56, -1));

        dniTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        dniTextField.setText("jTextField2");
        dniTextField.setBorder(null);
        add(dniTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 260, -1));

        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel9.setText("Dirección");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, -1));

        addressTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addressTextField.setText("jTextField2");
        addressTextField.setBorder(null);
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 260, -1));

        saveButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        saveButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Guardar");

        javax.swing.GroupLayout saveButtonPanelLayout = new javax.swing.GroupLayout(saveButtonPanel);
        saveButtonPanel.setLayout(saveButtonPanelLayout);
        saveButtonPanelLayout.setHorizontalGroup(
            saveButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(saveButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(saveButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        saveButtonPanelLayout.setVerticalGroup(
            saveButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(saveButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(saveButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(saveButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 280, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 280, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 280, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 280, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonPanelMouseClicked
        
        String names = namesTextField.getText().trim();
        String lastnames = surnamesTextField.getText().trim();
        String dni = dniTextField.getText().trim();
        Path imagetargetDirectory = Paths.get((projectDir + "/imagenes/UserprofilePhotos/"+ dni +"."+ imageBookfileExtentions).trim());
        String password = passwordTextField.getText().trim();
        String username = usernameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String urlImage = "/UserprofilePhotos/"+dni+"."+imageBookfileExtentions;
        
        
        if (names.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombres no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (lastnames.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de apellidos no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de DNI no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(dni.length() > 8){
            JOptionPane.showMessageDialog(null, "El campo de DNI solo puede tener una longitud de 8 carácteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de contraseña no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombre de usuario no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de email no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de dirección no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UserModel user = new UserModel(idUser, username, password, urlImage, names, lastnames, dni, address, email);
        userService.updateUser(user);
        if(imagePerfilSourcePath == null){
            imagePerfilSourcePath = Paths.get((projectDir+"/imagenes"+this.user.getUrlProfilePhoto()).trim());
           
        }
            try {
                Files.copy(imagePerfilSourcePath, imagetargetDirectory, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(BooksAddAdminPanelView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error copying image file", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog(null, "Actualizaste tu perfil correctamente");
        
        userView.setUsernameLabel(username);
        try {
            userView.setCircleImageLabel(new File((projectDir+"/imagenes"+urlImage).trim()));
        } catch (IOException ex) {
            Logger.getLogger(ConfigUserPanelView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveButtonPanelMouseClicked

    private void profilePhotoImageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePhotoImageLabelMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();            
            imagePerfilSourcePath = Paths.get(selectedFile.getAbsolutePath()); 
            imageBookfileExtentions = imagePerfilSourcePath.toString().substring(imagePerfilSourcePath.toString().lastIndexOf(".") + 1);            
            try {
                setImageLabel(selectedFile.getAbsolutePath(), profilePhotoImageLabel.getWidth(), profilePhotoImageLabel.getHeight());               
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
    }//GEN-LAST:event_profilePhotoImageLabelMouseClicked

    private void setImageLabel(String url, int width, int height){
        Icon icon = new ImageIcon(
               new ImageIcon(url).getImage().getScaledInstance(width, height, 0)
            );
        profilePhotoImageLabel.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField namesTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel profilePhotoImageLabel;
    private javax.swing.JPanel saveButtonPanel;
    private javax.swing.JTextField surnamesTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
