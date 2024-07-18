/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.UserDAO;
import java.awt.Color;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.UserModel;
import service.UserService;

/**
 *
 * @author Hamer
 */
public class Login extends javax.swing.JFrame {

    private UserService userService;
    private int xMouse, yMouse;

    public Login() {
        initComponents();
        Path projectDir = Paths.get(System.getProperty("user.dir"));
        userService = new UserService(new UserDAO());

        this.setLocationRelativeTo(null);
        Icon icon = new ImageIcon(
                new ImageIcon(getClass().getResource("/imagenes/login.jpg")).getImage()
                        .getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), 0));
        imageLabel.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        barJPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        passwordTextField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        logInButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N
        imageLabel.setText("jLabel1");
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 370, 470));

        barJPanel.setBackground(new java.awt.Color(255, 255, 255));
        barJPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barJPanelMouseDragged(evt);
            }
        });
        barJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barJPanelMouseClicked(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                barJPanelMousePressed(evt);
            }
        });
        barJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        barJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        getContentPane().add(barJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setText("Ingrese su nombre de usuario");
        usernameTextField.setBorder(null);
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseClicked(evt);
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
        bg.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 350, 30));

        jLabelpassword.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabelpassword.setText("Contraseña");
        bg.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabelUsuario.setText("Usuario");
        bg.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel1.setText("No tienes cuenta?");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, -1));

        jLabel2.setFont(new java.awt.Font("Playwrite NG Modern", 1, 18)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 230, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 360, 10));

        passwordTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setText("jPasswordField1");
        passwordTextField.setBorder(null);
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });
        bg.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 360, 30));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, 10));

        jLabel3.setForeground(new java.awt.Color(37, 55, 69));
        jLabel3.setText("registrarse");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 60, -1));

        logInButton.setBackground(new java.awt.Color(74, 92, 106));
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
        });
        logInButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar");
        logInButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        bg.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 360, 40));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameTextFieldActionPerformed

    private void usernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usernameTextFieldMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_usernameTextFieldMouseClicked

    private void usernameTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usernameTextFieldMousePressed
        usernameTextField.setText("");
        usernameTextField.setForeground(Color.black);
    }// GEN-LAST:event_usernameTextFieldMousePressed

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordTextFieldMousePressed
        passwordTextField.setText("");
        passwordTextField.setForeground(Color.black);
    }// GEN-LAST:event_passwordTextFieldMousePressed

    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logInButtonMouseClicked
        String password = String.valueOf(passwordTextField.getPassword());
        String username = usernameTextField.getText();
        UserModel user = userService.checkUserandPassword(username, password);
        if (user != null) {
            if (user.getIsAdmin() == 0) {
                UserView userView = new UserView(user);
                userView.setVisible(true);
                this.dispose();
            } else if (user.getIsAdmin() == 1) {
                AdminView adminView = new AdminView();
                adminView.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_logInButtonMouseClicked

    private void barJPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barJPanelMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_barJPanelMouseClicked

    private void barJPanelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barJPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }// GEN-LAST:event_barJPanelMousePressed

    private void barJPanelMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barJPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }// GEN-LAST:event_barJPanelMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        RegisterView registerView = new RegisterView();
        registerView.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barJPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel logInButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
