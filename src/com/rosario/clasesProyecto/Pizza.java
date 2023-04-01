package com.rosario.clasesProyecto;

    public class Pizza {
        int id;
        String nombre;
        String tamano;
        Float precio;

        public Pizza(){

        }

        public Pizza(int id, String nombre, String tamano, Float precio) {
            this.id = id;
            this.nombre = nombre;
            this.tamano = tamano;
            this.precio = precio;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTamano() {
            return tamano;
        }

        public void setTamano(String tamano) {
            this.tamano = tamano;
        }

        public Float getPrecio() {
            return precio;
        }

        public void setPrecio(Float precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", tamano='" + tamano + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }

