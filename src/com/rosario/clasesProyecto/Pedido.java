package com.rosario.clasesProyecto;

public class Pedido {
    //Declaracion de Variables
    int idPedido;
    String fhPedido;
    //cliente
    Cliente cliente;
    // pizza arreglo
    Pizza [] pizzas;

    //  Constructores

    public Pedido() {
        pizzas = new Pizza[10];
    }

    public Pedido(int idPedido, String fhPedido) {
        this.idPedido = idPedido;
        this.fhPedido = fhPedido;
    }
    //Set y Get


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFhPedido() {
        return fhPedido;
    }

    public void setFhPedido(String fhPedido) {
        this.fhPedido = fhPedido;
    }
    //to String

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", fhPedido='" + fhPedido + '\'' +
                '}';
    }
}
