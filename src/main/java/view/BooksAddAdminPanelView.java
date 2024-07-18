/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AuthorDAO;
import dao.BookDAO;
import dao.DonationDAO;
import dao.EditorialDAO;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import model.*;
import service.*;

/**
 *
 * @author Hamer
 */
public class BooksAddAdminPanelView extends javax.swing.JPanel {

    private BookService bookService;
    private EditorialService editorialService;
    private AuthorService authorService;
    private DonationService donationService;
    private BookDAO bookDAO;
    private DonationDAO donationDAO;
    private DefaultListModel<String> listAuthorModel = new DefaultListModel<>();
    private DefaultListModel<String> listEditorialModel = new DefaultListModel<>();
    private List<AuthorModel> authors;
    private List<EditorialModel> editorials;
    private String isbn;
    private Path imageBooksourcePath;
    private Path imagetargetDirectory;
    private String imageBookfileExtentions;
    private Path projectDir;
    private BookModel book;

    public BooksAddAdminPanelView() {
        initializeComponents();
        setupServices();
        this.setSize(1076, 535);
        setImageLabel(imageBookLabel, "/icons/add128.png", 100, 100, true);
        populateJlists();
        editButtonPanel.setVisible(false);
    }

    public BooksAddAdminPanelView(BookModel book) {
        initializeComponents();
        this.book = book;
        setupServices();
        populateBookDetails(book);
        this.setSize(1076, 535);
        addButtonPanel.setVisible(false);
        populateJlists();
        setImageLabel(imageBookLabel, book.getUrlImage(), 200, 300, true);
    }

    private void initializeComponents() {
        initComponents(); // Assuming this initializes GUI components
        projectDir = Paths.get(System.getProperty("user.dir"));
        amountSpinner.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
        // System.out.println(projectDir);
    }

    private void setupServices() {
        AuthorDAO autorDAO = new AuthorDAO();
        EditorialDAO editorialDAO = new EditorialDAO();
        donationDAO = new DonationDAO();
        bookDAO = new BookDAO(autorDAO, editorialDAO);
        donationService = new DonationService(donationDAO);
        bookService = new BookService(bookDAO);
        editorialService = new EditorialService(editorialDAO);
        authorService = new AuthorService(autorDAO);
    }

