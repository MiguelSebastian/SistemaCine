package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.CineDao;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.entity.Cine;

/**
 *
 * @author Miguel
 */
public class CineController {

    private final Dao<Cine> iCine;
    private final Cine cine;
    private List<Cine> listPeliculas = null;

    public CineController() {
        this.iCine = new CineDao();
        cine = new Cine();
    }

    public List<Cine> getListCine() {
        try {
            listPeliculas = iCine.getListOfEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listPeliculas;
    }
    
    
}
