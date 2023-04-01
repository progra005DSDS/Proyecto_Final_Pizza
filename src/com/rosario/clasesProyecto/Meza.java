package com.rosario.clasesProyecto;

public class Meza {
    //Declaracion de variables
    int idMesa;
    boolean disponibilidad;
    //constructores

    public Meza() {
    }

    public Meza(int idMesa, boolean disponibilidad) {
        this.idMesa = idMesa;
        this.disponibilidad = disponibilidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Meza{" +
                "idMesa=" + idMesa +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}

