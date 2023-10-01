import java.io.*;
import java.net.*;

public class Client{

public static void main(String[] args){

byte data[];

String str;

DatagramPacket packet;

try{

InetAddress add =  InetAddress.getLocalHost();

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

DatagramSocket socket = new DatagramSocket();

while(true){


str = br.readLine();

if(str.equals("stop")){
break;

}//if


data = str.getBytes();

packet = new DatagramPacket(data,data.length,add,3490);

socket.send(packet);


}//while
}//try

catch(IOException ex){

System.out.println(ex);


}
}

}//Client