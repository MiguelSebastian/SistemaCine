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
public class Personal {
    private int idPersonal;
    private String nombre;
    private String apellido;
    private String dni;
    private int idAdmEmp;

    public int getIdAdmEmp() {
        return idAdmEmp;
    }

    public void setIdAdmEmp(int idAdmEmp) {
        this.idAdmEmp = idAdmEmp;
    }

    public Personal(int idPersonal, String nombre, String apellido, String dni) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Personal() {
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
