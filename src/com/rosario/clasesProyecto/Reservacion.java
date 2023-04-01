package com.rosario.clasesProyecto;

public class Reservacion {
    //Declaracion de variables
    int id;
    String fecha;
    String hora;
    //Constructores

    public Reservacion() {

    }

    public Reservacion(int id, String fecha, String hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
