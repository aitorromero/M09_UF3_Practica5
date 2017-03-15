package m09_uf3_activitat5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class UDPClient {

    public static void main(String[] args) throws IOException {
        String msg = JOptionPane.showInputDialog(null, "Passa", ":D", 1);
        byte[] buff = msg.getBytes();
        DatagramSocket socketUDP;
        
        try{ 
            socketUDP = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packetUDP = new DatagramPacket(buff, buff.length, address, 1677);
            
            socketUDP.send(packetUDP);
            String msgR = new String(packetUDP.getData(), "UTF-8").toUpperCase();
            JOptionPane.showMessageDialog(null, msgR, ":D", 1);
            
            
            packetUDP = new DatagramPacket(buff,buff.length);
            socketUDP.receive(packetUDP);
        }catch(SocketException se){
            System.out.println(se.getCause());
        }catch(UnknownHostException ue){
            System.out.println(ue.getCause());
        }
    }

}
/*
Server socket
Client Socket
SSL client factory
SSL server factory
SSL socket factory
DatagramPacket
DatagramSocket
*/