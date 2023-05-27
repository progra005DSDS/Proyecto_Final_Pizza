package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;



public class tikets extends JFrame {

    private String dato,d2,d3,d4;//datos

    JLabel texto,texto5,texto6;//declarar todo como atributo

    public JPanel panel;

    public tikets() {
        setSize(500, 750);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_linea de pago");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }

    private void componentes() {
        paneles();
        indicaciones();
        boton();

    }

    private void paneles() {
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }

    private void indicaciones() {

        JLabel t = new JLabel();
        t.setText("USUARIO: ");
        t.setBounds(20, 0, 120, 40);
        t.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(t);

//recolleccion del texto del formulario
        texto = new JLabel();
        texto.setBounds(130, 0, 400, 40);
        texto.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto);

        JLabel texto2 = new JLabel();
        texto2.setText("***Pago exitoso*** ");
        texto2.setBounds(130, 70, 400, 40);
        texto2.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto2);

        JLabel texto3 = new JLabel();
        texto3.setText("Monto Total:" + "$" + Math.random() * 300);
        texto3.setBounds(130, 140, 200, 40);
        texto3.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto3);

        JLabel texto4 = new JLabel();
        texto4.setText("Numero tarjeta: ");
        texto4.setBounds(0, 210, 200, 40);
        texto4.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto4);

        //recoleccion de datos

        texto5 = new JLabel();
        texto5.setBounds(210, 210, 400, 40);
        texto5.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto5);

        JLabel texto10 = new JLabel();
        texto10.setText("Numero clave");
        texto10.setBounds(0, 280, 200, 40);
        texto10.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto10);

        //recollecion de datos
        texto6 = new JLabel();
        texto6.setBounds(210, 280, 200, 40);
        texto6.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto6);

        JLabel texto8 = new JLabel();
        texto8.setText("Hora " + GregorianCalendar.HOUR + " PM ");
        texto8.setBounds(50, 350, 200, 40);
        texto8.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto8);

        JLabel texto7 = new JLabel();
        texto7.setText("Dia " + GregorianCalendar.DAY_OF_MONTH + " de Mayo");
        texto7.setBounds(260, 350, 400, 40);
        texto7.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(texto7);

        ImageIcon imagen = new ImageIcon("qr.png");//crear la imagen
        JLabel etiqueta2 = new JLabel();//llamar la imagen
        etiqueta2.setSize(285, 285);//tamaño de la etiqueta
        etiqueta2.setLocation(150, 420);//lugar de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta2);


    }
    public void boton(){
        JButton regreso= new JButton();
        regreso.setText("Inicio");
        regreso.setBounds(400,0,100,40);
        regreso.setBackground(Color.red);
        regreso.setForeground(Color.WHITE);
        regreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresoI();
            }
        });
        panel.add(regreso);

    }

    public void obtenerDatos(String dato) {//metodo para traer la informacion
        this.dato = dato;//declarar un dato
        texto.setText(dato);//mandar a traer el dato
    }
    public void oD(String d2){//establecer numero de tarjeta
        this.d2=d2;
        texto5.setText(d2);
    }
    public void oD2(String d3){
        this.d3=d3;
        texto6.setText(d3);
    }
    public void regresoI(){
        Ventana ventana= new Ventana();
        ventana.setVisible(true);
        dispose();
    }
}
