package modelo;

import vista.Ventana;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Modelo {

    private Ventana vista;

    public Modelo(Ventana vista){
        this.vista = vista;
    }

    public boolean checkPassword(String password) throws NoSuchAlgorithmException {
        if(crearHash(password).equals(crearHash("anitalavalatina"))){
            return true;
        }
        else{
            return false;
        }
    }

    public String crearHash(String textToHash) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] byteOfTextToHash = textToHash.getBytes(StandardCharsets.UTF_8);
        byte[] hashedByteArray = digest.digest(byteOfTextToHash);
        String encoded = Base64.getEncoder().encodeToString(hashedByteArray);
        return encoded;
    }

    public void encriptarArchivo(String archivo){

    }

}
