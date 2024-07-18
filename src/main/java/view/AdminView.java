/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Hamer
 */
public class AdminView extends javax.swing.JFrame {
    private Color bgColor;
    private Color focusColor;
    private int xMouse, yMouse;

    /**
     * Creates new form AdminView
     */
    public AdminView() {
        initComponents();
        buttonBook.setFocusable(true);
        bgColor = new Color(39, 60, 65);
        focusColor = new Color(69, 87, 91);
        BooksAddAdminPanelView b1 = new BooksAddAdminPanelView();
        b1.setSize(842, 535);
        b1.setLocation(0, 0);
        content.removeAll();
        content.add(b1, BorderLayout.CENTER);
        content.repaint();
        content.revalidate();
        SetIconLabel(logoutIconLabel, "/icons/logout.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        logoutIconLabel = new javax.swing.JLabel();
        buttonBook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonEditorialAuthor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonLoan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        buttonReserve = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userImage = new uicomponents.CircularLabel();
        barLabel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(39, 60, 65));

        logoutIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconLabelMouseClicked(evt);
            }
        });

        buttonBook.setBackground(new java.awt.Color(39, 60, 65));
        buttonBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buttonBookFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                buttonBookFocusLost(evt);
            }
        });
        buttonBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBookMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBookMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBookMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/libro.png"))); // NOI18N
        jLabel1.setText("LIBROS");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout buttonBookLayout = new javax.swing.GroupLayout(buttonBook);
        buttonBook.setLayout(buttonBookLayout);
        buttonBookLayout.setHorizontalGroup(
                buttonBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonBookLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        buttonBookLayout.setVerticalGroup(
                buttonBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonBookLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addContainerGap(16, Short.MAX_VALUE)));

        buttonEditorialAuthor.setBackground(new java.awt.Color(39, 60, 65));
        buttonEditorialAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditorialAuthor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buttonEditorialAuthorFocusGained(evt);
            }
        });
        buttonEditorialAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditorialAuthorMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditorialAuthorMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditorialAuthorMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documento.png"))); // NOI18N
        jLabel2.setText("EDITORIAL Y AUTOR");

        javax.swing.GroupLayout buttonEditorialAuthorLayout = new javax.swing.GroupLayout(buttonEditorialAuthor);
        buttonEditorialAuthor.setLayout(buttonEditorialAuthorLayout);
        buttonEditorialAuthorLayout.setHorizontalGroup(
                buttonEditorialAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonEditorialAuthorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        buttonEditorialAuthorLayout.setVerticalGroup(
                buttonEditorialAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonEditorialAuthorLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addContainerGap(16, Short.MAX_VALUE)));

        buttonLoan.setBackground(new java.awt.Color(39, 60, 65));
        buttonLoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoanMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoanMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoanMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documento.png"))); // NOI18N
        jLabel3.setText("PRESTAMOS");

        javax.swing.GroupLayout buttonLoanLayout = new javax.swing.GroupLayout(buttonLoan);
        buttonLoan.setLayout(buttonLoanLayout);
        buttonLoanLayout.setHorizontalGroup(
                buttonLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonLoanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        buttonLoanLayout.setVerticalGroup(
                buttonLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonLoanLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addContainerGap(16, Short.MAX_VALUE)));

        buttonReserve.setBackground(new java.awt.Color(39, 60, 65));
        buttonReserve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonReserveMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReserveMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonReserveMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reserva.png"))); // NOI18N
        jLabel4.setText("V1.2");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout buttonReserveLayout = new javax.swing.GroupLayout(buttonReserve);
        buttonReserve.setLayout(buttonReserveLayout);
        buttonReserveLayout.setHorizontalGroup(
                buttonReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonReserveLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addContainerGap()));
        buttonReserveLayout.setVerticalGroup(
                buttonReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonReserveLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addContainerGap(16, Short.MAX_VALUE)));

        userImage.setBackground(new java.awt.Color(255, 255, 255));
        userImage.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        userImage.setForeground(new java.awt.Color(255, 255, 255));
        userImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Userlog.png"))); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonLoan, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonEditorialAuthor, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonBook, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                menuPanelLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(buttonReserve,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(logoutIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonEditorialAuthor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonLoan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonReserve, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149,
                                        Short.MAX_VALUE)
                                .addComponent(logoutIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        bg.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 227, 570));

        barLabel.setBackground(new java.awt.Color(255, 255, 255));
        barLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barLabelMouseDragged(evt);
            }

            public void mouseMoved(java.awt.event.MouseEvent evt) {
                barLabelMouseMoved(evt);
            }
        });
        barLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barLabelMousePressed(evt);
            }
        });
        barLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        barLabel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 30, -1));

        bg.add(barLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 20));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(1076, 535));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 850, Short.MAX_VALUE));
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 540, Short.MAX_VALUE));

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 850, 540));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:

    }// GEN-LAST:event_jLabel1FocusGained

    private void buttonBookFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonBookFocusGained

    }// GEN-LAST:event_buttonBookFocusGained

    private void buttonBookFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonBookFocusLost

    }// GEN-LAST:event_buttonBookFocusLost

    private void buttonBookMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseClicked
        BooksAddAdminPanelView b1 = new BooksAddAdminPanelView();
        b1.setSize(842, 535);
        b1.setLocation(0, 0);
        content.removeAll();
        content.add(b1, BorderLayout.CENTER);
        content.repaint();
        content.revalidate();

    }// GEN-LAST:event_buttonBookMouseClicked

    private void buttonBookMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseEntered
        // TODO add your handling code here:
        buttonBook.setBackground(focusColor);
    }// GEN-LAST:event_buttonBookMouseEntered

    private void buttonBookMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseExited
        // TODO add your handling code here:
        buttonBook.setBackground(bgColor);
    }// GEN-LAST:event_buttonBookMouseExited

    private void buttonEditorialAuthorFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonEditorialAuthorFocusGained
        // TODO add your handling code here:
    }// GEN-LAST:event_buttonEditorialAuthorFocusGained

    private void buttonEditorialAuthorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonEditorialAuthorMouseClicked
        // TODO add your handling code here:
        EditorialAutorPanelView pv1 = new EditorialAutorPanelView();
        pv1.setSize(836, 535);
        pv1.setLocation(0, 0);
        content.removeAll();
        content.add(pv1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }// GEN-LAST:event_buttonEditorialAuthorMouseClicked

    private void buttonEditorialAuthorMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonEditorialAuthorMouseEntered
        // TODO add your handling code here:
        buttonEditorialAuthor.setBackground(focusColor);
    }// GEN-LAST:event_buttonEditorialAuthorMouseEntered

    private void buttonEditorialAuthorMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonEditorialAuthorMouseExited
        // TODO add your handling code here:
        buttonEditorialAuthor.setBackground(bgColor);
    }// GEN-LAST:event_buttonEditorialAuthorMouseExited

    private void buttonLoanMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLoanMouseClicked
        // TODO add your handling code here:
        PrestamosAdminPanelView dv1 = new PrestamosAdminPanelView();
        dv1.setSize(836, 535);
        dv1.setLocation(0, 0);
        content.removeAll();
        content.add(dv1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }// GEN-LAST:event_buttonLoanMouseClicked

    private void buttonLoanMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLoanMouseEntered
        // TODO add your handling code here:
        buttonLoan.setBackground(focusColor);
    }// GEN-LAST:event_buttonLoanMouseEntered

    private void buttonLoanMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLoanMouseExited
        // TODO add your handling code here:
        buttonLoan.setBackground(bgColor);
    }// GEN-LAST:event_buttonLoanMouseExited

    private void buttonReserveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseClicked
        // TODO add your handling code here:
        ReservasPanelView rv1 = new ReservasPanelView();
        rv1.setSize(836, 535);
        rv1.setLocation(0, 0);
        content.removeAll();
        content.add(rv1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }// GEN-LAST:event_buttonReserveMouseClicked

    private void buttonReserveMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseEntered
        // TODO add your handling code here:
        buttonReserve.setBackground(focusColor);
    }// GEN-LAST:event_buttonReserveMouseEntered

    private void buttonReserveMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseExited
        // TODO add your handling code here:
        buttonReserve.setBackground(bgColor);
    }// GEN-LAST:event_buttonReserveMouseExited

    private void barLabelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barLabelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }// GEN-LAST:event_barLabelMousePressed

    private void barLabelMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barLabelMouseMoved
        // TODO add your handling code here:

    }// GEN-LAST:event_barLabelMouseMoved

    private void barLabelMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_barLabelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }// GEN-LAST:event_barLabelMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_jLabel5MouseClicked

    private void logoutIconLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutIconLabelMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_logoutIconLabelMouseClicked

    private void SetIconLabel(JLabel label, String url) {
        Icon icon = new ImageIcon(
                new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(label.getWidth(),
                        label.getHeight(), 0));

        label.setIcon(icon);

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buttonBook;
    private javax.swing.JPanel buttonEditorialAuthor;
    private javax.swing.JPanel buttonLoan;
    private javax.swing.JPanel buttonReserve;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logoutIconLabel;
    private javax.swing.JPanel menuPanel;
    private uicomponents.CircularLabel userImage;
    // End of variables declaration//GEN-END:variables
}
