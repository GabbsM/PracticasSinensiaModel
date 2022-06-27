package com.sinensia.practicaModel.canciones;
import java.io.Serializable;
import java.util.Objects;

public class Cancion implements Serializable {

    private String genero;
    private String interprete;
    private String compositor;

    public Cancion(){


    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }


    @Override
    public int hashCode() {
        return Objects.hash(genero, interprete, compositor);
    }

    @Override
    public String toString() {
        return  "Genero: " + genero + "\n" +
                "Interprete: " + interprete +  "\n" +
                "Compositor: " + compositor;
    }
}
