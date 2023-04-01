package com.rosario.clasesProyecto;

public class Administrador extends Persona{
    //DECLARACION DE VARIABLES

    String usuario;
    String contrasenia;


//CONSTRUCTORES

    public Administrador() {
    }

    public Administrador(int id, String nombre, String apellido,
                         String telefono, String usuario,
                         String contrasenia) {
        super(id, nombre, apellido, telefono);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

}
//Set y Get

    public String getContrasenia() {
        return contrasenia;
    }

    public String getFhRegistro() {
        return fhRegistro;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setFhRegistro(String fhRegistro) {
        this.fhRegistro = fhRegistro;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "contrasenia='" + contrasenia + '\'' +
                ", fhRegistro='" + fhRegistro + '\'' +
                '}';
    }
}
