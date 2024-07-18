/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;



/**
 *
 * @author Hamer
 */
public class LendingModel {
    private int id;
    private int cantidad;
    private UserModel usuario;
    private BookModel libro;
    private int estado; // 0: en proceso; 1: procesado y entregado
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public LendingModel(int cantidad, UserModel usuario, BookModel libro, Date fechaPrestamo, Date fechaDevolucion) {
        this(cantidad,  usuario,  libro, 0, fechaPrestamo, fechaDevolucion);
    }

    public LendingModel(int cantidad, UserModel usuario, BookModel libro, int estado, Date fechaPrestamo, Date fechaDevolucion) {
        
        this.cantidad = cantidad;
        this.usuario = usuario;
        this.libro = libro;
        this.estado = estado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    
    public LendingModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public BookModel getLibro() {
        return libro;
    }

    public void setLibro(BookModel libro) {
        this.libro = libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    

    

    
    
}
