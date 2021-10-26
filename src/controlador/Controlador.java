package controlador;

import modelo.Modelo;
import vista.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class Controlador implements ActionListener {

    private Ventana vista;
    private Modelo modelo;

    public Controlador(Ventana vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
        this.vista.getVentanaPassword().setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(this.vista.getBotonEncriptar())){
            this.vista.getVentanaPassword().setVisible(true);
        }
        if(e.getSource().equals(this.vista.getVentanaPassword().getBotonContrasenia())){
            try {
                if(this.modelo.checkPassword(this.vista.getVentanaPassword().getJTFContrasenia().getText())==true){
                    this.modelo.encriptarArchivo(this.vista.getJTFArchivo().getText());
                }
                else{
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                }
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        }

    }
}
