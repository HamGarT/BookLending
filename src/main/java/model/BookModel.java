package model;


import java.time.Year;


public class BookModel {
    private int id;
    private String titulo;
    private String sinopsis;
    private String urlImage;
    private String isbn;
    private Year anioPublicacion;
    private AuthorModel autor;
    private EditorialModel editorial;
    private int totalEjemplares;
    private int sinPrestar;
    private String donador;

    public BookModel(String titulo, String Sinopsis, String urlImage, String isbn, Year añoPublicacion, AuthorModel autor, EditorialModel editorial) {
        this.titulo = titulo;
        this.sinopsis = Sinopsis;
        this.urlImage = urlImage;
        this.isbn = isbn;
        this.anioPublicacion = añoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public BookModel(String titulo, String sinopsis, String urlImage, String isbn, Year anioPublicacion, AuthorModel autor, EditorialModel editorial, int totalEjemplares, int sinPrestar, String donador) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.urlImage = urlImage;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.editorial = editorial;
        this.totalEjemplares = totalEjemplares;
        this.sinPrestar = sinPrestar;
        this.donador = donador;
    }

    
    public BookModel() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.sinopsis = Sinopsis;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Year getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Year añoPublicacion) {
        this.anioPublicacion = añoPublicacion;
    }

    public AuthorModel getAutor() {
        return autor;
    }

    public void setAutor(AuthorModel idAutor) {
        this.autor = idAutor;
    }

    public EditorialModel getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialModel editorial) {
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalEjemplares() {
        return totalEjemplares;
    }

    public void setTotalEjemplares(int totalEjemplares) {
        this.totalEjemplares = totalEjemplares;
    }

    public int getSinPrestar() {
        return sinPrestar;
    }

    public void setSinPrestar(int sinPrestar) {
        this.sinPrestar = sinPrestar;
    }

    public String getDonador() {
        return donador;
    }

    public void setDonador(String donador) {
        this.donador = donador;
    }
     
    @Override
    public String toString() {
        return "LibroModel{" + "titulo=" + titulo + ", Sinopsis=" + sinopsis + ", urlImage=" + urlImage + ", isbn=" + isbn + ", a\u00f1oPublicacion=" + anioPublicacion + ", idAutor=" + id + ", idEditorial=" + editorial + '}';
    }
    

    

    
   
    
    
}
