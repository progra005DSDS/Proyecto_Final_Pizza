package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rosario.clasesProyecto.paneles.vOpcion;
import com.rosario.clasesProyecto.paneles.ofertas;

public class Ventana extends JFrame {

    public JPanel panel;
    public Ventana(){
        setSize(1300,700);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }
    private void componentes() {
        paneles();
        etiquetas();
        botones();

    }
    private void paneles(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
    private void  etiquetas(){

        JLabel etiqueta = new JLabel();// creamos una etiqueta de texto

        //etiqueta 1
        etiqueta.setText("PIZZAS EL PANDITA");// ponemos texto
        etiqueta.setBounds(460,20,500,50);// ejes x y , la ancho y el alto
        etiqueta.setForeground(Color.WHITE);//establecer color de letra
        etiqueta.setFont(new Font("arial",Font.BOLD,40));//establecer fuente de texto  tipo,forma,tamaño
        panel.add(etiqueta);// agregamos la etiqueta al panel

        //etiqueta imagen
        ImageIcon imagen = new ImageIcon("marca.jpg");//crear la imagen
        JLabel etiqueta2 = new JLabel();//llamar la imagen
        etiqueta2.setSize(950,950);//tamaño de la etiqueta
        etiqueta2.setLocation(325,-150);//lugar de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(650,500,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta2);// agregar la imagen al panel

    }
    private void botones(){
        JButton b1 = new JButton();//creacion de un boton
        b1.setText("Inicio sesión");//establecer texto en el boton
        b1.setEnabled(true);//activar o desactivar el boton
        b1.setBounds(1050,10,200,40);// posicion y tamaño del boton
        b1.setForeground(Color.WHITE);//cambiar color de letra
        b1.setBackground(Color.red);
        b1.setFont(new Font("arial",Font.BOLD,17));//cambiar el tamaño y estilo de letra
        panel.add(b1);//agregar el boton al panel
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoUsuario();
            }
        });




        JButton b2= new JButton();
        b2.setText("OFERTAS");
        b2.setBounds(175,600,200,40);
        b2.setBackground(Color.red);//COLOR DE FONDO DE BOTON
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("arial",Font.BOLD,17));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ofertas();
            }
        });
        panel.add(b2);

        JButton b3= new JButton();
        b3.setText("Servicios");
        b3.setBounds(550,600,200,40);
        b3.setBackground(Color.red);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("arial",Font.BOLD,17));
        panel.add(b3);

        JButton b4 = new JButton();
        b4.setText("Nosotros");
        b4.setBounds(950,600,200,40);
        b4.setBackground(Color.red);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("arial",Font.BOLD,17));
        panel.add(b4);
    }
    public void tipoUsuario(){
        vOpcion opcion= new vOpcion();
        opcion.setVisible(true);
    }
    public void ofertas(){
        ofertas ofertas= new ofertas();
        ofertas.setVisible(true);
    }
}


