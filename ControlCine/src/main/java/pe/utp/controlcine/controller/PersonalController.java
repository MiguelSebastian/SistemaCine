package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.dao.PersonalDao;
import pe.utp.controlcine.entity.Administrador;
import pe.utp.controlcine.entity.Empleado;
import pe.utp.controlcine.entity.Personal;

/**
 *
 * @author Miguel
 */
public class PersonalController {
    
    private Dao<Personal> iPersonal;
    private Personal personal = null;
    private List<Personal> listPersonal = null;
    private String tipo = null;
    
    private Administrador administrador;
    private Empleado empleado;
    
    public PersonalController() {
        administrador = new Administrador();
        this.iPersonal = new PersonalDao();
        empleado = new Empleado();
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Personal getPersonal(String usu, String pass) {
        String valores[] = {usu, pass};
//        this.iPersonal = new PersonalDao();
        try {
            administrador = new AdministradorController().getAdministrador(valores);
            if (administrador != null) {
                this.personal = iPersonal.getEntity(administrador.getIdPersona());
                this.personal.setIdAdmEmp(administrador.getIdAdministrador());
                this.setTipo("Admin");
                return this.personal;
            }
            empleado = new EmpleadoController().getEmpleado(valores);
            if (empleado != null) {
                this.personal = iPersonal.getEntity(empleado.getIdPersona());
                this.personal.setIdAdmEmp(empleado.getIdEmpleado());
                this.setTipo("Empleado");
                return this.personal;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.personal;
    }
    
    public boolean insertPersona(Personal persona, Object[] valores) {
        boolean insert = false;
//        this.iPersonal = new PersonalDao();
        try {
            if (this.iPersonal.insert(persona)) {
                this.personal = this.iPersonal.getEntity01(persona);
                if (valores[0].equals("Administrador")) {
                    new AdministradorController().insertAdministrador(new Administrador(0, this.personal.getIdPersonal(), valores[1].toString(), valores[2].toString()));
                    insert = true;                    
                } else {
                    new EmpleadoController().insertEmpleado(new Empleado(0, this.personal.getIdPersonal(), valores[1].toString(), valores[2].toString()));
                    insert = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;
    }
    
    public boolean updatePersona(Personal persona, Object[] valores) {
        boolean update = false;
//        this.iPersonal = new PersonalDao();
        try {
            if (this.iPersonal.update(persona)) {
                if (new AdministradorController().updateAdministrador(new Administrador(0, persona.getIdPersonal(), valores[0].toString(), valores[1].toString()))) {
                    update = true;
                    return update;
                } else {
                    update = new EmpleadoController().updateEmpleado(new Empleado(0, persona.getIdPersonal(), valores[0].toString(), valores[1].toString()));
                    return update;
                }
            }            
        } catch (Exception e) {
            System.out.println(e);
        }
        return update;
    }
    
    public List<Personal> getListPersonal() {
        try {
            listPersonal = this.iPersonal.getListOfEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listPersonal;
    }
    
    public boolean deletePerosnal(Personal persona) {
        boolean delete = false;
        try {
            if (new AdministradorController().deleteAdministrador(persona.getIdPersonal())) {
                delete = iPersonal.delete(persona.getIdPersonal());
                return delete;
            }
            if (new EmpleadoController().deleteEmpleado(persona.getIdPersonal())) {
                delete = iPersonal.delete(persona.getIdPersonal());
                return delete;
            }
        } catch (Exception e) {
        }        
        return delete;
    }
}
