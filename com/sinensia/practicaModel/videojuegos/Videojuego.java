package com.sinensia.practicaModel.videojuegos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Videojuego implements Serializable {

    private int codigo;
    private String titulo;
    private Date fechaLanzamiento;
    private String fabricante;
    private double precio;

    public Videojuego() {


    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {

        return "Codigo: " + codigo + "\n" +
                "Titulo: " + titulo + "\n" +
                "Fecha de lanzamiento: " + fechaLanzamiento + "\n" +
                "Fabricante: " + fabricante + "\n" +
                "Precio: " + precio;

    }
}
