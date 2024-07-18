
package model;

public class AuthorModel {
    private int id;
    private String nombre;

    public AuthorModel() {
    }

    public AuthorModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public AuthorModel(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + id + ", nombre=" + nombre + '}';
    }

}
