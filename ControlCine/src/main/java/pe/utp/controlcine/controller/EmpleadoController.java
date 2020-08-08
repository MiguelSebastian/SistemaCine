/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.dao.EmpleadoDao;
import pe.utp.controlcine.entity.Empleado;

/**
 *
 * @author Miguel
 */
public class EmpleadoController {

    private Dao<Empleado> iEmpleado;
    private Empleado empleado = null;
    private List<Empleado> listEmpleado = null;

    public Empleado getEmpleado(int id) {
        this.iEmpleado = new EmpleadoDao();
        try {
            this.empleado = this.iEmpleado.getEntity(id);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.empleado;
    }

    public boolean insertEmpleado(Empleado empleado) {
        boolean insert = false;
        this.iEmpleado = new EmpleadoDao();
        try {
            insert = this.iEmpleado.insert(empleado);
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;
    }

    public boolean updateEmpleado(Empleado empleado) {
        boolean update = false;
        this.iEmpleado = new EmpleadoDao();
        try {
            update = this.iEmpleado.update(empleado);
        } catch (Exception e) {
            System.out.println(e);
        }
        return update;
    }

    public Empleado getEmpleado(Object[] valores) {
        this.iEmpleado = new EmpleadoDao();
        try {
            this.empleado = this.iEmpleado.getEntity(valores);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.empleado;
    }

    public boolean deleteEmpleado(int pk) {
        this.iEmpleado = new EmpleadoDao();
        boolean del = false;
        try {
            if (iEmpleado.delete(pk)) {
                del = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return del;
    }
}
