package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.dao.PeliculaDao;
import pe.utp.controlcine.entity.Pelicula;

/**
 *
 * @author Miguel
 */
public class PeliculaController {

    private Dao<Pelicula> iPelicula;
    private Pelicula pelicula = null;
    private List<Pelicula> listPeliculas = null;
    //DefaultTableModel modelotabla;
    
    public PeliculaController() {
        this.iPelicula = new PeliculaDao();
       
    }

    public Pelicula getPelicula(String nombre) {
       // this.iPelicula = new PeliculaDao();
        try {
           // pelicula = this.iPelicula.getEntity(nombre);
            if (this.pelicula != null) {
                this.pelicula = this.iPelicula.getEntity(pelicula.getIdPelicula());
                this.pelicula.setIdPelicula(pelicula.getIdPelicula());
                return this.pelicula;
//                trabajadorBean = controla.getTrabajador(codPla);
//                modelotabla.addRow(new Object[]{this.pelicula, trabajadorBean.getDeNombreApellido(), trabajadorBean.getIdEspecialidad().getDeEspecialidad(), trabajadorBean.getDeEmail()});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.pelicula;
    }

    public boolean insertPelicula(Pelicula pelicula) {
        boolean insert = false;
        //this.iPelicula = new PeliculaDao();
        try {
            insert = this.iPelicula.insert(pelicula);
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;
        /*try {
            if (this.iPelicula.insert(pelicula)) {
                this.pelicula = this.iPelicula.getEntity01(pelicula);
                     insert = this.iPelicula.insert(pelicula);
                    insert = true;                    
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;*/
    }

    public boolean updatePelicula(Pelicula pelicula) {
        boolean update = false;
       
        try {
            update = this.iPelicula.update(pelicula);
        } catch (Exception e) {
            System.out.println(e);
        }
        return update;
    }
        public List<Pelicula> getListPelicula() {
        try {
            listPeliculas = this.iPelicula.getListOfEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listPeliculas;
    }
    public boolean deletePelicula(Pelicula pelicula) {
        boolean delete = false;
        try {
                
                delete = iPelicula.delete(pelicula.getIdPelicula());
                return delete;
            
                
        } catch (Exception e) {
        }        
        return delete;
    }

}
