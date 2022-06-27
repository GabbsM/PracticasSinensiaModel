package com.sinensia.practicaModel.estaciones;

import java.io.Serializable;
import java.util.Objects;

public class Estacion implements Serializable {

    private int codigo;
    private String nombre;
    private Direccion direccion;
    private Enum<Estado> estado;

    public Estacion() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Enum<Estado> getEstado() {
        return estado;
    }

    public void setEstado(Enum<Estado> estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacion estacion = (Estacion) o;
        return codigo == estacion.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Codigo:" + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Direccion: " + direccion + "\n" +
                "Estado: " + estado;

    }
}
