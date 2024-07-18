/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AuthorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import dao.LendingDAO;
import dao.UserDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import service.BookService;
import service.LendingService;

/**
 *
 * @author Hamer
 */
public class PrestamosAdminPanelView extends javax.swing.JPanel {

    private LendingService prestamoService;
    private BookService bookService;

    /**
     * SELECT prestamo.id, prestamo.cantidad, prestamo.estado, libro.titulo,
     * user.dni, user.username FROM prestamo INNER JOIN libro on prestamo.id_book
     * =libro.id INNER JOIN user ON prestamo.id_user = user.id WHERE user.dni =
     * 12345678;
     */
    public PrestamosAdminPanelView() {
        initComponents();
        setupServices();

    }

    private void setupServices() {
        BookDAO bookDAO = new BookDAO(new AuthorDAO(), new EditorialDAO());
        LendingDAO prestamoDAO = new LendingDAO(bookDAO, new UserDAO());
        prestamoService = new LendingService(prestamoDAO);
        bookService = new BookService(bookDAO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dniTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        processButtonPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteButtonPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));

        dniTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        dniTextField.setForeground(new java.awt.Color(204, 204, 204));
        dniTextField.setText("Ingresar dni a buscar");
        dniTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dniTextFieldMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(74, 92, 106));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        jTable1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        processButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        processButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        processButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processButtonPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Procesar");

        javax.swing.GroupLayout processButtonPanelLayout = new javax.swing.GroupLayout(processButtonPanel);
        processButtonPanel.setLayout(processButtonPanelLayout);
        processButtonPanelLayout.setHorizontalGroup(
                processButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 191, Short.MAX_VALUE)
                        .addGroup(
                                processButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(processButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 66, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(0, 67, Short.MAX_VALUE))));
        processButtonPanelLayout.setVerticalGroup(
                processButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(
                                processButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(processButtonPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE))));

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Para cambiar el estado del prestamo seleccione las filas deseadas");

        deleteButtonPanel.setBackground(new java.awt.Color(74, 92, 106));
        deleteButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");

        javax.swing.GroupLayout deleteButtonPanelLayout = new javax.swing.GroupLayout(deleteButtonPanel);
        deleteButtonPanel.setLayout(deleteButtonPanelLayout);
        deleteButtonPanelLayout.setHorizontalGroup(
                deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 191, Short.MAX_VALUE)
                        .addGroup(deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(deleteButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 66, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 67, Short.MAX_VALUE))));
        deleteButtonPanelLayout.setVerticalGroup(
                deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(deleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(deleteButtonPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 507,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(processButtonPanel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(deleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(314, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dniTextField)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(processButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(159, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        String dni = dniTextField.getText().trim();
        jTable1.setModel(prestamoService.getPrestamoByDNIOfUser(dni));

    }// GEN-LAST:event_jPanel1MouseClicked

    private void dniTextFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dniTextFieldMouseClicked
        // TODO add your handling code here:
        dniTextField.setText("");
        dniTextField.setForeground(Color.BLACK);
    }// GEN-LAST:event_dniTextFieldMouseClicked

    private void processButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_processButtonPanelMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila para realizar esta operacion");
            return;
        }
        if (selectedRow != -1) {
            Object id = jTable1.getValueAt(selectedRow, 0);
            Object cantidad = jTable1.getValueAt(selectedRow, 1);
            Object estado = jTable1.getValueAt(selectedRow, 2);
            Object titulo = jTable1.getValueAt(selectedRow, 3);
            Object dni = jTable1.getValueAt(selectedRow, 4);
            Object username = jTable1.getValueAt(selectedRow, 5);

            prestamoService.updateStateOfPrestamo((Integer) id, 1);
            jTable1.setModel(prestamoService.getPrestamoByDNIOfUser(dni.toString()));
            System.out.println("id: " + id);

        } else {
            System.out.println("No se ha seleccionado ninguna fila.");
        }

    }// GEN-LAST:event_processButtonPanelMouseClicked

    private void deleteButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPanelMouseClicked
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila para realizar esta operacion");
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            if (selectedRow != -1) {
                Object id = jTable1.getValueAt(selectedRow, 0);
                Object dni = jTable1.getValueAt(selectedRow, 4);
                bookService.calcCantoOfAvailableBooksAfterDevolve(prestamoService.getPrestamoById((Integer) id));
                prestamoService.removePrestamo((Integer) id);
                jTable1.setModel(prestamoService.getPrestamoByDNIOfUser(dni.toString()));
                System.out.println("id: " + id);

            } else {
                System.out.println("No se ha seleccionado ninguna fila.");
            }
        }
        ;

    }// GEN-LAST:event_deleteButtonPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel deleteButtonPanel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel processButtonPanel;
    // End of variables declaration//GEN-END:variables
}
