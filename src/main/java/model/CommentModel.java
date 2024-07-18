package model;

import java.util.Calendar;

public class CommentModel {
    private int id;
    private UserModel usuario;
    private BookModel libro;
    private String contenido;

    public CommentModel() {
    }

    public CommentModel(UserModel usuario, BookModel libro, String contenido) {
        this.usuario = usuario;
        this.libro = libro;
        this.contenido = contenido;
    }

    public CommentModel(int id, UserModel usuario, BookModel libro, String contenido) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "ComentarioModel{" + "id=" + id + ", usuario=" + usuario + ", libro=" + libro + ", contenido="
                + contenido + '}';
    }

}
