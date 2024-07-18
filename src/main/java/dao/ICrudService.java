/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import service.*;
import java.util.List;
import model.BookModel;

/**
 *
 * @author Hamer
 */
public interface ICrudService<T> {
    List<T> selectAll();
    void insertInto(T entity);
    T selectById(int id);
    void delete(int id);
    void update(T entity);
    List<T> search(String keyword);
}
