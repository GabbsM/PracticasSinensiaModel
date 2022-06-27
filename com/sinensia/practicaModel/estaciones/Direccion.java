package com.sinensia.practicaModel.estaciones;

import java.io.Serializable;

public class Direccion implements Serializable {

    private String direccion;
    private String poblacion;
    private int codigoPostal;
    private String provincia;
    private String pais;

    public Direccion() {


    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return "Direccion: " + direccion + "\n" +
                "Poblacion: " + poblacion + "\n" +
                "Codigo Postal: " + codigoPostal + "\n" +
                "Provicia: " + provincia + "\n" +
                "Pais: " + pais;
    }
}
