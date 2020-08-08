package pe.utp.controlcine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Cine;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class CineDao implements Dao<Cine> {

    Connection conn = null;
    private boolean updateInsert = false;
    private Cine cine;
    private List<Cine> listCineAux = null;

    @Override
    public boolean insert(Cine entidad) {
        return Dao.super.insert(entidad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cine> getListOfEntities() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            conn = Utiles.getConection();
            String query = "SELECT * FROM cine WHERE idEstado = 1;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            if (rs.next()) {
                this.listCineAux = new ArrayList<>();
                do {
                    Cine personalAux = new Cine();
                    personalAux.setIdCine(rs.getInt("idCine"));
                    personalAux.setUbicacion(rs.getString("ubicacion"));
                    personalAux.setIdEstado(rs.getInt("idEstado"));                   
                    this.listCineAux.add(personalAux);
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.listCineAux;
    }

    @Override
    public boolean update(Cine entidad) {
        return Dao.super.update(entidad); //To change body of generated methods, choose Tools | Templates.
    }

}
