package pe.utp.controlcine.entity;

import java.time.LocalTime;

/**
 *
 * @author Miguel
 */
public class Pelicula {
    private int idPelicula;
    private int idAdmin;
    private String nombre;
    private String director;
    private String titulo;
    private String descripcion;
    private LocalTime duracion;

    public Pelicula(int idPelicula, int idAdmin, String nombre, String director, String titulo, String descripcion, LocalTime duracion) {
        this.idPelicula = idPelicula;
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.director = director;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
    
}
