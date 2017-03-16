package ej3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ServidorUDPOO {
    
    public static VectorString rebreObjecte(byte[] bytes) throws IOException, ClassNotFoundException{
        return (VectorString) new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
    }

    public static void main(String[] args) {
        
    }

}
