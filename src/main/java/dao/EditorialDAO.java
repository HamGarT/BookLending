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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EditorialModel;

/**
 *
 * @author Hamer
 */
public class EditorialDAO implements ICrudService<EditorialModel> {
    MySqlConnection conexion = new MySqlConnection();

    @Override
    public List<EditorialModel> selectAll() {
        String sql = "SELECT * FROM editorial;";
        List<EditorialModel> editorials = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conexion.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                EditorialModel editorial = new EditorialModel();
                editorial.setId(resultSet.getInt("id"));
                editorial.setNombre(resultSet.getString("nombre"));
                editorials.add(editorial);
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

        return editorials;
    }

    @Override
    public void insertInto(EditorialModel entity) {
        String sql = "INSERT INTO editorial(nombre) VALUES (?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getNombre());
            statement.executeUpdate();
            System.out.println("Editorial insertedo existosamente!");
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
    public EditorialModel selectById(int id) {
        String sql = "SELECT * FROM editorial WHERE id = ?";
        EditorialModel editorial = null;

        try (Connection connection = MySqlConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    editorial = new EditorialModel();
                    editorial.setId(resultSet.getInt("id"));
                    editorial.setNombre(resultSet.getString("nombre"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return editorial;
    }

    @Override
    public void delete(int id) {
        String sql = " DELETE FROM editorial WHERE id = ?;";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("editorial eliminado exitosamente!");
            } else {
                System.out.println("No se encontró una editorial con el ID proporcionado.");
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
    public void update(EditorialModel entity) {
        String sql = " UPDATE editorial SET nombre = ? WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getNombre());
            statement.setInt(2, entity.getId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Editorial actualizado exitosamente!");
            } else {
                System.out.println("No se encontró un editorial con el ID proporcionado.");
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
    public List<EditorialModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
