package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;



public class tikets extends JFrame{


    public JPanel panel;
    public tikets(){
        setSize(500,750);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_linea de pago");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }
    private void componentes() {
        paneles();
        indicaciones();

    }
    private void paneles(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }

    private void indicaciones(){

        JLabel texto= new JLabel();
        texto.setText("PIZZERIA PANDITA");
        texto.setBounds(130,0,400,40);
        texto.setFont(new Font("arial",Font.BOLD,24));
        panel.add(texto);

        JLabel texto2= new JLabel();
        texto2.setText("***Pago exitoso*** ");
        texto2.setBounds(130,70,400,40);
        texto2.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto2);

        JLabel texto3= new JLabel();
        texto3.setText("Monto Total:"+"$"+Math.random()*300);
        texto3.setBounds(130,140,200,40);
        texto3.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto3);

        JLabel texto4= new JLabel();
        texto4.setText("Numero tarjeta");
        texto4.setBounds(130,210,400,40);
        texto4.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto4);

        JLabel texto5= new JLabel();
        texto5.setText("xxxx-xxxx-xxxx-xxxx");
        texto5.setBounds(130,280,400,40);
        texto5.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto5);

        JLabel texto6= new JLabel();
        texto6.setText("Hora "+GregorianCalendar.HOUR + " PM ");
        texto6.setBounds(50,350,200,40);
        texto6.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto6);

        JLabel texto7= new JLabel();
        texto7.setText("Dia "+ GregorianCalendar.DAY_OF_MONTH + " de Mayo");
        texto7.setBounds(260,350,400,40);
        texto7.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto7);

        ImageIcon imagen = new ImageIcon("qr.png");//crear la imagen
        JLabel etiqueta2 = new JLabel();//llamar la imagen
        etiqueta2.setSize(285,285);//tamaño de la etiqueta
        etiqueta2.setLocation(150,420);//lugar de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta2);


    }
}
