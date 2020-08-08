/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.entity;

/**
 *
 * @author Miguel
 */
public class Cine {
    private int idCine;
    private String ubicacion;
    private int idEstado;

    public Cine() {
    }

    public Cine(int idCine, String ubicacion, int idEstado) {
        this.idCine = idCine;
        this.ubicacion = ubicacion;
        this.idEstado = idEstado;
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
}
