/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import com.raven.datechooser.DateChooser;
import dao.AuthorDAO;
import dao.BookDAO;
import dao.CommentDAO;
import dao.EditorialDAO;
import dao.LendingDAO;
import dao.UserDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.BorderFactory;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;
import model.*;
import service.CommentService;
import service.BookService;
import service.LendingService;
import uicomponents.CommentComponent;

/**
 *
 * @author Hamer
 */
public class BookInfoUserPanelView extends javax.swing.JPanel {
    private BookModel book;
    private UserModel user;
    private DateChooser chDate = new DateChooser();
    private LendingService prestamoService;
    private BookService bookService;
    private List<CommentModel> comments;
    private CommentService commentService;
    private JScrollPane jScrollPane;
    private Path projectDir;

    public BookInfoUserPanelView() {
        this(null, null);
    }

    public BookInfoUserPanelView(BookModel book, UserModel user) {
        initComponents();
        this.book = book;
        this.user = user;
        projectDir = Paths.get(System.getProperty("user.dir"));
        initializeServices();
        displayInfo();
        displayComments();
        configureComponents();

    }

    private void initializeServices() {
        BookDAO bookDAO = new BookDAO(new AuthorDAO(), new EditorialDAO());
        UserDAO userDAO = new UserDAO();
        prestamoService = new LendingService(new LendingDAO(bookDAO, userDAO));
        bookService = new BookService(bookDAO);
        commentService = new CommentService(new CommentDAO(userDAO, bookDAO));
    }

    private void configureComponents() {
        cantidadSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        chDate.setTextField(jTextField2);
        chDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chDate.setThemeColor(Color.YELLOW);
        chDate.setBackground(Color.WHITE);
        chDate.setFont(new Font("Cascadia Code", Font.BOLD, 12));
        chDate.setOpaque(true);
    }

    public void displayInfo() {
        Icon icon = new ImageIcon(
                new ImageIcon(projectDir + "\\imagenes" + book.getUrlImage()).getImage().getScaledInstance(200, 300,
                        0));
        bookImage.setIcon(icon);
        tituloLabel.setText(book.getTitulo());
        isbnLabel.setText(book.getIsbn());
        autorLabel.setText(book.getAutor().getNombre());
        sinopsisPane.setText(book.getSinopsis());
        editorialLabel.setText(book.getEditorial().getNombre());
        aniopubLabel.setText(book.getAnioPublicacion().toString());
        availableBookLabel.setText(book.getSinPrestar() + "");
        
    }

