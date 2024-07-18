/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connection.MySqlConnection;
import dao.EditorialDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AuthorModel;
import model.EditorialModel;

/**
 *
 * @author Hamer
 */
public class EditorialService{
    
    private EditorialDAO editorialDAO;
    public EditorialService(EditorialDAO editorialDAO){
        
        this.editorialDAO = editorialDAO;
    }
    public List<EditorialModel> getAllEditorials() {
       return editorialDAO.selectAll();
    }

    
    public void insertInto(EditorialModel entity) {
        editorialDAO.insertInto(entity);
    }

    
    public EditorialModel getEditorialById(int id) {
        return editorialDAO.selectById(id);
    }

    
    public void delete(int id) {
        editorialDAO.delete(id);
    }

    
    public void update(EditorialModel entity) {
        editorialDAO.update(entity);
    }

    
    public List<EditorialModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
