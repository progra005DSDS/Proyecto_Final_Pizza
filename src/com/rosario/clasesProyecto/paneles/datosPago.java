package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rosario.clasesProyecto.paneles.tikets;

public class datosPago extends JFrame {
    public JPanel panel;

    JTextArea texto,texto6,texto7;//datos a obtener

    public datosPago(){
        setSize(500,550);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_linea de pago");// nombre de la ventana
        setDefaultCloseOperation(HIDE_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
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
        //obtener nombre
        texto = new JTextArea();
        texto.setBounds(10,40,400,30);
        panel.add(texto);
        //obtener apellido paterno
        JTextArea texto2 = new JTextArea();
        texto2.setBounds(10,110,180,30);
        panel.add(texto2);
        //obtener apellido materno
        JTextArea texto3 = new JTextArea();
        texto3.setBounds(210,110,180,30);
        panel.add(texto3);
        //obtener direccion
        JTextArea texto4 = new JTextArea();
        texto4.setBounds(10,180,220,30);
        panel.add(texto4);
        //obtener codigo postal
        JTextArea texto5 = new JTextArea();
        texto5.setBounds(260,180,160,30);
        panel.add(texto5);
        //obtener numero de tarjeta
        texto6 = new JTextArea();
        texto6.setBounds(10,250,400,30);
        panel.add(texto6);
        //obtener pin 3 numeros
        texto7 = new JTextArea();
        texto7.setBounds(10,320,160,30);
        panel.add(texto7);
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

        JButton b1= new JButton();
        b1.setText("Regresar inicio");
        b1.setBounds(150,460,200,50);
        b1.setBackground(Color.red);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("arial",Font.BOLD,17));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regreso();
            }
        });
        panel.add(b1);
    }
    public void tiket(){//metodo para mostrar el tiketc
        tikets ti= new tikets();
        ti.obtenerDatos(texto.getText());//enviar el dato que se solicote
        ti.oD(texto6.getText());
        ti.oD2(texto7.getText());
        ti.setVisible(true);
        dispose();
    }
    public void regreso(){
        Ventana ventana= new Ventana();
        ventana.setVisible(true);
        dispose();
    }

    }


