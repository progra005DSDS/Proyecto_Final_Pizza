import java.util.Scanner;

import com.rosario.clasesProyecto.Administrador;
import com.rosario.clasesProyecto.Cliente;
import com.rosario.clasesProyecto.Pizza;
import com.rosario.clasesProyecto.Reservacion;
import com.rosario.clasesProyecto.paneles.Ventana;
import com.rosario.clasesProyecto.paneles.datosPago;


public class Main {
    public static void main(String[] args) {

        Ventana v1 = new Ventana();  //llamar a la ventana
        v1.setVisible(true);// hacer visible la ventana

    }


    public static void elecccion() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliga una opcion " +
                "\n 1: Administrador \n 2: Cliente  \n 3: Registrarse");
        int num,vueta;
        num = scanner.nextInt();

        switch (num) {
            case 1:
                ingresarAdministrador();
                System.out.println("Desea hacer algo mas \n 1:si \n 2:no");
                vueta= scanner.nextInt();
                if (vueta==1) {
                    elecccion();
                } else {
                    System.out.println("Fin del programa");
                }
                break;
            case 2:
                elecccionCliente();
                System.out.println("Desea hacer algo mas \n 1:si \n 2:no");
                vueta= scanner.nextInt();
                if (vueta == 1) {
                    elecccion();
                } else {
                    System.out.println("Fin del programa");
                }
                break;
            case 3:
                nuevoCliente();
                System.out.println("Desea hacer algo mas \n 1:si \n 2:no");
                vueta= scanner.nextInt();
                if (vueta == 1) {
                    elecccion();
                } else {
                    System.out.println("Fin del programa");
                }
            default:
                System.out.println("Error vuelva a seleccionar");
        }
    }


    public static void elecccionCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a pizzas leo");
        System.out.println("Por favor eliga una opcion " +
                "\n 1: Pedir pizza " +
                "\n 2: Hacer reservacion");
        int num;
        num = scanner.nextInt();
        switch (num) {
            case 1:
                pedirPizza();
                break;
            case 2:
                Reservacion();
                break;
            default:
                System.out.println("vuelva a seleccionar");

        }
    }


        public static void ingresarAdministrador () {
            Administrador administrador = new Administrador();
            administrador.setId(132);
            administrador.setContrasenia("Admin162");
            administrador.setNombre("Uriel");
            administrador.setApellido("Cano Domingo");
            administrador.setTelefono("2314587605");

            System.out.println("\n El Id del administrador es: " + administrador.getId() +
                    "\n La contraeña es: " + administrador.getContrasenia() +
                    "\n El nombre del Admn es: " + administrador.getNombre() + " " + administrador.getApellido() +
                    "\n El número de teléfono del Admin es: " + administrador.getTelefono() +
                    "\n******************************************************************************");
        }

        public static void nuevoCliente () {
            Cliente cliente = new Cliente();
            cliente.setId(457);
            cliente.setNombre("María del Carmen");
            cliente.setApellido("Villegas Santos");
            cliente.setTelefono("2314568244");
            cliente.setDireccion("Av. 5 de Mayo, No. 45");

            System.out.println("\n El Id del cliente es: " + cliente.getId() +
                    "\n El nomnbre del cliente es: " + cliente.getNombre() + " " + cliente.getApellido() +
                    "\n El número de teléfono del cliente es: " + cliente.getTelefono() +
                    "\n La dirección del cliente es: " + cliente.getDireccion() +
                    "\n*********************************************************************");
        }
        public static void pedirPizza () {
            Pizza pizza = new Pizza();
            pizza.setId(1);
            pizza.setNombre("Peperoni con jamon y doble queso con pepsi");
            pizza.setTamano("Familiar");
            pizza.setPrecio(299.99f);

            System.out.println("\n id de la pizza: " + pizza.getId() +
                    "\n Nombre: " + pizza.getNombre() +
                    "\n El tamaño de la pizza es: " + pizza.getTamano() +
                    "\n El precio de la pizza es: " + pizza.getPrecio() +
                    "\n***************************************************************");
        }

        public static void Reservacion () {
            Reservacion reservacion = new Reservacion();
            reservacion.setId(11);
            reservacion.setFecha("10 de abril del 2023");
            reservacion.setHora("06:00 pm");

            System.out.println("\n El Id de la reservación es: " + reservacion.getId() +
                    "\n La fecha de la reservación es: " + reservacion.getFecha() +
                    "\n La hora de la reservación es: " + reservacion.getHora() +
                    "");
        }
    }