    private void populateBookDetails(BookModel book) {
        titleTextField.setText(book.getTitulo());
        isbnTextField.setText(book.getIsbn());
        yearTextField.setText(book.getAnioPublicacion().toString());
        sinopsisTextPane.setText(book.getSinopsis());
        amountSpinner.setValue(book.getSinPrestar());
        authorList.setSelectedValue(book.getAutor().getNombre().trim(), true);
        editorialList.setSelectedValue(book.getEditorial().getNombre().trim(), true);
        System.out.println(book.getAutor().getNombre());
        imageBookfileExtentions = book.getUrlImage().toString()
                .substring(book.getUrlImage().toString().lastIndexOf(".") + 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsisTextPane = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        imageBookLabel = new javax.swing.JLabel();
        donadoRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        donadorTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        authorList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        editorialList = new javax.swing.JList<>();
        addButtonPanel = new javax.swing.JPanel();
        addButtonLabel = new javax.swing.JLabel();
        editButtonPanel = new javax.swing.JPanel();
        addButtonLabel1 = new javax.swing.JLabel();
        seeBooksPanelButton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("Titulo:");

        titleTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("ISBN:");

        isbnTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Sinopsis:");

        sinopsisTextPane.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(sinopsisTextPane);

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setText("Año publicación:");

        yearTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        imageBookLabel.setBackground(new java.awt.Color(204, 204, 204));
        imageBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageBookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        imageBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imageBookLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageBookLabel.setOpaque(true);
        imageBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageBookLabelMouseClicked(evt);
            }
        });

        donadoRadioButton.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        donadoRadioButton.setText("Donación");

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("By:");

        donadorTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel7.setText("Autor:");

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("Editorial:");

        authorList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        authorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        authorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(authorList);

        editorialList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        editorialList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(editorialList);

        addButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        addButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        addButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonPanelMouseClicked(evt);
            }
        });

        addButtonLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        addButtonLabel.setText("Agregar");

        javax.swing.GroupLayout addButtonPanelLayout = new javax.swing.GroupLayout(addButtonPanel);
        addButtonPanel.setLayout(addButtonPanelLayout);
        addButtonPanelLayout.setHorizontalGroup(
                addButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(addButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addButtonLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        addButtonPanelLayout.setVerticalGroup(
                addButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(addButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addButtonLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        editButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        editButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonPanelMouseClicked(evt);
            }
        });

        addButtonLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addButtonLabel1.setForeground(new java.awt.Color(255, 255, 255));
        addButtonLabel1.setText("Guardar");

        javax.swing.GroupLayout editButtonPanelLayout = new javax.swing.GroupLayout(editButtonPanel);
        editButtonPanel.setLayout(editButtonPanelLayout);
        editButtonPanelLayout.setHorizontalGroup(
                editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editButtonPanelLayout.createSequentialGroup()
                                .addGap(0, 25, Short.MAX_VALUE)
                                .addComponent(addButtonLabel1)
                                .addGap(0, 25, Short.MAX_VALUE)));
        editButtonPanelLayout.setVerticalGroup(
                editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editButtonPanelLayout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(addButtonLabel1)
                                .addGap(0, 8, Short.MAX_VALUE)));

        seeBooksPanelButton.setBackground(new java.awt.Color(74, 92, 106));
        seeBooksPanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seeBooksPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeBooksPanelButtonMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ver");

        javax.swing.GroupLayout seeBooksPanelButtonLayout = new javax.swing.GroupLayout(seeBooksPanelButton);
        seeBooksPanelButton.setLayout(seeBooksPanelButtonLayout);
        seeBooksPanelButtonLayout.setHorizontalGroup(
                seeBooksPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(
                                seeBooksPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seeBooksPanelButtonLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE))));
        seeBooksPanelButtonLayout.setVerticalGroup(
                seeBooksPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(
                                seeBooksPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seeBooksPanelButtonLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(titleTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(isbnTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(5, 5, 5)
                                                                .addComponent(yearTextField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel3)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane4,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jScrollPane5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addComponent(imageBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(5, 5, 5)
                                                .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(donadoRadioButton)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(donadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(addButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(editButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(seeBooksPanelButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(titleTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(isbnTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(yearTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel3)
                                                .addGap(15, 15, 15)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(5, 5, 5)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel8)
                                                .addGap(5, 5, 5)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(imageBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(donadoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(seeBooksPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(donadorTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))));
    }// </editor-fold>//GEN-END:initComponents

    private void imageBookLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_imageBookLabelMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imageBooksourcePath = Paths.get(selectedFile.getAbsolutePath());
            imageBookfileExtentions = imageBooksourcePath.toString()
                    .substring(imageBooksourcePath.toString().lastIndexOf(".") + 1);
            try {
                setImageLabel(imageBookLabel, selectedFile.getAbsolutePath(), imageBookLabel.getWidth(),
                        imageBookLabel.getHeight(), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }// GEN-LAST:event_imageBookLabelMouseClicked

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_titleTextFieldActionPerformed

    private void addButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addButtonPanelMouseClicked

        isbn = isbnTextField.getText().trim();
        imagetargetDirectory = Paths.get(projectDir + "/imagenes/booksImages/" + isbn + "." + imageBookfileExtentions);
        Year year;
        String titleBook = titleTextField.getText().trim().toUpperCase();
        String sinopsis = sinopsisTextPane.getText().trim();
        String urlImageBook = "/booksImages/" + isbn + "." + imageBookfileExtentions;
        boolean donado = donadoRadioButton.isSelected();
        String donador = donadorTextField.getText().trim();
        int amount = (Integer) amountSpinner.getValue();
        String selectedAuthor = authorList.getSelectedValue();
        String selectedEditorial = editorialList.getSelectedValue();

        if (imageBooksourcePath == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una imagen", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ISBN no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (selectedAuthor == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un autor", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (selectedEditorial == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una editorial", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (titleBook.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Title no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sinopsis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sinopsis no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (donado) {
            if (donador.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Donator no puede estar vacío", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            donador = null;
        }
        try {
            year = Year.parse(yearTextField.getText().trim());
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid year format", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AuthorModel author = authors.stream().filter(a -> a.getNombre().equals(selectedAuthor)).findFirst().orElse(null);
        EditorialModel editorial1 = editorials.stream()
                .filter(editorial -> editorial.getNombre().equals(selectedEditorial)).findFirst().orElse(null);
        BookModel book = new BookModel(titleBook, sinopsis, urlImageBook, isbn, year, author, editorial1, amount,
                amount, donador);
        bookService.addBook(book);

        try {
            Files.copy(imageBooksourcePath, imagetargetDirectory, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(BooksAddAdminPanelView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error copying image file", "File Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Libro agregado correctamente");
    }// GEN-LAST:event_addButtonPanelMouseClicked

    private void editButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editButtonPanelMouseClicked

        isbn = isbnTextField.getText().trim();
        imagetargetDirectory = Paths.get(projectDir + "/imagenes/booksImages/" + isbn + "." + imageBookfileExtentions);
        String lastUrlImageBook = book.getUrlImage();
        Year year;
        String titleBook = titleTextField.getText().trim().toUpperCase();
        String sinopsis = sinopsisTextPane.getText().trim();
        String urlImageBook = "/booksImages/" + isbn + "." + imageBookfileExtentions;
        boolean donado = donadoRadioButton.isSelected();
        String donador = donadorTextField.getText().trim();
        int amount = (Integer) amountSpinner.getValue();
        String selectedAuthor = authorList.getSelectedValue();
        String selectedEditorial = editorialList.getSelectedValue();

        if (imagetargetDirectory == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una imagen", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ISBN no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (selectedAuthor == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un autor", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (selectedEditorial == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una editorial", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (titleBook.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Title no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (sinopsis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sinopsis no puede estar vacío", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (donado) {
            if (donador.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Donator no puede estar vacío", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            donador = null;
        }
        try {
            year = Year.parse(yearTextField.getText().trim());
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid year format", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AuthorModel author = authors.stream().filter(a -> a.getNombre().equals(selectedAuthor)).findFirst().orElse(null);
        EditorialModel editorial1 = editorials.stream()
                .filter(editorial -> editorial.getNombre().equals(selectedEditorial)).findFirst().orElse(null);
        book.setAutor(author);
        book.setAnioPublicacion(year);
        book.setTitulo(titleBook);
        book.setIsbn(isbn);
        book.setEditorial(editorial1);
        book.setTotalEjemplares(amount);
        book.setUrlImage(urlImageBook);
        book.setSinopsis(sinopsis);
        book.setDonador(donador);
        bookService.update(book.getId(), book);

        if (imageBooksourcePath == null) {
            imageBooksourcePath = Paths.get((projectDir + "/imagenes" + lastUrlImageBook).trim());
            System.out.println("o si");
            System.out.println(imageBooksourcePath);
        }
        try {
            Files.copy(imageBooksourcePath, imagetargetDirectory, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(BooksAddAdminPanelView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error copiando image file", "File Error", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "Libro modificado correctamente");
    }// GEN-LAST:event_editButtonPanelMouseClicked

    private void seeBooksPanelButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_seeBooksPanelButtonMouseClicked
        // TODO add your handling code here:
        BooksPanelView b1 = new BooksPanelView(true);
        b1.setSize(842, 535);
        b1.setLocation(0, 0);
        this.removeAll();
        this.add(b1, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }// GEN-LAST:event_seeBooksPanelButtonMouseClicked

    private void populateJlists() {
        authors = authorService.getAllAuthors();
        editorials = editorialService.getAllEditorials();

        for (AuthorModel author : authors) {
            listAuthorModel.addElement(author.getNombre());
        }
        for (EditorialModel editorial : editorials) {
            listEditorialModel.addElement(editorial.getNombre());
        }

        authorList.setModel(listAuthorModel);
        editorialList.setModel(listEditorialModel);
    }

    private void setImageLabel(JLabel jLabel, String url, int width, int height, boolean fromProject) {
        Icon icon = null;
        if (fromProject) {
            icon = new ImageIcon(
                    new ImageIcon(projectDir + "\\imagenes" + url).getImage().getScaledInstance(width, height, 0));
        } else {
            icon = new ImageIcon(
                    new ImageIcon(url).getImage().getScaledInstance(width, height, 0));
        }
        jLabel.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButtonLabel;
    private javax.swing.JLabel addButtonLabel1;
    private javax.swing.JPanel addButtonPanel;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JList<String> authorList;
    private javax.swing.JRadioButton donadoRadioButton;
    private javax.swing.JTextField donadorTextField;
    private javax.swing.JPanel editButtonPanel;
    private javax.swing.JList<String> editorialList;
    private javax.swing.JLabel imageBookLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel seeBooksPanelButton;
    private javax.swing.JTextPane sinopsisTextPane;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
