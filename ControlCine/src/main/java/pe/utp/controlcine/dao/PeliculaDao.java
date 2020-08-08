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
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Pelicula;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class PeliculaDao implements Dao<Pelicula> {

    Connection conn = null;
    private boolean updateInsert = false;
    private Pelicula pelicula;
    private List<Pelicula> listPeliculaAux = null;
    
     public Pelicula getEntity(Pelicula entidad) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idPelicula,")
                    .append("idAdmin,")
                    .append("nombre,")
                    .append("director,")
                    .append("titulo,")
                    .append("descripcion,")
                    .append("duracion ")                  
                    .append("FROM pelicula ")
                    .append("WHERE nombre = '")
                    .append(entidad.getNombre())
                    .append("' and director='")
                    .append(entidad.getDirector())
                    .append("'; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {               
                this.pelicula = new Pelicula();
                this.pelicula.setIdPelicula(rs.getInt("idPelicula"));
                this.pelicula.setIdAdmin(rs.getInt("idAdmin"));
                this.pelicula.setNombre(rs.getString("nombre"));
                this.pelicula.setDirector(rs.getString("director"));
                this.pelicula.setTitulo(rs.getString("titulo"));
                this.pelicula.setDescripcion(rs.getString("descripcion"));                
                this.pelicula.setDuracion(rs.getTime("duracion").toLocalTime());    
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.pelicula;   

    }   
    @Override
    public boolean insert(Pelicula entidad) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "INSERT INTO pelicula (idAdmin,nombre,director,titulo,descripcion,duracion) VALUES ('" + entidad.getIdAdmin() + "','" + entidad.getNombre() + "','" + entidad.getDirector() + "','" + entidad.getTitulo() + "','" + entidad.getDescripcion() + "','" + entidad.getDuracion() + "');";
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
    public boolean update(Pelicula entidad) {
        PreparedStatement ps;
        int resu;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("UPDATE pelicula ")
                    .append("SET idAdmin = ? ,")
                    .append("nombre = ? ,")
                    .append("director = ? ,")
                    .append("titulo = ? ,")
                    .append("descripcion = ? ,")
                    .append("duracion = ? ")
                    .append("WHERE idPelicula = ? ;");
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, entidad.getIdAdmin());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getDirector());
            ps.setString(4, entidad.getTitulo());
            ps.setString(5, entidad.getDescripcion());
            ps.setTime(6, Time.valueOf(entidad.getDuracion()));
            ps.setInt(7, entidad.getIdPelicula());
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
    public Pelicula getEntity(Object pk) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idPelicula,")
                    .append("idAdmin,")
                    .append("nombre,")
                    .append("director,")
                    .append("titulo,")
                    .append("descripcion,")
                    .append("duracion ")                  
                    .append("FROM pelicula ")
                    .append("WHERE idPelicula = '")
                    .append(pk)
                    .append("'; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {               
                this.pelicula = new Pelicula();
                this.pelicula.setIdPelicula(rs.getInt("idPelicula"));
                this.pelicula.setIdAdmin(rs.getInt("idAdmin"));
                this.pelicula.setNombre(rs.getString("nombre"));
                this.pelicula.setDirector(rs.getString("director"));
                this.pelicula.setTitulo(rs.getString("titulo"));
                this.pelicula.setDescripcion(rs.getString("descripcion"));                
                this.pelicula.setDuracion(rs.getTime("duracion").toLocalTime());                                                                
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.pelicula;   

    }   
   
    @Override
    public List<Pelicula> getListOfEntities() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            conn = Utiles.getConection();
            String query = "SELECT * FROM pelicula;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            if (rs.next()) {
                this.listPeliculaAux = new ArrayList<>();
                do {
                    Pelicula peliculaAux = new Pelicula();
                    peliculaAux.setIdPelicula(rs.getInt("idPelicula"));
                    peliculaAux.setIdAdmin(rs.getInt("idAdmin"));
                    peliculaAux.setNombre(rs.getString("nombre"));
                    peliculaAux.setDirector(rs.getString("director"));
                    peliculaAux.setTitulo(rs.getString("titulo"));
                    peliculaAux.setDescripcion(rs.getString("descripcion"));
                    peliculaAux.setDuracion(rs.getTime("duracion").toLocalTime());
                    this.listPeliculaAux.add(peliculaAux);
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.listPeliculaAux;
    }
    @Override
    public boolean delete(Object pk) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "DELETE FROM pelicula WHERE idPelicula = " + pk + ";";
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
