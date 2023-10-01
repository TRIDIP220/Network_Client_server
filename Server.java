import java.io.*;
import java.net.*;

public class Server{

public static void main(String[] args){



try{

byte data[] = new byte[49907];

DatagramSocket socket = new DatagramSocket(3490);
DatagramPacket packet = new DatagramPacket(data,data.length);

while(true){


try{

socket.receive(packet);
String str = new String(packet.getData() , 0 , packet.getLength());

System.out.println(str);


}//try2
catch(IOException ex){

System.out.println(ex);

}

}// while


}// try 1

catch(IOException ex){

System.out.println(ex);

}// catch1
}// main
}// class