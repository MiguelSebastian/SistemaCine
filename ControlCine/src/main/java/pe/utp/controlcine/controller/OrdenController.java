package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.dao.OrdenesDao;
import pe.utp.controlcine.entity.Orden;

/**
 *
 * @author Miguel
 */
public class OrdenController {

    private Dao<Orden> iOrden;
//    private Orden Orden;
    private List<Orden> listOrden = null;

    public OrdenController() {
        iOrden = new OrdenesDao();
    }
    
    public List<Orden> getListOrden() {
        try {
            listOrden = iOrden.getListOfEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listOrden;
    }

    public List<Orden> getListOrden(String cine,String codigo) {
        String valores[] = {cine,codigo};
        try {
            listOrden = iOrden.getListOfEntities01(valores);
        } catch (Exception e) {
            System.out.println(e);
        }
        return listOrden;
    }
    
    public boolean deleteOrden(int pk){
        boolean del = false;
        try {
            if (iOrden.delete(pk)) {
                del = true;
            }           
        } catch (Exception e) {
            System.out.println(e);
        }
        return del;
    }
}
