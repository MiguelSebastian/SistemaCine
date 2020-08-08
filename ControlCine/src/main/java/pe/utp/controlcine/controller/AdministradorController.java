package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.AdministradorDao;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.entity.Administrador;

/**
 *
 * @author Miguel
 */
public class AdministradorController {

    private Dao<Administrador> iAdmin;
    private Administrador administrador = null;
    private List<Administrador> listAdministrador = null;

    public Administrador getAdministrador(int id) {
        this.iAdmin = new AdministradorDao();
        try {
            this.administrador = this.iAdmin.getEntity(id);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.administrador;
    }

    public boolean insertAdministrador(Administrador admin) {
        boolean insert = false;
        this.iAdmin = new AdministradorDao();
        try {
            insert = this.iAdmin.insert(admin);
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;
    }

    public boolean updateAdministrador(Administrador admin) {
        boolean update = false;
        this.iAdmin = new AdministradorDao();
        try {
            update = this.iAdmin.update(admin);
        } catch (Exception e) {
            System.out.println(e);
        }
        return update;
    }

    public Administrador getAdministrador(Object[] valores) {
        this.iAdmin = new AdministradorDao();
        try {
            this.administrador = this.iAdmin.getEntity(valores);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.administrador;
    }

    public boolean deleteAdministrador(int pk) {
        this.iAdmin = new AdministradorDao();
        boolean del = false;
        try {
            if (iAdmin.delete(pk)) {
                del = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return del;
    }
}
