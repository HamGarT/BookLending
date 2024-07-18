/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.LendingDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.LendingModel;

/**
 *
 * @author Hamer
 */
public class LendingService {
    
    private LendingDAO prestamoDAO;

    public LendingService(LendingDAO prestamoDAO) {
        this.prestamoDAO = prestamoDAO;
    }
    
    
    public void insertPrestamos(LendingModel prestamoEntity) {
        
        prestamoDAO.insertInto(prestamoEntity);
        
    }
    
    public List<LendingModel> getPrestamosByUserId(int id){
        return prestamoDAO.selectByIdOfUser(id);
    }
    
    public void removePrestamo(int id){
     prestamoDAO.delete(id);
    }
    
    public LendingModel getPrestamoById(int id){
     return prestamoDAO.selectById(id);
    }
    
    public DefaultTableModel getPrestamoByDNIOfUser(String dni){
        return prestamoDAO.selectByDNIOfUser(dni);
    }
    
    public void updateStateOfPrestamo(int id, int state){
        prestamoDAO.updateStateById(id, state);
    }
}
