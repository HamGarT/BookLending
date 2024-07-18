/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hamer
 */
public class MultasModel {
    private int multaId;
    private int prestamoId;
    private double monto;
    private double pagado;
    private int administradorId;

    public MultasModel(double monto, double pagado) {
        this.monto = monto;
        this.pagado = pagado;
    }

    public int getMultaId() {
        return multaId;
    }

    public void setMultaId(int multaId) {
        this.multaId = multaId;
    }

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPagado() {
        return pagado;
    }

    public void setPagado(double pagado) {
        this.pagado = pagado;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }

    @Override
    public String toString() {
        return "Multas: " + "multaId=" + multaId + ", prestamoId=" + prestamoId + ", monto=" + monto + ", pagado=" + pagado + ", administradorId=" + administradorId + '"';
    }
    
    
}
