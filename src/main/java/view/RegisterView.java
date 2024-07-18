/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.UserDAO;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.UserModel;
import service.UserService;

/**
 *
 * @author Hamer
 */
public class RegisterView extends javax.swing.JFrame {
    private UserService userService;
    private Path projectDir;
    private JFileChooser fileChooser;
    private Path photoProfilesourcePath;
    private String photoProfileFileExtentions;
    private File selectedFile;

    private int xMouse, yMouse;

    public RegisterView() {
        initComponents();
        SetIconLabel(profilePhotocircularLabel, "/icons/useraddicon.png");
        profilePhotocircularLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        projectDir = Paths.get(System.getProperty("user.dir"));
        userService = new UserService(new UserDAO());
        selectedFile = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombresTextField = new javax.swing.JTextField();
        apellidosTextField = new javax.swing.JTextField();
        dniTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        profilePhotocircularLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        registerButtonPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barPanel.setBackground(new java.awt.Color(255, 255, 255));
        barPanel.setName(""); // NOI18N
        barPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barPanelMouseDragged(evt);
            }
        });
        barPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barPanelMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
        barPanel.setLayout(barPanelLayout);
        barPanelLayout.setHorizontalGroup(
                barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barPanelLayout.createSequentialGroup()
                                .addGap(0, 468, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        barPanelLayout.setVerticalGroup(
                barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        getContentPane().add(barPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel5.setText("email:");

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("DNI:");

        nombresTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        nombresTextField.setForeground(new java.awt.Color(204, 204, 204));
        nombresTextField.setText("Ingresar nombres completos");
        nombresTextField.setBorder(null);
        nombresTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombresTextFieldMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombresTextFieldMousePressed(evt);
            }
        });
        nombresTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresTextFieldActionPerformed(evt);
            }
        });

        apellidosTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        apellidosTextField.setForeground(new java.awt.Color(204, 204, 204));
        apellidosTextField.setText("Ingresar apellido paterno y materno");
        apellidosTextField.setBorder(null);
        apellidosTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidosTextFieldMousePressed(evt);
            }
        });

        dniTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        dniTextField.setForeground(new java.awt.Color(204, 204, 204));
        dniTextField.setText("Ingresar dni");
        dniTextField.setBorder(null);
        dniTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dniTextFieldMousePressed(evt);
            }
        });

        emailTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(204, 204, 204));
        emailTextField.setText("Ingresar email");
        emailTextField.setBorder(null);
        emailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailTextFieldMousePressed(evt);
            }
        });
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel7.setText("Dirección:");

        direccionTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        direccionTextField.setForeground(new java.awt.Color(204, 204, 204));
        direccionTextField.setText("Ingresar dirección");
        direccionTextField.setBorder(null);
        direccionTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTextFieldMousePressed(evt);
            }
        });

        profilePhotocircularLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilePhotocircularLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePhotocircularLabelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("DATOS PERSONALES");

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel9.setText("Contraseña:");

        usernameTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setText("Ingresar un nombre de usuario");
        usernameTextField.setBorder(null);
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameTextFieldMousePressed(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setText("Ingresar contraseña");
        passwordTextField.setBorder(null);
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });

        registerButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        registerButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonPanelMouseClicked(evt);
            }
        });
        registerButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrarse");
        registerButtonPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, -1, 20));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(profilePhotocircularLabel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(184, Short.MAX_VALUE))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(bgLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addGroup(bgLayout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addGroup(bgLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(nombresTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(apellidosTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(dniTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(emailTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator9,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel7)
                                                                .addComponent(direccionTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(bgLayout.createSequentialGroup()
                                                                        .addGap(100, 100, 100)
                                                                        .addComponent(registerButtonPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                170,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(0, 0, Short.MAX_VALUE))));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(profilePhotocircularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175,
                                        Short.MAX_VALUE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 294,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(0, 215, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(5, 5, 5)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel9)
                                        .addGap(5, 5, 5)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel2)
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3)
                                        .addGap(5, 5, 5)
                                        .addComponent(nombresTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel4)
                                        .addGap(5, 5, 5)
                                        .addComponent(apellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel6)
                                        .addGap(5, 5, 5)
                                        .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel5)
                                        .addGap(5, 5, 5)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel7)
                                        .addGap(5, 5, 5)
                                        .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(bgLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(bgLayout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(registerButtonPanel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 15, Short.MAX_VALUE))));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barPanelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }// GEN-LAST:event_barPanelMousePressed

    private void barPanelMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }// GEN-LAST:event_barPanelMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_jLabel1MouseClicked

    private void nombresTextFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nombresTextFieldMouseExited
        // TODO add your handling code here:

    }// GEN-LAST:event_nombresTextFieldMouseExited

    private void nombresTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nombresTextFieldMousePressed
        // TODO add your handling code here:
        nombresTextField.setText("");
        nombresTextField.setForeground(Color.black);
    }// GEN-LAST:event_nombresTextFieldMousePressed

    private void nombresTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nombresTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nombresTextFieldActionPerformed

    private void apellidosTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_apellidosTextFieldMousePressed
        // TODO add your handling code here:
        apellidosTextField.setText("");
        apellidosTextField.setForeground(Color.black);
    }// GEN-LAST:event_apellidosTextFieldMousePressed

    private void dniTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dniTextFieldMousePressed
        // TODO add your handling code here:
        dniTextField.setText("");
        dniTextField.setForeground(Color.black);
    }// GEN-LAST:event_dniTextFieldMousePressed

    private void emailTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_emailTextFieldMousePressed
        // TODO add your handling code here:
        emailTextField.setText("");
        emailTextField.setForeground(Color.black);
    }// GEN-LAST:event_emailTextFieldMousePressed

    private void direccionTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_direccionTextFieldMousePressed
        // TODO add your handling code here:
        direccionTextField.setText("");
        direccionTextField.setForeground(Color.black);
    }// GEN-LAST:event_direccionTextFieldMousePressed

    private void profilePhotocircularLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_profilePhotocircularLabelMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            photoProfilesourcePath = Paths.get(selectedFile.getAbsolutePath());
            photoProfileFileExtentions = photoProfilesourcePath.toString()
                    .substring(photoProfilesourcePath.toString().lastIndexOf(".") + 1);
            try {
                setCircleImageLabel(selectedFile, profilePhotocircularLabel);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }// GEN-LAST:event_profilePhotocircularLabelMouseClicked

    private void usernameTextFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usernameTextFieldMouseExited
        // TODO add your handling code here:

    }// GEN-LAST:event_usernameTextFieldMouseExited

    private void usernameTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usernameTextFieldMousePressed
        // TODO add your handling code here:
        usernameTextField.setText("");
        usernameTextField.setForeground(Color.black);
    }// GEN-LAST:event_usernameTextFieldMousePressed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameTextFieldActionPerformed

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordTextFieldMousePressed
        // TODO add your handling code here:
        passwordTextField.setText("");
        passwordTextField.setForeground(Color.black);
    }// GEN-LAST:event_passwordTextFieldMousePressed

    private void registerButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerButtonPanelMouseClicked
        // TODO add your handling code here:
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();
        String names = nombresTextField.getText().trim();
        String lastnames = apellidosTextField.getText().trim();
        String dni = dniTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String address = direccionTextField.getText().trim();
        String urlProfilePhoto = selectedFile != null
                ? "/UserprofilePhotos/" + dni.toLowerCase() + "." + photoProfileFileExtentions
                : "/UserprofilePhotos/defaultPhoto.jpg";

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username no puede estar vacío.");
            return;
        }
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password no puede estar vacío.");
            return;
        }
        if (names.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombres no puede estar vacío.");
            return;
        }
        if (lastnames.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Apellidos no puede estar vacío.");
            return;
        }
        if (dni.isEmpty() || !dni.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "DNI no puede estar vacío.");
            return;
        } else {
            if (dni.length() > 8) {
                JOptionPane.showMessageDialog(null, "DNI solo debe tener 8 caracteres.");
                return;
            }
        }

        if (email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(null, "Email no valido.");
            return;
        }
        if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address no puede estar vacío..");
            return;
        }
        userService.insertUser(new UserModel(username, password, 0, urlProfilePhoto, names, lastnames, dni, address, email));
        if (selectedFile == null) {
            this.dispose();
            return;
        }

        try {
            Path imagetargetDirectory = Paths.get(projectDir + "/imagenes" + urlProfilePhoto);
            Files.copy(photoProfilesourcePath, imagetargetDirectory, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(BooksAddAdminPanelView.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login login = new Login();
        login.setVisible(true);
        this.dispose();

    }// GEN-LAST:event_registerButtonPanelMouseClicked

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_emailTextFieldActionPerformed

    private void SetIconLabel(JLabel label, String url) {
        Icon icon = new ImageIcon(
                new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(90, 90, 0));

        label.setIcon(icon);

    }

    private void setCircleImageLabel(File file, JLabel label) throws IOException {
        BufferedImage master = ImageIO.read(file);
        int diameter = Math.min(label.getWidth(), label.getHeight());

        // Create the mask
        BufferedImage mask = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = mask.createGraphics();
        applyQualityRenderingHints(g2d);
        g2d.fillOval(0, 0, diameter, diameter);
        g2d.dispose();

        // Scale the image to fit the circle
        BufferedImage scaledImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        g2d = scaledImage.createGraphics();
        applyQualityRenderingHints(g2d);
        g2d.drawImage(master, 0, 0, diameter, diameter, null);
        g2d.dispose();

        // Apply the mask to the scaled image
        BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        g2d = masked.createGraphics();
        applyQualityRenderingHints(g2d);
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
        g2d.drawImage(mask, 0, 0, null);
        g2d.dispose();

        // Set the label icon
        label.setIcon(new ImageIcon(masked));
    }

    public static void applyQualityRenderingHints(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosTextField;
    private javax.swing.JPanel barPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombresTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel profilePhotocircularLabel;
    private javax.swing.JPanel registerButtonPanel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
