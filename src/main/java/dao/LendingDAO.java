/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.LendingModel;
import model.UserModel;

/**
 *
 * @author Hamer
 */
public class LendingDAO implements ICrudService<LendingModel> {
    private MySqlConnection conexion = new MySqlConnection();
    // private LibroService bookService;
    // private UserService userService;
    private BookDAO bookDAO;
    private UserDAO userDAO;

    private BookModel book;
    private UserModel user;
    // private AutorService autorService = new AutorService(new AutorDAO());
    // private EditorialService editorialService = new EditorialService(new
    // EditorialDAO());

    public LendingDAO() {

    }

    public LendingDAO(BookDAO bookDAO, UserDAO userDAO) {
        this.bookDAO = bookDAO;
        this.userDAO = userDAO;
    }

    @Override
    public List<LendingModel> selectAll() {
        String sql = "SELECT * FROM prestamo;";
        List<LendingModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                LendingModel prestamo = new LendingModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamo.setEstado(resultSet.getInt("estado"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamos;
    }

    @Override
    public void insertInto(LendingModel entity) {
        String sql = "INSERT INTO prestamo(cantidad, fecha_prestamo, fecha_devolucion, id_book, id_user) VALUES (?,?,?,?,?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, entity.getCantidad());
            statement.setDate(2, entity.getFechaPrestamo());
            statement.setDate(3, entity.getFechaDevolucion());
            statement.setInt(4, entity.getLibro().getId());
            statement.setInt(5, entity.getUsuario().getId());

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Prestamo insertedo existosamente!");
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public LendingModel selectById(int id) {
        String sql = "SELECT * FROM prestamo WHERE id = ?;";
        LendingModel prestamo = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                prestamo = new LendingModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamo.setEstado(resultSet.getInt("estado"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamo;
    }

    @Override
    public void delete(int id) {
        String sql = " DELETE FROM prestamo WHERE id = ?;";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("prestamo eliminado exitosamente!");
            } else {
                System.out.println("No se encontró un prestamo con el ID proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(LendingModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LendingModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<LendingModel> selectByIdOfUser(int id) {
        String sql = "SELECT * FROM prestamo WHERE id_user = ?;";

        List<LendingModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                LendingModel prestamo = new LendingModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamo.setEstado(resultSet.getInt("estado"));
                prestamos.add(prestamo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamos;
    }

    public List<LendingModel> selectByIdOfBook(int id) {
        String sql = "SELECT * FROM prestamo WHERE id_book = ?;";

        List<LendingModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                LendingModel prestamo = new LendingModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamos.add(prestamo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamos;
    }

    public DefaultTableModel selectByDNIOfUser(String dni) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Cantidad");
        model.addColumn("Estado");
        model.addColumn("Libro");
        model.addColumn("Dni");
        model.addColumn("Username");

        String sql = "SELECT prestamo.id, prestamo.cantidad, prestamo.estado, libro.titulo, user.dni, user.username FROM prestamo "
                + "INNER JOIN libro on prestamo.id_book =libro.id INNER JOIN user ON prestamo.id_user = user.id WHERE user.dni = ?;";

        List<LendingModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, dni);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                model.addRow(new Object[] { resultSet.getInt("id"), resultSet.getInt("cantidad"),
                        resultSet.getInt("estado") == 0 ? "en proceso" : "procesado y entregado",
                        resultSet.getString("titulo"), resultSet.getString("dni"), resultSet.getString("username") });

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return model;
    }

    public void updateStateById(int id, int state) {
        String sql = "UPDATE prestamo SET estado = ? WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, state);
            statement.setInt(2, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Prestamo actualizado exitosamente!");
            } else {
                System.out.println("No se encontró un Prestamo con el ID proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
