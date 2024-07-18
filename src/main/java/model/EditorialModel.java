package model;

public class EditorialModel {
    private int id;
    private String nombre;

    public EditorialModel() {
    }

    public EditorialModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public EditorialModel(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int idEditorial) {
        this.id = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "idEditorial=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
