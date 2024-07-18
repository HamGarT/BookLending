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
public class UserModel extends PersonModel{
    private int id;
    private String username;
    private String password;
    private int isAdmin;
    private String urlProfilePhoto;

    public UserModel() {
    }

    public UserModel(int id, String username, String password, int isAdmin, String urlProfilePhoto, String nombres, String apellidos, String dni, String direccion, String email) {
        super(nombres, apellidos, dni, direccion, email);
        this.id = id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.urlProfilePhoto = urlProfilePhoto;
    }
     public UserModel(String username, String password, int isAdmin, String urlProfilePhoto, String nombres, String apellidos, String dni, String direccion, String email) {
        super(nombres, apellidos, dni, direccion, email);
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.urlProfilePhoto = urlProfilePhoto;
    }

    public UserModel(int id, String username, String password, String urlProfilePhoto, String nombres, String apellidos, String dni, String direccion, String email) {
        super(nombres, apellidos, dni, direccion, email);
        this.id = id;
        this.username = username;
        this.password = password;
        this.urlProfilePhoto = urlProfilePhoto;
    }

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUrlProfilePhoto() {
        return urlProfilePhoto;
    }

    public void setUrlProfilePhoto(String urlProfilePhoto) {
        this.urlProfilePhoto = urlProfilePhoto;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "id=" + id + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", urlProfilePhoto=" + urlProfilePhoto + '}';
    }

    
    
}
