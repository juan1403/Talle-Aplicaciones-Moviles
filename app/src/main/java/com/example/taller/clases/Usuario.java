package com.example.taller.clases;

public class Usuario {

    private String urlImagen;
    private String nombreUsuario;
    private String nombreCurso;

    public Usuario(String urlImagen, String nombreUsuario, String nombreCurso) {
        this.urlImagen = urlImagen;
        this.nombreUsuario = nombreUsuario;
        this.nombreCurso = nombreCurso;
    }

    // Getters y Setters
    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
