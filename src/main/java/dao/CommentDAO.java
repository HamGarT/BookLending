/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CommentModel;
import model.BookModel;

/**
 *
 * @author Hamer
 */
public class CommentDAO implements ICrudService<CommentModel> {
    private MySqlConnection conexion = new MySqlConnection();
    private UserDAO userDAO;
    private BookDAO bookDAO;

    public CommentDAO(UserDAO userDAO, BookDAO bookDAO) {
        this.userDAO = userDAO;
        this.bookDAO = bookDAO;
    }
    
    @Override
    public List<CommentModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertInto(CommentModel entity) {
        String sql = "INSERT INTO comentarios(contenido, id_user, id_book) VALUES (?, ?, ?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getContenido());
            statement.setInt(2, entity.getUsuario().getId());
            statement.setInt(3, entity.getLibro().getId());
            statement.executeUpdate();
            System.out.println("Commentario insertado existosamente!");
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public CommentModel selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(CommentModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CommentModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public List<CommentModel> selectByIdOfBook(int id) {
        List<CommentModel> comments = new ArrayList<>();
        
        String sql = "SELECT * FROM comentarios WHERE id_book = ? ORDER BY id DESC";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                CommentModel comentario = new CommentModel();
                comentario.setId(resultSet.getInt("id"));
                comentario.setContenido(resultSet.getString("contenido"));
                comentario.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                comentario.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                comments.add(comentario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        
        return comments;
    }
    
}
