/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.UserModel;

/**
 *
 * @author Hamer
 */
public class UserView extends javax.swing.JFrame {
    private UserModel user;
    private Color bgColor, focusColor;
    int xMouse, yMouse;
    private Path projectDir;

    public UserView() {

        initComponents();
        buttonBook.setFocusable(true);
        initializeColors();
        configureBarPanel();
        configureBooksPanelView();
        setIconLabel(logoutIconLabel, "/icons/logout.png");

    }

    public UserView(UserModel user) {
        initComponents();
        this.user = user;
        initializeColors();
        configureBarPanel();
        configureBooksPanelView();
        setIconLabel(logoutIconLabel, "/icons/logout.png");
        loadUserProfilePhoto();
        usernameLabel.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        buttonBook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonLends = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonReserve = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logoutIconLabel = new javax.swing.JLabel();
        userPhotoProfileLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        barPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOKS");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(39, 60, 65));

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

        buttonLends.setBackground(new java.awt.Color(39, 60, 65));
        buttonLends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLends.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buttonLendsFocusGained(evt);
            }
        });
        buttonLends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLendsMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLendsMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLendsMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documento.png"))); // NOI18N
        jLabel2.setText("PRESTAMOS");

        javax.swing.GroupLayout buttonLendsLayout = new javax.swing.GroupLayout(buttonLends);
        buttonLends.setLayout(buttonLendsLayout);
        buttonLendsLayout.setHorizontalGroup(
                buttonLendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonLendsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        buttonLendsLayout.setVerticalGroup(
                buttonLendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonLendsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
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

        javax.swing.GroupLayout buttonReserveLayout = new javax.swing.GroupLayout(buttonReserve);
        buttonReserve.setLayout(buttonReserveLayout);
        buttonReserveLayout.setHorizontalGroup(
                buttonReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonReserveLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE)));
        buttonReserveLayout.setVerticalGroup(
                buttonReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                buttonReserveLayout.createSequentialGroup()
                                        .addContainerGap(23, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addContainerGap()));

        logoutIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIconLabel.setMaximumSize(new java.awt.Dimension(24, 24));
        logoutIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconLabelMouseClicked(evt);
            }
        });

        userPhotoProfileLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userPhotoProfileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPhotoProfileLabelMouseClicked(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("jLabel3");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                menuPanelLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(buttonReserve,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonBook, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLends, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(logoutIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(menuPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(userPhotoProfileLabel,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 127,
                                                                Short.MAX_VALUE)
                                                        .addComponent(usernameLabel,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(userPhotoProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameLabel)
                                .addGap(28, 28, 28)
                                .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLends, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonReserve, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142,
                                        Short.MAX_VALUE)
                                .addComponent(logoutIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        bg.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 227, 570));

        barPanel.setBackground(new java.awt.Color(255, 255, 255));
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
        barPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        barPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 30, -1));

        bg.add(barPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 20));

        content.setBackground(new java.awt.Color(244, 246, 248));
        content.setMinimumSize(new java.awt.Dimension(842, 535));
        content.setPreferredSize(new java.awt.Dimension(842, 535));

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

    private void buttonLendsFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonLendsFocusGained
        // TODO add your handling code here:
    }// GEN-LAST:event_buttonLendsFocusGained

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:

    }// GEN-LAST:event_jLabel1FocusGained

    private void buttonBookMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseClicked

        BooksPanelView b1 = new BooksPanelView(false, user);
        b1.setSize(842, 535);
        b1.setLocation(0, 0);
        content.removeAll();
        content.add(b1, BorderLayout.CENTER);
        content.repaint();
        content.revalidate();

    }// GEN-LAST:event_buttonBookMouseClicked

    private void buttonBookFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonBookFocusGained

    }// GEN-LAST:event_buttonBookFocusGained

    private void buttonBookFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_buttonBookFocusLost

    }// GEN-LAST:event_buttonBookFocusLost

    private void buttonBookMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseEntered
        // TODO add your handling code here:
        buttonBook.setBackground(focusColor);
    }// GEN-LAST:event_buttonBookMouseEntered

    private void buttonBookMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBookMouseExited
        // TODO add your handling code here:
        buttonBook.setBackground(bgColor);
    }// GEN-LAST:event_buttonBookMouseExited

    private void buttonLendsMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLendsMouseEntered
        // TODO add your handling code here:
        buttonLends.setBackground(focusColor);
    }// GEN-LAST:event_buttonLendsMouseEntered

    private void buttonLendsMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLendsMouseExited
        // TODO add your handling code here:
        buttonLends.setBackground(bgColor);
    }// GEN-LAST:event_buttonLendsMouseExited

    private void buttonReserveMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseEntered
        // TODO add your handling code here:
        buttonReserve.setBackground(focusColor);
    }// GEN-LAST:event_buttonReserveMouseEntered

    private void buttonReserveMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseExited
        // TODO add your handling code here:
        buttonReserve.setBackground(bgColor);
    }// GEN-LAST:event_buttonReserveMouseExited

    private void buttonLendsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonLendsMouseClicked
        // TODO add your handling code here:
        PrestamosPanelView pv1 = new PrestamosPanelView(user);
        pv1.setSize(842, 535);
        pv1.setLocation(0, 0);
        content.removeAll();
        content.add(pv1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonReserveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonReserveMouseClicked
        // TODO add your handling code here:
        ReservasPanelView rv1 = new ReservasPanelView();
        rv1.setSize(842, 535);
        rv1.setLocation(0, 0);
        content.removeAll();
        content.add(rv1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }// GEN-LAST:event_buttonReserveMouseClicked

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

    private void logoutIconLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutIconLabelMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_logoutIconLabelMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_jLabel5MouseClicked

    private void userPhotoProfileLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_userPhotoProfileLabelMouseClicked
        // TODO add your handling code here:
        ConfigUserPanelView cu1 = new ConfigUserPanelView(user, this);
        cu1.setSize(842, 535);
        cu1.setLocation(0, 0);
        content.removeAll();
        content.add(cu1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }// GEN-LAST:event_userPhotoProfileLabelMouseClicked

    public JPanel getContent() {
        return content;
    }

    private void SetIconLabel(JLabel label, String url) {
        Icon icon = new ImageIcon(
                new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(label.getWidth(),
                        label.getHeight(), 0));
        label.setIcon(icon);
    }

    private void initializeColors() {
        bgColor = new Color(39, 60, 65);
        focusColor = new Color(69, 87, 91);
    }

    private void configureBarPanel() {
        barPanel.setBackground(new Color(0, 0, 0, 0));
    }

    private void configureBooksPanelView() {
        BooksPanelView booksPanelView = new BooksPanelView(false, user);
        booksPanelView.setSize(842, 535);
        booksPanelView.setLocation(0, 0);
        content.removeAll();
        content.add(booksPanelView);
        content.repaint();
        content.revalidate();
    }

    private void setIconLabel(JLabel label, String iconPath) {
        SetIconLabel(label, iconPath);
    }

    private void loadUserProfilePhoto() {
        projectDir = Paths.get(System.getProperty("user.dir"));
        try {
            String profilePhotoPath = projectDir + "/imagenes" + user.getUrlProfilePhoto().trim();
            setCircleImageLabel(new File(profilePhotoPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCircleImageLabel(File file) throws IOException {
        BufferedImage master = ImageIO.read(file);
        int diameter = Math.min(userPhotoProfileLabel.getWidth(), userPhotoProfileLabel.getHeight());

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
        userPhotoProfileLabel.setIcon(new ImageIcon(masked));
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

    public void setUsernameLabel(String username) {
        usernameLabel.setText(username);
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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buttonBook;
    private javax.swing.JPanel buttonLends;
    private javax.swing.JPanel buttonReserve;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logoutIconLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel userPhotoProfileLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
