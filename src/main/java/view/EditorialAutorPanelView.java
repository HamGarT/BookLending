/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AuthorDAO;
import dao.EditorialDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.AuthorModel;
import model.EditorialModel;
import service.AuthorService;
import service.EditorialService;

/**
 *
 * @author Hamer
 */
public class EditorialAutorPanelView extends javax.swing.JPanel {

    private List<AuthorModel> authors;
    private List<EditorialModel> editorials;
    private EditorialService editorialService;
    private AuthorService authorService;
    private DefaultListModel<String> listAuthorModel = new DefaultListModel<>();
    private DefaultListModel<String> listEditorialModel = new DefaultListModel<>();
    
    public EditorialAutorPanelView() {
        initComponents();
        authorService = new AuthorService(new AuthorDAO());
        editorialService = new EditorialService(new EditorialDAO());
        populateJlists();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addAuthorTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addEditorialTextField = new javax.swing.JTextField();
        deleteEditorialButtonPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addEditorialButtonPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorsList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditorialList = new javax.swing.JList<>();
        addAuthorButtonPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        editAuthorButtonPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        editEditorialButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        deleteAuthorButtonPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        editEditorialTextField = new javax.swing.JTextField();
        editAuthorTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));
        setPreferredSize(new java.awt.Dimension(820, 535));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del autor:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        addAuthorTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addAuthorTextField.setForeground(new java.awt.Color(204, 204, 204));
        addAuthorTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAuthorTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addAuthorTextFieldMousePressed(evt);
            }
        });
        add(addAuthorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de la editorial:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        addEditorialTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addEditorialTextField.setForeground(new java.awt.Color(204, 204, 204));
        addEditorialTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEditorialTextFieldMouseClicked(evt);
            }
        });
        add(addEditorialTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 310, -1));

        deleteEditorialButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        deleteEditorialButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteEditorialButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEditorialButtonPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar");

        javax.swing.GroupLayout deleteEditorialButtonPanelLayout = new javax.swing.GroupLayout(deleteEditorialButtonPanel);
        deleteEditorialButtonPanel.setLayout(deleteEditorialButtonPanelLayout);
        deleteEditorialButtonPanelLayout.setHorizontalGroup(
            deleteEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(deleteEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 124, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 125, Short.MAX_VALUE)))
        );
        deleteEditorialButtonPanelLayout.setVerticalGroup(
            deleteEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(deleteEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(deleteEditorialButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 310, -1));

        addEditorialButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        addEditorialButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEditorialButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEditorialButtonPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agregar");

        javax.swing.GroupLayout addEditorialButtonPanelLayout = new javax.swing.GroupLayout(addEditorialButtonPanel);
        addEditorialButtonPanel.setLayout(addEditorialButtonPanelLayout);
        addEditorialButtonPanelLayout.setHorizontalGroup(
            addEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(addEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 128, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 129, Short.MAX_VALUE)))
        );
        addEditorialButtonPanelLayout.setVerticalGroup(
            addEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(addEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(addEditorialButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 310, 26));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 20, 480));

        authorsList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        authorsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        authorsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorsListMouseClicked(evt);
            }
        });
        authorsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                authorsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(authorsList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, 290, 150));

        EditorialList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        EditorialList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        EditorialList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditorialListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EditorialList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 310, 150));

        addAuthorButtonPanel1.setBackground(new java.awt.Color(74, 92, 106));
        addAuthorButtonPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAuthorButtonPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAuthorButtonPanel1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar");

        javax.swing.GroupLayout addAuthorButtonPanel1Layout = new javax.swing.GroupLayout(addAuthorButtonPanel1);
        addAuthorButtonPanel1.setLayout(addAuthorButtonPanel1Layout);
        addAuthorButtonPanel1Layout.setHorizontalGroup(
            addAuthorButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(addAuthorButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addAuthorButtonPanel1Layout.createSequentialGroup()
                    .addGap(0, 118, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 119, Short.MAX_VALUE)))
        );
        addAuthorButtonPanel1Layout.setVerticalGroup(
            addAuthorButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(addAuthorButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addAuthorButtonPanel1Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(addAuthorButtonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 290, -1));

        editAuthorButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        editAuthorButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editAuthorButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAuthorButtonPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Actualizar");

        javax.swing.GroupLayout editAuthorButtonPanelLayout = new javax.swing.GroupLayout(editAuthorButtonPanel);
        editAuthorButtonPanel.setLayout(editAuthorButtonPanelLayout);
        editAuthorButtonPanelLayout.setHorizontalGroup(
            editAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(editAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editAuthorButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 112, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 112, Short.MAX_VALUE)))
        );
        editAuthorButtonPanelLayout.setVerticalGroup(
            editAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(editAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editAuthorButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(editAuthorButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 300, -1));

        editEditorialButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        editEditorialButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editEditorialButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEditorialButtonPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Actualizar");

        javax.swing.GroupLayout editEditorialButtonPanelLayout = new javax.swing.GroupLayout(editEditorialButtonPanel);
        editEditorialButtonPanel.setLayout(editEditorialButtonPanelLayout);
        editEditorialButtonPanelLayout.setHorizontalGroup(
            editEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(editEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 117, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 117, Short.MAX_VALUE)))
        );
        editEditorialButtonPanelLayout.setVerticalGroup(
            editEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(editEditorialButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editEditorialButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(editEditorialButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 310, -1));

        deleteAuthorButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        deleteAuthorButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAuthorButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAuthorButtonPanelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Eliminar");

        javax.swing.GroupLayout deleteAuthorButtonPanelLayout = new javax.swing.GroupLayout(deleteAuthorButtonPanel);
        deleteAuthorButtonPanel.setLayout(deleteAuthorButtonPanelLayout);
        deleteAuthorButtonPanelLayout.setHorizontalGroup(
            deleteAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(deleteAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteAuthorButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 119, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 120, Short.MAX_VALUE)))
        );
        deleteAuthorButtonPanelLayout.setVerticalGroup(
            deleteAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(deleteAuthorButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteAuthorButtonPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        add(deleteAuthorButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 300, -1));

        editEditorialTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(editEditorialTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 310, -1));

        editAuthorTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(editAuthorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 300, -1));

        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Seleciona un elemento para realizar una acción");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 320, 20));

        jLabel10.setFont(new java.awt.Font("Cascadia Mono", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Seleciona un elemento para realizar una acción");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    private void populateJlists(){
        listAuthorModel.clear();
        listEditorialModel.clear();
        authors = authorService.getAllAuthors();
        editorials = editorialService.getAllEditorials();
        
        for(AuthorModel author : authors){
            listAuthorModel.addElement(author.getNombre());
        }
        for(EditorialModel editorial : editorials){
            listEditorialModel.addElement(editorial.getNombre());
        }
        
        EditorialList.setModel(listEditorialModel);
        authorsList.setModel(listAuthorModel);
    }
     private void updateEditorialList(){
         //authorsList.
         //editorials = editorialService.getAllEditorials();
     }
    
    
    
    private void deleteEditorialButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEditorialButtonPanelMouseClicked
        if (EditorialList.getSelectedValue() == null || EditorialList.getSelectedValue().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento para actualizar", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        EditorialModel editorial1 = editorials.stream().filter(editorial -> editorial.getNombre().equals(EditorialList.getSelectedValue())).findFirst().orElse(null);
        int response = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION){
             editorialService.delete(editorial1.getId());
        };
       
        populateJlists();
        
    }//GEN-LAST:event_deleteEditorialButtonPanelMouseClicked

    private void addEditorialButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEditorialButtonPanelMouseClicked
        // TODO add your handling code here:
        
        String editorial = addEditorialTextField.getText();
        if (editorial == null || editorial.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo editorial no puede estar vacío.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        editorialService.insertInto(new EditorialModel(editorial));
        populateJlists();
        
    }//GEN-LAST:event_addEditorialButtonPanelMouseClicked

    private void addAuthorButtonPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAuthorButtonPanel1MouseClicked
        // TODO add your handling code here:
        String author = addAuthorTextField.getText();
        if (author == null || author.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo autor no puede estar vacío.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        authorService.insertInto(new AuthorModel(author));
        populateJlists();
    }//GEN-LAST:event_addAuthorButtonPanel1MouseClicked

    private void editAuthorButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAuthorButtonPanelMouseClicked
        if (authorsList.getSelectedValue() == null || authorsList.getSelectedValue().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento para actualizar", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AuthorModel author = authors.stream().filter(a -> a.getNombre().equals(authorsList.getSelectedValue())).findFirst().orElse(null);
        author.setNombre(editAuthorTextField.getText());
        authorService.update(author);
        populateJlists();
    }//GEN-LAST:event_editAuthorButtonPanelMouseClicked

    private void editEditorialButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEditorialButtonPanelMouseClicked
         if (EditorialList.getSelectedValue() == null || EditorialList.getSelectedValue().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento para actualizar", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        EditorialModel editorial1 = editorials.stream().filter(editorial -> editorial.getNombre().equals(EditorialList.getSelectedValue())).findFirst().orElse(null);
        editorial1.setNombre(editEditorialTextField.getText());
        editorialService.update(editorial1);
        populateJlists();
    }//GEN-LAST:event_editEditorialButtonPanelMouseClicked

    private void deleteAuthorButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAuthorButtonPanelMouseClicked
        if (authorsList.getSelectedValue() == null || authorsList.getSelectedValue().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento para actualizar", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AuthorModel author = authors.stream().filter(a -> a.getNombre().equals(authorsList.getSelectedValue())).findFirst().orElse(null);
        int response = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION){
             authorService.delete(author.getId());
        };
        authorService.delete(author.getId());
        populateJlists();
    }//GEN-LAST:event_deleteAuthorButtonPanelMouseClicked

    private void authorsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_authorsListValueChanged
        // TODO add your handling code here:
        //System.out.println(authorsList.getSelectedValue());
    }//GEN-LAST:event_authorsListValueChanged

    private void authorsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorsListMouseClicked
        
        editAuthorTextField.setText(authorsList.getSelectedValue());
    }//GEN-LAST:event_authorsListMouseClicked

    private void EditorialListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditorialListMouseClicked
        
        editEditorialTextField.setText(EditorialList.getSelectedValue());
    }//GEN-LAST:event_EditorialListMouseClicked

    private void addAuthorTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAuthorTextFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAuthorTextFieldMousePressed

    private void addAuthorTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAuthorTextFieldMouseClicked
        // TODO add your handling code here:
        addAuthorTextField.setText("");
        addAuthorTextField.setForeground(Color.black);
    }//GEN-LAST:event_addAuthorTextFieldMouseClicked

    private void addEditorialTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEditorialTextFieldMouseClicked
        // TODO add your handling code here:
        addEditorialTextField.setText("");
        addEditorialTextField.setForeground(Color.black);
    }//GEN-LAST:event_addEditorialTextFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> EditorialList;
    private javax.swing.JPanel addAuthorButtonPanel1;
    private javax.swing.JTextField addAuthorTextField;
    private javax.swing.JPanel addEditorialButtonPanel;
    private javax.swing.JTextField addEditorialTextField;
    private javax.swing.JList<String> authorsList;
    private javax.swing.JPanel deleteAuthorButtonPanel;
    private javax.swing.JPanel deleteEditorialButtonPanel;
    private javax.swing.JPanel editAuthorButtonPanel;
    private javax.swing.JTextField editAuthorTextField;
    private javax.swing.JPanel editEditorialButtonPanel;
    private javax.swing.JTextField editEditorialTextField;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
