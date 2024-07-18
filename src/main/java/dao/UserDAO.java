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
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UserModel;

/**
 *
 * @author Hamer
 */
public class UserDAO implements ICrudService<UserModel> {
    UserModel userModel = new UserModel();
    MySqlConnection conexion = new MySqlConnection();
    
    @Override
    public List<UserModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertInto(UserModel user) {
        String sql = "INSERT INTO user(username, password, email, is_admin, nombres, apellidos, dni, direccion, url_image) VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getIsAdmin());
            statement.setString(5, user.getNombres());
            statement.setString(6, user.getApellidos());
            statement.setString(7, user.getDni());
            statement.setString(8, user.getDireccion());
            statement.setString(9, user.getUrlProfilePhoto());

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Usuario insertedo existosamente!");
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
    public UserModel selectById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?;";
        UserModel user = new UserModel();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            if (resultSet.next()) { 
                
                user.setId(resultSet.getInt("id"));
                user.setNombres(resultSet.getString("nombres"));
                user.setApellidos(resultSet.getString("apellidos"));
                user.setDireccion(resultSet.getString("direccion"));
                user.setDni(resultSet.getString("dni"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setUsername(resultSet.getString("username"));
                user.setIsAdmin(resultSet.getInt("is_admin"));
                user.setUrlProfilePhoto(resultSet.getString("url_image"));
                
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
    
        return user;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(UserModel entity) {
        String sql = "UPDATE user SET username = ?, password = ?, email = ?, nombres = ?, apellidos = ?, dni = ?, direccion = ?, url_image = ? WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getUsername());
            statement.setString(2, entity.getPassword());
            statement.setString(3, entity.getEmail());
            statement.setString(4, entity.getNombres());
            statement.setString(5, entity.getApellidos());
            statement.setString(6, entity.getDni());
            statement.setString(7, entity.getDireccion());
            statement.setString(8, entity.getUrlProfilePhoto());
            statement.setInt(9, entity.getId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("usuario actualizado exitosamente!");
            } else {
                System.out.println("No se encontró un usuario con el ID proporcionado.");
            }
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
    public List<UserModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<UserModel> selectByUsername(String username) {
        
        String sql = "SELECT * FROM user WHERE username = ?;";
        List<UserModel> users = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, username);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setNombres(resultSet.getString("nombres"));
                user.setApellidos(resultSet.getString("apellidos"));
                user.setDireccion(resultSet.getString("direccion"));
                user.setDni(resultSet.getString("dni"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setUsername(resultSet.getString("username"));
                user.setIsAdmin(resultSet.getInt("is_admin"));
                user.setUrlProfilePhoto(resultSet.getString("url_image"));
                users.add(user);
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
    
        return users;
    }    
}
