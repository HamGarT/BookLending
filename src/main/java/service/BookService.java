/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.AuthorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import dao.LendingDAO;
import dao.UserDAO;
import java.util.List;
import model.BookModel;
import model.LendingModel;

/**
 *
 * @author Hamer
 */
public class BookService{
    
    private BookDAO bookDAO;
    private LendingDAO prestamosDAO;

    public BookService(BookDAO bookDAO) {
        
        this.bookDAO = bookDAO;
    }
    
    //public  BookService(){};
    
    
   
    public void addBook(BookModel bookEntity) {
        
        bookDAO.insertInto(bookEntity);
        
    }

    
    public BookModel getBookById(int id) {
        
        return bookDAO.selectById(id);
        
        
    }

    public int calcCantoOfAvailableBooks(int id){
       prestamosDAO = new LendingDAO(new BookDAO(new AuthorDAO(), new EditorialDAO()), new UserDAO());
       BookModel book = bookDAO.selectById(id);
       List<LendingModel> prestamos = prestamosDAO.selectByIdOfBook(id);
       int numtAvailableBooks = book.getTotalEjemplares();
       int numBooksBorrowed = prestamos.stream().mapToInt(LendingModel::getCantidad).sum();
       numtAvailableBooks = numtAvailableBooks - numBooksBorrowed;
        
        
       bookDAO.updateNumOfBooks(numtAvailableBooks, id);
        
       return numtAvailableBooks;
    }
   
    public void calcCantoOfAvailableBooksAfterDevolve(LendingModel prestamo){
        BookModel book = bookDAO.selectById(prestamo.getLibro().getId());
        
        int numtAvailableBooks = book.getSinPrestar();
        int numBooksBorrowed = prestamo.getCantidad();
        numtAvailableBooks = numtAvailableBooks + numBooksBorrowed;
        
        
        bookDAO.updateNumOfBooks(numtAvailableBooks, prestamo.getLibro().getId());
    }
    
    public void delete(int id) {
        bookDAO.delete(id);
    }

    
    public void update(int id, BookModel entity) {
        bookDAO.update(entity);
    }

    
    public List<BookModel> search(String keyword) {
        return bookDAO.search(keyword);
    }

   
    
    
    public List<BookModel> getAllBooks() {
        
        return bookDAO.selectAll();
        
    }

}
