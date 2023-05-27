package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vContactos extends JFrame {

    public JPanel panel;

    public vContactos(){
        setSize(1000,700);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }
    private void componentes() {
        paneles();
        titulo();
        informacion();
        boton();

    }
    private void paneles(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
    private void titulo(){
        JLabel titulo= new JLabel();
        titulo.setText("CONTACTANOS PIZZAS EL PANDITA");// ponemos texto
        titulo.setBounds(150,0,800,50);// ejes x y , la ancho y el alto
        titulo.setForeground(Color.black);//establecer color de letra
        titulo.setFont(new Font("arial",Font.BOLD,40));//establecer fuente de texto  tipo,forma,tamaño
        panel.add(titulo);// agregamos la etiqueta al panel
    }
    private void informacion(){
        ImageIcon imagen = new ImageIcon("numeros.jpg");//crear la imagen
        JLabel etiqueta2 = new JLabel();//llamar la imagen
        etiqueta2.setSize(900,900);//tamaño de la etiqueta
        etiqueta2.setLocation(200,-100);//lugar de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta2);// agregar la imagen al panel

    }
    private void boton(){
        JButton b= new JButton();
        b.setText("Regresar");
        b.setBounds(10,600,200,40);
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("arial",Font.BOLD,17));
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regreso();
            }
        });
        panel.add(b);
    }
    public void regreso(){
        Ventana ventana= new Ventana();
        ventana.setVisible(true);
        dispose();
    }
}



