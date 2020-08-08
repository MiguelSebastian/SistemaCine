/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Administrador;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class AdministradorDao implements Dao<Administrador> {

    Connection conn = null;
    private boolean updateInsert = false;
    private Administrador administrador = null;
    private List<Administrador> listAdministradorAux = null;

    @Override
    public Administrador getEntity(Object pk) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idAdmin,")
                    .append("idPersona,")
                    .append("usuario,")
                    .append("contra ")
                    .append("FROM administrador ")
                    .append("WHERE idPersona = ").append(pk).append("; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.administrador = new Administrador();
                this.administrador.setIdAdministrador(rs.getInt("idAdmin"));
                this.administrador.setIdPersona(rs.getInt("idPersona"));
                this.administrador.setUsuario(rs.getString("usuario"));
                this.administrador.setContra(rs.getString("contra"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.administrador;
    }

    @Override
    public Administrador getEntity(Object[] valores) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idAdmin,")
                    .append("idPersona,")
                    .append("usuario,")
                    .append("contra ")
                    .append("FROM administrador ")
                    .append("WHERE usuario = '").append(valores[0]).append("' and contra='").append(valores[1]).append("';");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.administrador = new Administrador();
                this.administrador.setIdAdministrador(rs.getInt("idAdmin"));
                this.administrador.setIdPersona(rs.getInt("idPersona"));
                this.administrador.setUsuario(rs.getString("usuario"));
                this.administrador.setContra(rs.getString("contra"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.administrador;
    }

    @Override
    public boolean update(Administrador entidad) {
        PreparedStatement ps;
        int resu;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("UPDATE administrador ")
                    .append("SET usuario = ? ,")
                    .append("contra = ? ")
                    .append("WHERE idPersona = ? ;");
            ps = conn.prepareStatement(sql.toString());
            ps.setString(1, entidad.getUsuario());
            ps.setString(2, entidad.getContra());
            ps.setInt(3, entidad.getIdPersona());
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
                Logger.getLogger(PeliculaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.updateInsert;
    }

    @Override
    public boolean insert(Administrador entidad) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "INSERT INTO administrador (idPersona,usuario,contra) VALUES ('" + entidad.getIdPersona() + "','" + entidad.getUsuario() + "','" + entidad.getContra() + "');";
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
    public List<Administrador> getListOfEntities() {
//        PreparedStatement ps;
//        ResultSet rs;        
//        try {
//            conn = Utiles.getConection();
//            String query = "SELECT * FROM administrador;";
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery(query);
//            if (rs.next()) {
//                this.listAdministradorAux = new ArrayList<>();
//                do {
//                    Administrador administradorAux = new Administrador();
//                    administradorAux.setIdAdministrador(rs.getInt("idPersona"));
//                    administradorAux.setIdPersona(rs.getInt("idAdmin"));
//                    administradorAux.setUsuario(rs.getString("nombre"));
//                    administradorAux.setContra(rs.getString("contra"));
//                    this.listAdministradorAux.add(administradorAux);
//                } while (rs.next());
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
        return this.listAdministradorAux;
    }

    @Override
    public boolean delete(Object pk) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "DELETE FROM administrador WHERE idPersona = " + pk + ";";
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
