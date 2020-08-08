package pe.utp.controlcine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.utp.controlcine.entity.Personal;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class PersonalDao implements Dao<Personal> {

    Connection conn = null;
    private boolean updateInsert = false;
    private Personal personal = null;
    private List<Personal> listPersonalAux = null;

//    @Override
//    public Personal getEntity01(Object[] valores) {
//        PreparedStatement ps;
//        ResultSet rs;
//        StringBuilder sql = new StringBuilder();
//        try {
//            conn = Utiles.getConection();
//            sql.append("SELECT ")
//                    .append("b.idPersona,")
//                    .append("a.idEmpleado,")
//                    .append("b.nombre,")
//                    .append("b.apellido,")
//                    .append("b.dni ")
//                    .append("FROM empleado a ")
//                    .append("inner join persona b on b.idPersona = a.idPersona ")
//                    .append("WHERE usuario = '").append(valores[0]).append("' and contra='").append(valores[1]).append("';");
//            ps = conn.prepareStatement(sql.toString());
//            rs = ps.executeQuery(sql.toString());
//            if (rs.next()) {
//                this.personal = new Personal();
//                this.personal.setIdPersonal(rs.getInt("idPersona"));
//                this.personal.setIdAdmEmp(rs.getInt("idEmpleado"));
//                this.personal.setNombre(rs.getString("nombre"));
//                this.personal.setApellido(rs.getString("apellido"));
//                this.personal.setDni(rs.getString("dni"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return this.personal;
//    }
//
//    @Override
//    public Personal getEntity(Object[] valores) {
//        PreparedStatement ps;
//        ResultSet rs;
//        StringBuilder sql = new StringBuilder();
//        try {
//            conn = Utiles.getConection();
//            sql.append("SELECT ")
//                    .append("b.idPersona,")
//                    .append("a.idAdmin,")
//                    .append("b.nombre,")
//                    .append("b.apellido,")
//                    .append("b.dni ")
//                    .append("FROM administrador a ")
//                    .append("inner join persona b on b.idPersona = a.idPersona ")
//                    .append("WHERE usuario = '").append(valores[0]).append("' and contra='").append(valores[1]).append("';");
//            ps = conn.prepareStatement(sql.toString());
//            rs = ps.executeQuery(sql.toString());
//            if (rs.next()) {
//                this.personal = new Personal();
//                this.personal.setIdPersonal(rs.getInt("idPersona"));
//                this.personal.setIdAdmEmp(rs.getInt("idAdmin"));
//                this.personal.setNombre(rs.getString("nombre"));
//                this.personal.setApellido(rs.getString("apellido"));
//                this.personal.setDni(rs.getString("dni"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return this.personal;
//    }
    @Override
    public Personal getEntity01(Personal entidad) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idPersona,")
                    .append("nombre,")
                    .append("apellido,")
                    .append("dni ")
                    .append("FROM persona ")
                    .append("WHERE nombre = '").append(entidad.getNombre()).append("' and dni='").append(entidad.getDni()).append("';");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.personal = new Personal();
                this.personal.setIdPersonal(rs.getInt("idPersona"));
                this.personal.setNombre(rs.getString("nombre"));
                this.personal.setApellido(rs.getString("apellido"));
                this.personal.setDni(rs.getString("dni"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.personal;
    }

    @Override
    public boolean insert(Personal entidad) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "INSERT INTO persona (nombre,apellido,dni) VALUES ('" + entidad.getNombre() + "','" + entidad.getApellido() + "','" + entidad.getDni() + "');";
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
    public boolean update(Personal entidad) {
        PreparedStatement ps;
        int resu;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("UPDATE persona ")
                    .append("SET nombre = ?,")
                    .append("apellido = ? ,")
                    .append("dni = ? ")
                    .append("WHERE idPersona = ? ;");
            ps = conn.prepareStatement(sql.toString());
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellido());
            ps.setString(3, entidad.getDni());
            ps.setInt(4, entidad.getIdPersonal());
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
                Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.updateInsert;
    }

    @Override
    public Personal getEntity(Object pk) {
        PreparedStatement ps;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        try {
            conn = Utiles.getConection();
            sql.append("SELECT ")
                    .append("idPersona,")
                    .append("nombre,")
                    .append("apellido,")
                    .append("dni ")
                    .append("FROM persona ")
                    .append("WHERE idPersona = '").append(pk).append("'; ");
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery(sql.toString());
            if (rs.next()) {
                this.personal = new Personal();
                this.personal.setIdPersonal(rs.getInt("idPersona"));
                this.personal.setNombre(rs.getString("nombre"));
                this.personal.setApellido(rs.getString("apellido"));
                this.personal.setDni(rs.getString("dni"));
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
        return this.personal;
    }

    @Override
    public List<Personal> getListOfEntities() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            conn = Utiles.getConection();
            String query = "SELECT * FROM persona;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            if (rs.next()) {
                this.listPersonalAux = new ArrayList<>();
                do {
                    Personal personalAux = new Personal();
                    personalAux.setIdPersonal(rs.getInt("idPersona"));
                    personalAux.setIdAdmEmp(rs.getInt("idPersona"));
                    personalAux.setNombre(rs.getString("nombre"));
                    personalAux.setApellido(rs.getString("apellido"));
                    personalAux.setDni(rs.getString("dni"));
                    this.listPersonalAux.add(personalAux);
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
        return this.listPersonalAux;
    }

    @Override
    public boolean delete(Object pk) {
        int resu;
        PreparedStatement ps;
        try {
            conn = Utiles.getConection();
            String query = "DELETE FROM persona WHERE idPersona = " + pk + ";";
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
