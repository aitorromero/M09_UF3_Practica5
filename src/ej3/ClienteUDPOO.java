package ej3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClienteUDPOO {

    private static final String[] vector = {"Enviat", "un", "vector", "de", "cinco"};
    private static VectorString v = new VectorString(vector);
    

    public static VectorString enviarObjecte(Object o) throws IOException, ClassNotFoundException{
        return (VectorString) new ObjectOutputStream(new ByteArrayOutputStream());
    }
    
    public static void main(String[] args) {
        
        try{
            DatagramPacket = new DatagramPacket();
        }
    }

}
