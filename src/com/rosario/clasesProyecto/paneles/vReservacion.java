package com.rosario.clasesProyecto.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vReservacion extends JFrame {
    JTextField e1, e2, e3;

    public JPanel panel;

    public vReservacion() {

        setSize(800, 500);// tamaño de la ventana
        setLocationRelativeTo(null);// establecemos la pantalla en el centro
        setTitle("Pizerria el pandita_busca tu lugar");// nombre de la ventana
        setDefaultCloseOperation(HIDE_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cerrrar la ventana y finaliza el programa
        componentes();

    }

    private void componentes() {
        paneles();
        mensajes();
        botones();
        elecciones();

    }

    private void paneles() {
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);// agragamos el panel a la ventana
        panel.setBackground(Color.ORANGE);// cambiar el color del panel
    }

    private void mensajes() {
        JLabel l1 = new JLabel();
        l1.setText("N PERSONAS:");
        l1.setBounds(50, 0, 200, 50);
        l1.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l1);

        JLabel l2 = new JLabel();
        l2.setText("LUGAR:");
        l2.setBounds(300, 0, 200, 50);
        l2.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l2);

        JLabel l3 = new JLabel();
        l3.setText("TRATO");
        l3.setBounds(550, 0, 200, 50);
        l3.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l3);

        JLabel l4 = new JLabel();
        l4.setText("ELEGISTE:");
        l4.setBounds(50, 100, 200, 50);
        l4.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l4);

        JLabel l5 = new JLabel();
        l5.setText("ELEGISTE");
        l5.setBounds(300, 100, 200, 50);
        l5.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l5);

        JLabel l6 = new JLabel();
        l6.setText("ELEGISTE");
        l6.setBounds(550, 100, 200, 50);
        l6.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l6);

        JLabel l7 = new JLabel();
        l7.setText("PASO 1");
        l7.setBounds(50, 200, 200, 50);
        l7.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l7);

        JLabel l8 = new JLabel();
        l8.setText("PASO 2");
        l8.setBounds(300, 200, 200, 50);
        l8.setFont(new Font("arial", Font.BOLD, 22));
        panel.add(l8);


    }

    private void elecciones() {
        e1 = new JTextField();
        e1.setBounds(50, 150, 200, 50);
        panel.add(e1);

        e2 = new JTextField();
        e2.setBounds(300, 150, 200, 50);
        panel.add(e2);

        e3 = new JTextField();
        e3.setBounds(550, 150, 200, 50);
        panel.add(e3);

    }

    private void botones() {
        String personas[] = {"==opcion==","2", "3", "4", "5"};
        String lugar[] = {"==opcion==","centrado", "al frente", "al fondo", "al azar"};
        String clase[] = {"==opcion==","premium", "ejecutivo", "normal"};

        JComboBox c1 = new JComboBox(personas);
        c1.setBounds(50, 50, 200, 50);
        panel.add(c1);

        JComboBox c2 = new JComboBox(lugar);
        c2.setBounds(300, 50, 200, 50);
        panel.add(c2);

        JComboBox c3 = new JComboBox(clase);
        c3.setBounds(550, 50, 200, 50);
        panel.add(c3);

        JButton pedido = new JButton();
        pedido.setBounds(50, 250, 200, 50);
        pedido.setText("Hacer pedido");
        pedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indice = c1.getSelectedIndex();
                String elemento = (String) c1.getSelectedItem();
                e1.setText("Personas: " + elemento);

                String elemento2 = (String) c2.getSelectedItem();
                e2.setText("Lugar: " + elemento2);

                String elemento3 = (String) c3.getSelectedItem();
                e3.setText("Trato: " + elemento3);
            }
        });
        panel.add(pedido);

        JButton pagar = new JButton();
        pagar.setText("Pagar");
        pagar.setBounds(300, 250, 200, 50);
        pagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hacePedido();
            }
        });
        panel.add(pagar);


        JButton regreso = new JButton();
        regreso.setText("cancelar");
        regreso.setBounds(550, 250, 200, 50);
        regreso.setBackground(Color.red);
        regreso.setForeground(Color.WHITE);
        regreso.setFont(new Font("arial", Font.BOLD, 17));
        regreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regreso();
            }
        });
        panel.add(regreso);

    }

    public void hacePedido() {
        datosPago pago = new datosPago();
        pago.setVisible(true);
        dispose();
    }

    public void regreso() {
        Ventana2 ventana2 = new Ventana2();
        ventana2.setVisible(true);
        dispose();
    }
}
