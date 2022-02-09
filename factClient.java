 import java.io.*;
import java.net.*;
class factclient{
    public static void main(String argv[]) throws Exception
    {
        String n;
        DatagramSocket clientSocket = new DatagramSocket();
        byte []send=new byte[102];
        byte []resive=new byte[102];
        BufferedReader inFromUser = new BufferedReader(new                
        InputStreamReader(System.in));
        System.out.println("\nEnter Number : ");
        n=inFromUser.readLine();
        InetAddress ipadd= InetAddress.getByName("localhost");
        send=n.getBytes();
        DatagramPacketsendPck=new DatagramPacket(send,send.length,ipadd,6870);
        clientSocket.send(sendPck);
        DatagramPacket resPck=new DatagramPacket(resive,resive.length);
        clientSocket.receive(resPck);
        String fact=new String(resPck.getData());
        System.out.println("FROM SERVER: " +n+"! = " +fact);
        clientSocket.close();
    }
}