package m09_uf3_activitat5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UPDServidor {

    public static void main(String[] args) throws IOException {
        byte[] msg = new byte[1000];
        try{
            DatagramSocket socketUDP = new DatagramSocket(1677);
            DatagramPacket packetUDP = 
                    new DatagramPacket(msg, msg.length);
            
            socketUDP.receive(packetUDP);
            String msgR = new String(packetUDP.getData(), "UTF-8").toUpperCase();
            System.out.println(msgR);
                        
        }catch(SocketException se){
            System.out.println(se.getCause());
        }
    }

}
