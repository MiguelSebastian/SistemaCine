package pe.utp.controlcine.controller;

import java.util.List;
import pe.utp.controlcine.dao.Dao;
import pe.utp.controlcine.dao.ProductoDao;
import pe.utp.controlcine.entity.Producto;

/**
 *
 * @author Miguel
 */
public class ProductoController {

    private Dao<Producto> iProducto;
    private Producto producto;
    private List<Producto> listProductos = null;
    private List<Producto> listarProductos = null;

    public ProductoController(){
        iProducto = new ProductoDao();
    }
    
    public Producto getProducto(String nombre) {
        this.iProducto = new ProductoDao();
        try {
            this.producto = this.iProducto.getEntity(nombre);
            if (this.producto != null) {
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.producto;
    }

    public boolean insertProducto(Producto producto) {
        boolean insert = false;
//        this.iProducto = new ProductoDao();
        try {
            insert = this.iProducto.insert(producto);
        } catch (Exception e) {
            System.out.println(e);
        }
        return insert;
    }

    public boolean updateProducto(Producto producto) {
        boolean update = false;
//        this.iProducto = new ProductoDao();
        try {
            update = this.iProducto.update(producto);
        } catch (Exception e) {
            System.out.println(e);
        }
        return update;
    }

    public List<Producto> getDetListProduto() {
//        this.iProducto = new ProductoDao();
        try {
            listProductos = iProducto.getListOfEntities();            
        } catch (Exception e) {
            System.out.println(e);
        }
        return listProductos;
    }
    
    public boolean updateDetProd(int pk){
        boolean upd = false;
        producto = new Producto();
        producto.setIdProducto(pk);
        this.iProducto = new ProductoDao();
        try {            
            if (iProducto.insert01(producto)) {
                upd = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return upd;
    }
    
     public List<Producto> getDetListProductoPorCod(String codigo) {
        String valores[] = {codigo};
//        this.iProducto = new ProductoDao();
        try {
            listarProductos = iProducto.getListOfEntities01(valores);           
        } catch (Exception e) {
            System.out.println(e);
        }
        return listarProductos;
    } 
}
