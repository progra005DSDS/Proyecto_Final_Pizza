package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.rosario.clasesProyecto.paneles.vCombo;

public class Ventana2 extends JFrame{//PANEL DEL USUSARIO
    public JPanel panel;
    public Ventana2(){

        setSize(1300,700);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_Usuario");// nombre de la ventana
        //setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }
    private void componentes() {
        paneles();
        botones();
        imagenes();


    }
    private void paneles(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }
    private void imagenes(){

        ImageIcon imagen = new ImageIcon("combos.jpg");//crear la imagen
        JLabel etiqueta2 = new JLabel();//llamar la imagen
        etiqueta2.setSize(950,950);//tamaño de la etiqueta
        etiqueta2.setLocation(100,-150);//lugar de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,500,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta2);// agregar la imagen al panel

        ImageIcon imagen2 = new ImageIcon("recervacion.jpg");//crear la imagen
        JLabel etiqueta3 = new JLabel();//llamar la imagen
        etiqueta3.setSize(950,950);//tamaño de la etiqueta
        etiqueta3.setLocation(500,-150);//lugar de la etiqueta
        etiqueta3.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,500,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta3);// agregar la imagen al panel

        ImageIcon imagen3 = new ImageIcon("pedirPizza.jpg");//crear la imagen
        JLabel etiqueta1 = new JLabel();//llamar la imagen
        etiqueta1.setSize(950,950);//tamaño de la etiqueta
        etiqueta1.setLocation(900,-150);//lugar de la etiqueta
        etiqueta1.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,500,Image.SCALE_SMOOTH)));//escala de imagen
        panel.add(etiqueta1);// agregar la imagen al panel
    }
    private void botones(){
        JButton b1 = new JButton();//creacion de un boton
        b1.setText("Cuenta");//establecer texto en el boton
        b1.setEnabled(true);//activar o desactivar el boton
        b1.setBounds(1050,10,200,40);// posicion y tamaño del boton
        b1.setForeground(Color.WHITE);//cambiar color de letra
        b1.setBackground(Color.red);
        b1.setFont(new Font("arial",Font.BOLD,17));//cambiar el tamaño y estilo de letra
        panel.add(b1);//agregar el boton al panel


        JButton b2= new JButton();
        b2.setText("Pedir combo");
        b2.setBounds(175,600,200,40);
        b2.setBackground(Color.red);//COLOR DE FONDO DE BOTON
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("arial",Font.BOLD,17));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                combos();
            }
        });
        panel.add(b2);

        JButton b3= new JButton();
        b3.setText("Reservar");
        b3.setBounds(550,600,200,40);
        b3.setBackground(Color.red);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("arial",Font.BOLD,17));
        panel.add(b3);

        JButton b4 = new JButton();
        b4.setText("Pedir pizza");
        b4.setBounds(950,600,200,40);
        b4.setBackground(Color.red);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("arial",Font.BOLD,17));
        panel.add(b4);
    }
public void combos(){
        vCombo combos= new vCombo();
        combos.setVisible(true);
}

}
