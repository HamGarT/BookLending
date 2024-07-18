/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Hamer
 */
public class DonationModel {
    private int id;
    private String entityOrPerson;
    private BookModel book;

    public DonationModel(String entityOrPerson, BookModel book) {
        this.entityOrPerson = entityOrPerson;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityadOrPerson() {
        return entityOrPerson;
    }

    public void setEntityadOrPerson(String entityadOrPerson) {
        this.entityOrPerson = entityOrPerson;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

}
