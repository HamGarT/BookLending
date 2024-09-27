/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookModel;

/**
 *
 * @author Hamer
 */
public class BookDAO implements ICrudService<BookModel> {

    private MySqlConnection conexion = new MySqlConnection();
    private AuthorDAO autorDAO;
    private EditorialDAO editorialDAO;

    public BookDAO(AuthorDAO autorDAO, EditorialDAO editorialDAO) {
        this.autorDAO = autorDAO;
        this.editorialDAO = editorialDAO;
    }

    public BookDAO() {
    };

    @Override
    public void insertInto(BookModel bookEntity) {
        String sql = "INSERT INTO libro(titulo, sinopsis, url_image, isbn, anio_publicacion, total_ejemplares, disponibles, id_author, id_editorial, donador) VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement statement = null;
        try (Connection connection = MySqlConnection.getConnection()) {
            statement = connection.prepareStatement(sql);
            statement.setString(1, bookEntity.getTitulo());
            statement.setString(2, bookEntity.getSinopsis());
            statement.setString(3, bookEntity.getUrlImage());
            statement.setString(4, bookEntity.getIsbn());
            statement.setString(5, bookEntity.getAnioPublicacion().toString());
            statement.setInt(6, bookEntity.getTotalEjemplares());
            statement.setInt(7, bookEntity.getTotalEjemplares());
            statement.setInt(8, bookEntity.getAutor().getId());
            statement.setInt(9, bookEntity.getEditorial().getId());
            statement.setString(10, bookEntity.getDonador());

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Libro insertedo existosamente!");
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
    public BookModel selectById(int id) {
        String sql = "SELECT * FROM libro WHERE id = ?;";

        BookModel libro = new BookModel();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try (Connection connection = MySqlConnection.getConnection()) {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String anioPublicacionStr = resultSet.getString("anio_publicacion");

                Year anioPublicacionDate = Year.parse(anioPublicacionStr.trim());
                libro.setId(resultSet.getInt("id"));
                libro.setTitulo(resultSet.getString("titulo"));
                libro.setSinopsis(resultSet.getString("sinopsis"));
                libro.setUrlImage(resultSet.getString("url_image"));
                libro.setIsbn(resultSet.getString("isbn"));
                libro.setTotalEjemplares(resultSet.getInt("total_ejemplares"));
                libro.setSinPrestar(resultSet.getInt("disponibles"));
                libro.setAnioPublicacion(anioPublicacionDate);
                libro.setAutor(autorDAO.selectById(resultSet.getInt("id_author")));
                libro.setEditorial(editorialDAO.selectById(resultSet.getInt("id_editorial")));
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

        return libro;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM libro WHERE id = ?;";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Libro eliminado existosamente!");
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
    public void update(BookModel entity) {
        String sql = "UPDATE libro SET titulo = ?, sinopsis = ?, url_image = ?, isbn = ?, anio_publicacion = ?, total_ejemplares = ?, "
                + "donador = ?, id_author = ?, id_editorial = ? WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getTitulo());
            statement.setString(2, entity.getSinopsis());
            statement.setString(3, entity.getUrlImage());
            statement.setString(4, entity.getIsbn());
            statement.setString(5, entity.getAnioPublicacion().toString());
            statement.setInt(6, entity.getTotalEjemplares());
            statement.setString(7, entity.getDonador());
            statement.setInt(8, entity.getAutor().getId());
            statement.setInt(9, entity.getEditorial().getId());
            statement.setInt(10, entity.getId());
            statement.executeUpdate();
            System.out.println("Libro modificado existosamente!");
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
    public List<BookModel> search(String keyword) {
        String sql = "SELECT ";
        List<BookModel> libros = new ArrayList<BookModel>();
        return libros;
    }

    @Override
    public List<BookModel> selectAll() {
        String sql = "SELECT * FROM libro;";
        List<BookModel> libros = new ArrayList<>();

        try (Connection connection = MySqlConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String anioPublicacionStr = resultSet.getString("anio_publicacion");
                Year anioPublicacionDate = Year.parse(anioPublicacionStr.trim());
                BookModel libro = new BookModel();
                libro.setId(resultSet.getInt("id"));
                libro.setTitulo(resultSet.getString("titulo"));
                libro.setSinopsis(resultSet.getString("sinopsis"));
                libro.setUrlImage(resultSet.getString("url_image"));
                libro.setIsbn(resultSet.getString("isbn"));
                libro.setTotalEjemplares(resultSet.getInt("total_ejemplares"));
                libro.setSinPrestar(resultSet.getInt("disponibles"));
                libro.setAnioPublicacion(anioPublicacionDate);
                libro.setAutor(autorDAO.selectById(resultSet.getInt("id_author")));
                libro.setEditorial(editorialDAO.selectById(resultSet.getInt("id_editorial")));
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libros;
    }

    public void updateNumOfBooks(int available, int id) {
        String sql = "UPDATE libro SET disponibles = ? WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, available);
            statement.setInt(2, id);

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Libro modificado existosamente!");
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