    public void displayComments() {
        commentsPanel.removeAll();
        List<CommentModel> comments = commentService.getCommentByIdOfBook(book.getId());
        JPanel commentsList = new JPanel();
        GridLayout layout = new GridLayout(0, 1, 10, 10);
        commentsList.setLayout(layout);
        commentsList.setSize(420, 130);
        commentsList.setLocation(0, 0);
        commentsList.setBackground(new Color(204, 204, 204));

        for (CommentModel comment : comments) {
            if (user.getUsername().equals(comment.getUsuario().getUsername())) {
                CommentComponent commentView = new CommentComponent("me", comment.getContenido());
                commentsList.add(commentView);
            } else {
                CommentComponent commentView = new CommentComponent(comment.getUsuario().getUsername(),
                        comment.getContenido());
                commentsList.add(commentView);
            }

        }
        jScrollPane = new JScrollPane(commentsList);
        jScrollPane.setSize(420, 130);
        jScrollPane.setLocation(0, 0);
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        commentsPanel.add(jScrollPane, BorderLayout.CENTER);
        repaint();
        revalidate();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateBetween1 = new com.raven.datechooser.DateBetween();
        commentTextField = new javax.swing.JTextField();
        commentsPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        autorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        editorialLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aniopubLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        availableBookLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bookImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinopsisPane = new javax.swing.JTextPane();
        tituloLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cantidadSpinner = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        commentButtonPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        prestamoButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(842, 535));
        setPreferredSize(new java.awt.Dimension(842, 535));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        commentTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        commentTextField.setForeground(new java.awt.Color(204, 204, 204));
        commentTextField.setText("Comentario");
        commentTextField.setBorder(null);
        commentTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentTextFieldMouseClicked(evt);
            }
        });
        commentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentTextFieldActionPerformed(evt);
            }
        });
        add(commentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 319, -1));

        commentsPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout commentsPanelLayout = new javax.swing.GroupLayout(commentsPanel);
        commentsPanel.setLayout(commentsPanelLayout);
        commentsPanelLayout.setHorizontalGroup(
                commentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 420, Short.MAX_VALUE));
        commentsPanelLayout.setVerticalGroup(
                commentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 130, Short.MAX_VALUE));

        add(commentsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 420, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("ISBN:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Autor:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel4.setText("Editorial:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        isbnLabel.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        isbnLabel.setText("jLabel5");
        jPanel3.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));

        autorLabel.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        autorLabel.setText("jLabel5");
        jPanel3.add(autorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 20));

        editorialLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialLabel.setText("jLabel5");
        jPanel3.add(editorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("Año:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        aniopubLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        aniopubLabel.setText("jLabel7");
        jPanel3.add(aniopubLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 10));

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("Disponibles:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        availableBookLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        availableBookLabel.setText("12");
        jPanel3.add(availableBookLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 10));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, 170));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("SINOPSIS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));
        add(bookImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 310));

        jScrollPane2.setBorder(null);

        sinopsisPane.setBackground(new java.awt.Color(255, 255, 255));
        sinopsisPane.setBorder(null);
        sinopsisPane.setFont(new java.awt.Font("Playwrite NG Modern", 0, 12)); // NOI18N
        sinopsisPane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sinopsisPane.setEnabled(false);
        jScrollPane2.setViewportView(sinopsisPane);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 420, 190));

        tituloLabel.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        tituloLabel.setText("Titulo");
        add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 420, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 320, -1));

        cantidadSpinner.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(cantidadSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 70, 30));

        jTextField2.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("fecha");
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 61, 200, 30));

        commentButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        commentButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commentButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentButtonPanelMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("comentar");

        javax.swing.GroupLayout commentButtonPanelLayout = new javax.swing.GroupLayout(commentButtonPanel);
        commentButtonPanel.setLayout(commentButtonPanelLayout);
        commentButtonPanelLayout.setHorizontalGroup(
                commentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addGroup(
                                commentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(commentButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 14, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addGap(0, 15, Short.MAX_VALUE))));
        commentButtonPanelLayout.setVerticalGroup(
                commentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(
                                commentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(commentButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addGap(0, 0, Short.MAX_VALUE))));

        add(commentButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 90, 30));

        prestamoButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        prestamoButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        prestamoButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamoButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamoButtonPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("prestar");

        javax.swing.GroupLayout prestamoButtonPanelLayout = new javax.swing.GroupLayout(prestamoButtonPanel);
        prestamoButtonPanel.setLayout(prestamoButtonPanelLayout);
        prestamoButtonPanelLayout.setHorizontalGroup(
                prestamoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(
                                prestamoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(prestamoButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 23, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(0, 24, Short.MAX_VALUE))));
        prestamoButtonPanelLayout.setVerticalGroup(
                prestamoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(
                                prestamoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(prestamoButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(0, 0, Short.MAX_VALUE))));

        add(prestamoButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void commentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_commentTextFieldActionPerformed
        
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    private void prestamoButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_prestamoButtonPanelMouseClicked
        // TODO add your handling code here:

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        int cantidad = (Integer) cantidadSpinner.getValue();
        Date loanFrom = new Date(chDate.getSelectedDateBetween().getFromDate().getTime());
        Date loanTo = new Date(chDate.getSelectedDateBetween().getToDate().getTime());
        LendingModel prestamo = new LendingModel(cantidad, user, book, loanFrom, loanTo);

        if (cantidad < 0) {
            JOptionPane.showMessageDialog(null, "No puedes utilizar cantidades negativas");
            return;
        }
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0 crack >:|");
            return;
        }
        if (cantidad > book.getSinPrestar()) {
            JOptionPane.showMessageDialog(null, "No puedes prestar mas de la cantidad disponible");
            return;
        }
        prestamoService.insertPrestamos(prestamo);
        availableBookLabel.setText(bookService.calcCantoOfAvailableBooks(book.getId()) + "");

        JOptionPane.showMessageDialog(null, "El libro se agrego a la lista de prestamos exitosamente");
    }

    private void commentButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_commentButtonPanelMouseClicked
        
        String contentComment = commentTextField.getText();
        CommentModel comment = new CommentModel(user, book, contentComment);
        commentService.addComment(comment);
        commentTextField.setText(null);
        displayComments();
    }

    private void commentTextFieldMouseClicked(java.awt.event.MouseEvent evt) {     
        commentTextField.setText("");
        commentTextField.setForeground(Color.BLACK);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniopubLabel;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JLabel availableBookLabel;
    private javax.swing.JLabel bookImage;
    private javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JPanel commentButtonPanel;
    private javax.swing.JTextField commentTextField;
    private javax.swing.JPanel commentsPanel;
    private com.raven.datechooser.DateBetween dateBetween1;
    private javax.swing.JLabel editorialLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel prestamoButtonPanel;
    private javax.swing.JTextPane sinopsisPane;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
