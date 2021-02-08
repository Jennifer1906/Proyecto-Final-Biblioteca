/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author quizh
 */
public class Tesis {
    private String carrera_tes;
    private String director_tes;

    public Tesis() {
    }

    public Tesis(String carrera_tes, String director_tes) {
        this.carrera_tes = carrera_tes;
        this.director_tes = director_tes;
    }

    public String getCarrera_tes() {
        return carrera_tes;
    }

    public void setCarrera_tes(String carrera_tes) {
        this.carrera_tes = carrera_tes;
    }

    public String getDirector_tes() {
        return director_tes;
    }

    public void setDirector_tes(String director_tes) {
        this.director_tes = director_tes;
    }
}
