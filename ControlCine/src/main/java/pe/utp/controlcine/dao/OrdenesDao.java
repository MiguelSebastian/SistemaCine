package pe.utp.controlcine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Orden;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class OrdenesDao implements Dao<Orden> {

    Connection conn = null;    
//    private Orden orden;
    private boolean updateInsert = false;
    private List<Orden> listOrdenAux = null;

    @Override
    public List<Orden> getListOfEntities() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            conn = Utiles.getConection();
            String query = "SELECT * FROM reservacion_pelicula;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            if (rs.next()) {
                this.listOrdenAux = new ArrayList<>();
                do {
                    Orden ordenAux = new Orden();
                    ordenAux.setIdReservacion(rs.getInt("idReservacion"));
                    ordenAux.setCodigoOrden(rs.getString("codigo"));                    
                    this.listOrdenAux.add(ordenAux);
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrdenesDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.listOrdenAux;
    }

    @Override
    public List<Orden> getListOfEntities01(Object[] valores) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();            
             sql.append("SELECT * FROM ordenes WHERE cine = '").append(valores[0])
                     .append("' and codigo='").append(valores[1]).append("';");                                   
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.listOrdenAux = new ArrayList<>();
                do {
                    Orden ordenAux = new Orden();
                    ordenAux.setIdReservacion(rs.getInt("idReservacion"));
                    ordenAux.setCodigoOrden(rs.getString("codigo"));
                    ordenAux.setPelicula(rs.getString("pelicula"));
                    ordenAux.setCine(rs.getString("cine"));
                    ordenAux.setSala(rs.getString("sala"));
                    ordenAux.setLugar(rs.getString("lugar"));
                    ordenAux.setRangoHorario(rs.getString("rango"));
                    ordenAux.setFecha(rs.getString("fecha"));
                    this.listOrdenAux.add(ordenAux);
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrdenesDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.listOrdenAux;
    }
    
    @Override
    public boolean delete(Object pk) {
       int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "DELETE FROM reservacion_pelicula WHERE idReservacion = "+ pk+";";
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
}
