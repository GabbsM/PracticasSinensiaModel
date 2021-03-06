package com.sinensia.practicaModel.estaciones;

import java.sql.Timestamp;
import java.util.Date;

public class Lectura {

    private double temperatura;
    private double presionAtmosferica;
    private double velocidadViento;
    private Date fechaHora;

    public Lectura() {

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPresionAtmosferica() {
        return presionAtmosferica;
    }

    public void setPresionAtmosferica(double presionAtmosferica) {
        this.presionAtmosferica = presionAtmosferica;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        velocidadViento = velocidadViento;
    }

    public Date getFeAchaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Temperatura: " + temperatura + "\n" +
                "Presion atmosferica: " + presionAtmosferica + "\n" +
                "Velocidad del viento: " + velocidadViento + "\n" +
                "Fecha y hora: " + fechaHora;
    }
}
