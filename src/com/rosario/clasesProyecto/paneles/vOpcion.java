package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rosario.clasesProyecto.paneles.Ventana2;
import com.rosario.clasesProyecto.paneles.Ventana3;

public class vOpcion extends JFrame {

    public JPanel panel2;

    public vOpcion() {
        setSize(300, 160);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Tipo de usuario");// nombre de la ventana
        //setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();
    }
    private void componentes(){
        paneles();
        botonesO();

    }
    private void paneles() {
        panel2 = new JPanel();// creacion del panel
        panel2.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel2);// agragamos el panel a la ventana
        panel2.setBackground(Color.ORANGE);// cambiar el color del panel
    }

    private void botonesO(){
        JButton b1 = new JButton();
        b1.setText("Administrador");
        b1.setBounds(50,10,200,40);
        panel2.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin();
            }
        });


        JButton b2 = new JButton();
        b2.setText("Usuario");
        b2.setBounds(50,60,200,40);
        panel2.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario();
            }
        });

    }
    public void Usuario(){
        Ventana2 usuario= new Ventana2();
        usuario.setVisible(true);
        dispose();
    }
    public void Admin(){
        Ventana3 admin= new Ventana3();
        admin.setVisible(true);
        dispose();
    }
}
