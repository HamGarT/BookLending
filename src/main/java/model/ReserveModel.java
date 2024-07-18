package model;

import java.util.Calendar;

public class ReserveModel {
    private int idReserva;
    private int idUsuario;
    private int idLibro;
    private Calendar fechaReserva;
    private String estado;
    private int idAdministrador;

    public ReserveModel() {
    }

    public ReserveModel(int idReserva, int idUsuario, int idLibro, Calendar fechaReserva, String estado, int idAdministrador) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.idAdministrador = idAdministrador;
    }

    public ReserveModel(int idUsuario, int idLibro, Calendar fechaReserva, String estado, int idAdministrador) {
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.idAdministrador = idAdministrador;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Calendar getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Calendar fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idUsuario=" + idUsuario + ", idLibro=" + idLibro + ", fechaReserva=" + fechaReserva + ", estado=" + estado + ", idAdministrador=" + idAdministrador + '}';
    }

    
    
}
