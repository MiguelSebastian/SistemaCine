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
public class Empleado {
    private int idEmpleado;
    private int idPersona;
    private String usuario;
    private String contra;

    public Empleado(int idEmpleado, int idPersona, String usuario, String contra) {
        this.idEmpleado = idEmpleado;
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contra = contra;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
