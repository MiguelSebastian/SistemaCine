package pe.utp.controlcine.entity;

/**
 *
 * @author Miguel
 */
public class Orden {
    private int idReservacion;
    private String codigoOrden;
    private String pelicula;
    private String cine;
    private String sala;
    private String lugar;
    private String rangoHorario;
    private String fecha;    

    public Orden() {
    }

    public Orden(int idReservacion, String codigoOrden, String pelicula, String cine, String sala, String lugar, String rangoHorario, String fecha) {
        this.idReservacion = idReservacion;
        this.codigoOrden = codigoOrden;
        this.pelicula = pelicula;
        this.cine = cine;
        this.sala = sala;
        this.lugar = lugar;
        this.rangoHorario = rangoHorario;
        this.fecha = fecha;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(String codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRangoHorario() {
        return rangoHorario;
    }

    public void setRangoHorario(String rangoHorario) {
        this.rangoHorario = rangoHorario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
