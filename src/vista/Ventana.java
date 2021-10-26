package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controlador controlador;
    private JButton botonEncriptar = new JButton("Corromper Archivo");
    private JLabel labelArchivo = new JLabel("Archivo:");
    private JTextField JTFArchivo = new JTextField();
    private VentanaPassword ventanaPassword = new VentanaPassword();

    public Ventana(){
        this.setSize(500,200);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.initComponents();
    }

    private void initComponents() {
        this.add(panel);
        this.add(botonEncriptar);
        this.botonEncriptar.setBounds(340,100,150,30);
        this.add(labelArchivo);
        this.setTitle("File Corruptor");
        this.labelArchivo.setBounds(10,100,80,30);
        this.add(JTFArchivo);
        this.JTFArchivo.setBounds(90,100,250,30);

    }

    public void setController(Controlador cont) {
        this.controlador = cont;
        this.botonEncriptar.addActionListener(this.controlador);
    }

    //Getters y Setters


    public JButton getBotonEncriptar() {
        return botonEncriptar;
    }

    public JTextField getJTFArchivo() {
        return JTFArchivo;
    }

    public VentanaPassword getVentanaPassword() {
        return ventanaPassword;
    }
}
