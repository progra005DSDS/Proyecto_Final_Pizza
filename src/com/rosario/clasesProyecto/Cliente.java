package com.rosario.clasesProyecto;

public class Cliente extends Persona{
    //Declaracion de Variables

    String direccion;

//Constructores

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String telefono, String direccion) {
        super(id, nombre, apellido, telefono);
        this.direccion = direccion;
        //se puede pero no es necesario
    }

    //Set y Get


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static 

}
