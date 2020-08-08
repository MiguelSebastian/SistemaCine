package pe.utp.controlcine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Producto;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class ProductoDao implements Dao<Producto> {

    Connection conn = null;
    private boolean updateInsert = false;
    private List<Producto> listProductoAux = null;
    private Producto producto;

    @Override
    public boolean insert(Producto entidad) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "INSERT INTO productos (idAdmin,nombre,tipo,descripcion,precio,stock) VALUES ('" + entidad.getIdAdmin() + "','" + entidad.getNombre() + "','" + entidad.getTipo() + "','" + entidad.getDescripcion() + "','" + entidad.getPrecio() + "','" + entidad.getStock() + "');";
            ps = conn.prepareStatement(query);
            resu = ps.executeUpdate();
            if (resu > 0) {
                this.updateInsert = true;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.updateInsert;
    }

    @Override
    public boolean update(Producto entidad) {
        PreparedStatement ps;
        int resu;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("UPDATE productos ")
                    .append("SET idAdmin = ? ,")
                    .append("nombre = ? ,")
                    .append("tipo = ? ,")
                    .append("descripcion = ? ,")
                    .append("precio = ? ,")
                    .append("stock = ? ")
                    .append("WHERE idProducto = ? ;");
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, entidad.getIdAdmin());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getTipo());
            ps.setString(4, entidad.getDescripcion());
            ps.setDouble(5, entidad.getPrecio());
            ps.setString(6, entidad.getStock());
            ps.setInt(7, entidad.getIdProducto());
            resu = ps.executeUpdate();
            if (resu > 0) {
                this.updateInsert = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.updateInsert;
    }

    @Override
    public Producto getEntity(Object pk) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idProducto,")
                    .append("idAdmin,")
                    .append("nombre,")
                    .append("tipo,")
                    .append("descripcion,")
                    .append("precio,")
                    .append("stock ")
                    .append("FROM productos ")
                    .append("WHERE nombre = '").append(pk).append("'; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.producto = new Producto();
                this.producto.setIdProducto(rs.getInt("idPelicula"));
                this.producto.setIdAdmin(rs.getInt("idAdmin"));
                this.producto.setNombre(rs.getString("nombre"));
                this.producto.setTipo(rs.getString("tipo"));
                this.producto.setDescripcion(rs.getString("descripcion"));
                this.producto.setPrecio(rs.getDouble("precio"));
                this.producto.setStock(rs.getString("precio"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.producto;
    }
    
    // Select a detalle_product
    
    @Override
    public List<Producto> getListOfEntities() {
        PreparedStatement ps;
        ResultSet rs;       
        try {
            conn = Utiles.getConection();
            String query = "SELECT * FROM detalle_product WHERE Estado = 'disponible';";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);         
            if (rs.next()) {
                this.listProductoAux = new ArrayList<>();
                do {
                    Producto productoAux = new Producto();
                    productoAux.setIdProducto(rs.getInt("idDetalleProd"));      //idDetalleProd              
                    productoAux.setDescripcion(rs.getString("codigo"));         //codigo 
                    productoAux.setNombre(rs.getString("nombre"));              //nombre
                    productoAux.setPrecio(rs.getDouble("precio"));              //precio
                    productoAux.setIdAdmin(rs.getInt("cantidad"));              //cantidad
                    productoAux.setTipo(rs.getString("precioTotal"));           //precioTotal
                    productoAux.setStock(rs.getString("Estado"));                //Estado
                    this.listProductoAux.add(productoAux);
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listProductoAux;
    }

    // UPDATE a detalle_producto
    @Override
    public boolean insert01(Producto entidad) {
        PreparedStatement ps;
        int resu;
        String query;
        try {
            conn = Utiles.getConection();
            query = "UPDATE detalle_producto SET idEstado = 3 WHERE idDetalleProd = "+entidad.getIdProducto()+";";            
            ps = conn.prepareStatement(query);          
            resu = ps.executeUpdate();
            if (resu > 0) {
                this.updateInsert = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.updateInsert;
    }
    
    //SELECT a detalle_product por Codigo
    @Override
    public List<Producto> getListOfEntities01(Object[] valores) {
       PreparedStatement ps;
        ResultSet rs;       
        try {
            Connection conn = Utiles.getConection();
            String query = "SELECT * FROM detalle_product WHERE codigo = '"+valores[0]+"';";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);         
            if (rs.next()) {
                this.listProductoAux = new ArrayList<>();
                do {
                    Producto productoAux = new Producto();
                    productoAux.setIdProducto(rs.getInt("idDetalleProd"));      //idDetalleProd              
                    productoAux.setDescripcion(rs.getString("codigo"));         //codigo 
                    productoAux.setNombre(rs.getString("nombre"));              //nombre
                    productoAux.setPrecio(rs.getDouble("precio"));              //precio
                    productoAux.setIdAdmin(rs.getInt("cantidad"));              //cantidad
                    productoAux.setTipo(rs.getString("precioTotal"));           //precioTotal
                    productoAux.setStock(rs.getString("Estado"));                //Estado
                    this.listProductoAux.add(productoAux);
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listProductoAux;
    }
    

    
    
}
