package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;

public class Ventana3 extends JFrame {
    public JPanel panel;
    public Ventana3(){//PANEL DEL ADMIN

        setSize(1300, 700);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_Administrador");// nombre de la ventana
        //setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();
    }

    private void componentes() {
        paneles();


    }
    private void paneles(){
        panel= new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
}
