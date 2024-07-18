/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AuthorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import java.awt.BorderLayout;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BookModel;
import service.BookService;

/**
 *
 * @author Hamer
 */
public class BookInfoAdminPanelView extends javax.swing.JPanel {

    private BookModel book;
    private Path projectDir;
    private BookService bookService;

    public BookInfoAdminPanelView() {
        initComponents();
    }

    public BookInfoAdminPanelView(BookModel book) {
        initComponents();
        this.book = book;
        bookService = new BookService(new BookDAO(new AuthorDAO(), new EditorialDAO()));
        projectDir = Paths.get(System.getProperty("user.dir"));
        displayInfo();

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel2 = new javax.swing.JLabel();
        bookImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinopsisPane = new javax.swing.JTextPane();
        tituloLabel = new javax.swing.JLabel();
        editButtonPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deleteButtonPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));

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
        jPanel3.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, -1));

        autorLabel.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        autorLabel.setText("jLabel5");
        jPanel3.add(autorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 20));

        editorialLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialLabel.setText("jLabel5");
        jPanel3.add(editorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("SINOPSIS");

        jScrollPane2.setBorder(null);

        sinopsisPane.setBackground(new java.awt.Color(255, 255, 255));
        sinopsisPane.setBorder(null);
        sinopsisPane.setFont(new java.awt.Font("Playwrite NG Modern", 0, 12)); // NOI18N
        sinopsisPane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sinopsisPane.setEnabled(false);
        jScrollPane2.setViewportView(sinopsisPane);

        tituloLabel.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        tituloLabel.setText("Titulo");

        editButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        editButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonPanelMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");

        javax.swing.GroupLayout editButtonPanelLayout = new javax.swing.GroupLayout(editButtonPanel);
        editButtonPanel.setLayout(editButtonPanelLayout);
        editButtonPanelLayout.setHorizontalGroup(
                editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(editButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        editButtonPanelLayout.setVerticalGroup(
                editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(editButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        deleteButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        deleteButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eliminar");

        javax.swing.GroupLayout deleteButtonPanelLayout = new javax.swing.GroupLayout(deleteButtonPanel);
        deleteButtonPanel.setLayout(deleteButtonPanelLayout);
        deleteButtonPanelLayout.setHorizontalGroup(
                deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(deleteButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        deleteButtonPanelLayout.setVerticalGroup(
                deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(deleteButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 6, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(0, 7, Short.MAX_VALUE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(editButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(deleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2)
                                                .addGap(15, 15, 15)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(deleteButtonPanel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(editButtonPanel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(38, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editButtonPanelMouseClicked
        // TODO add your handling code here:
        BooksAddAdminPanelView bookEdit = new BooksAddAdminPanelView(book);
        bookEdit.setSize(842, 535);
        bookEdit.setLocation(0, 0);
        removeAll();
        add(bookEdit, BorderLayout.CENTER);
        repaint();
        revalidate();
        System.out.println("o si nmni");
    }// GEN-LAST:event_editButtonPanelMouseClicked

    private void deleteButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPanelMouseClicked
        // TODO add your handling code here:

        int response = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            bookService.delete(book.getId());
        }
        ;

        BooksPanelView b1 = new BooksPanelView(true);
        b1.setSize(842, 535);
        b1.setLocation(0, 0);
        this.removeAll();
        this.add(b1, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }// GEN-LAST:event_deleteButtonPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorLabel;
    private javax.swing.JLabel bookImage;
    private javax.swing.JPanel deleteButtonPanel;
    private javax.swing.JPanel editButtonPanel;
    private javax.swing.JLabel editorialLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane sinopsisPane;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
