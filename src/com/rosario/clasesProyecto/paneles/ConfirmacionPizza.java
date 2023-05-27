package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class ConfirmacionPizza extends JFrame {
    public JPanel panel;

    public ConfirmacionPizza() {

        setSize(800, 400);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_crea tu pizza");// nombre de la ventana
        setDefaultCloseOperation(HIDE_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }

    private void componentes() {
        paneles();
    }

    private void paneles() {
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
}
