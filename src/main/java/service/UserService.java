/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UserDAO;
import java.util.List;
import model.UserModel;

/**
 *
 * @author Hamer
 */
public class UserService{

    private UserDAO userDAO;
    
    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    
    public List<UserModel> getAllUsers() {
        return userDAO.selectAll();
    }


    public void insertUser(UserModel user) {
        userDAO.insertInto(user);
    }

    public UserModel checkUserandPassword(String username, String password){
        List<UserModel> users = userDAO.selectByUsername(username);
        //UsuarioModel user = null;
        if(!users.isEmpty()){
            for(UserModel user : users){
                if(user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }
    
    public UserModel getUserById(int id) {
        return userDAO.selectById(id);
    }

    
    
    public void delete(int id) {
        
    }

    
    public void updateUser(UserModel entity) {
        userDAO.update(entity);
    }

    
    public List<UserModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
