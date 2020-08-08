/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Empleado;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class EmpleadoDao implements Dao<Empleado> {

    Connection conn = null;
    private boolean updateInsert = false;
    private Empleado empleado = null;

    @Override
    public Empleado getEntity(Object pk) {
         PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idEmpleado,")
                    .append("idPersona,")
                    .append("usuario,")
                    .append("contra ")                               
                    .append("FROM empleado ")
                    .append("WHERE idPersona = '").append(pk).append("'; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {               
                this.empleado = new Empleado();
                this.empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                this.empleado.setIdPersona(rs.getInt("idPersona"));
                this.empleado.setUsuario(rs.getString("usuario"));
                this.empleado.setContra(rs.getString("contra"));                                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.empleado;
    }

    @Override
    public Empleado getEntity(Object[] valores) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idEmpleado,")
                    .append("idPersona,")
                    .append("usuario,")
                    .append("contra ")
                    .append("FROM empleado ")
                    .append("WHERE usuario = '").append(valores[0]).append("' and contra='").append(valores[1]).append("';");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.empleado = new Empleado();
                this.empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                this.empleado.setIdPersona(rs.getInt("idPersona"));
                this.empleado.setUsuario(rs.getString("usuario"));
                this.empleado.setContra(rs.getString("contra"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.empleado;
    }
        
    @Override
    public boolean update(Empleado entidad) {
        PreparedStatement ps;
        int resu;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("UPDATE empleado ")
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
    public boolean delete(Object pk) {
       int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "DELETE FROM empleado WHERE idPersona = " + pk + ";";
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
    public boolean insert(Empleado entidad) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "INSERT INTO empleado (idPersona,usuario,contra) VALUES ('" + entidad.getIdPersona()+ "','" + entidad.getUsuario()+ "','" + entidad.getContra()+ "');";
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
