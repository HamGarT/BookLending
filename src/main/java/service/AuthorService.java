/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.AuthorDAO;
import java.util.List;
import model.AuthorModel;


/**
 *
 * @author Hamer
 */
public class AuthorService {
    private AuthorDAO authorDAO;
    public AuthorService(AuthorDAO authorDAO){
        this.authorDAO = authorDAO;
    }
    
    public List<AuthorModel> getAllAuthors() {
        return authorDAO.selectAll();
       
    }

    
    public void insertInto(AuthorModel entity) {
        authorDAO.insertInto(entity);
    }

    
    public AuthorModel selectById(int id) {
        
        return authorDAO.selectById(id);
    }

    
    public void delete(int id) {
        authorDAO.delete(id);
    }

    
    public void update(AuthorModel entity) {
        authorDAO.update(entity);
    }

    
    public List<AuthorModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
