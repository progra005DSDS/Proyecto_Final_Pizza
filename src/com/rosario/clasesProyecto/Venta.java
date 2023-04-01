package com.rosario.clasesProyecto;

public class Venta {
    //
    int id;
    String fhVenta;
    //

    public Venta() {
    }

    public Venta(int id, String fhVenta) {
        this.id = id;
        this.fhVenta = fhVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFhVenta() {
        return fhVenta;
    }

    public void setFhVenta(String fhVenta) {
        this.fhVenta = fhVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fhVenta='" + fhVenta + '\'' +
                '}';
    }
}
