package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rosario.clasesProyecto.paneles.tikets;

public class datosPago extends JFrame {
    public JPanel panel;
    public datosPago(){
        setSize(500,550);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_linea de pago");// nombre de la ventana
        setDefaultCloseOperation(HIDE_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }
    private void componentes() {
        paneles();
        indicaciones();
        pedirDatos();
        boton();
    }
    private void paneles(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
    private void pedirDatos(){
        JTextArea texto = new JTextArea();
        texto.setBounds(10,40,400,30);
        panel.add(texto);

        JTextArea texto2 = new JTextArea();
        texto2.setBounds(10,110,180,30);
        panel.add(texto2);

        JTextArea texto3 = new JTextArea();
        texto3.setBounds(210,110,180,30);
        panel.add(texto3);

        JTextArea texto6 = new JTextArea();
        texto6.setBounds(10,180,220,30);
        panel.add(texto6);

        JTextArea texto7 = new JTextArea();
        texto7.setBounds(260,180,160,30);
        panel.add(texto7);

        JTextArea texto4 = new JTextArea();
        texto4.setBounds(10,250,400,30);
        panel.add(texto4);

        JTextArea texto5 = new JTextArea();
        texto5.setBounds(10,320,160,30);
        panel.add(texto5);
    }
    private void indicaciones(){
        JLabel texto= new JLabel();
        texto.setText("Ingrese su nombre ");
        texto.setBounds(10,0,400,40);
        texto.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto);

        JLabel texto2= new JLabel();
        texto2.setText("Apellido paterno");
        texto2.setBounds(10,70,190,40);
        texto2.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto2);

        JLabel texto3= new JLabel();
        texto3.setText("Apellido materno");
        texto3.setBounds(210,70,190,40);
        texto3.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto3);

        JLabel texto4= new JLabel();
        texto4.setText("Ingrese su direccion ");
        texto4.setBounds(10,140,220,40);
        texto4.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto4);

        JLabel texto5= new JLabel();
        texto5.setText("codigo postal ");
        texto5.setBounds(260,140,160,40);
        texto5.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto5);

        JLabel texto6= new JLabel();
        texto6.setText("Numero de tarjeta (16 digitos)");
        texto6.setBounds(10,210,400,40);
        texto6.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto6);

        JLabel texto7= new JLabel();
        texto7.setText("Codigo (3 digitos) ");
        texto7.setBounds(10,280,400,40);
        texto7.setFont(new Font("arial",Font.BOLD,20));
        panel.add(texto7);

    }
    private void boton(){
        JButton pago= new JButton();
        pago.setLocation(150,400);
        pago.setSize(200,50);
        pago.setFont(new Font("arial",Font.BOLD,20));
        pago.setText("Hacer pago");
        pago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiket();
            }
        });
        panel.add(pago);
    }
    public void tiket(){
        tikets ti= new tikets();
        ti.setVisible(true);
    }
}
