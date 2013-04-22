package changes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	try(Socket ClientSocket = new Socket("localhost", 7777)){
		while(true){
		InputStream in = ClientSocket.getInputStream();
		OutputStream out = ClientSocket.getOutputStream();
		DataInputStream dataIn= new DataInputStream(in);
		DataOutputStream dataOut = new DataOutputStream(out);
		String nachricht = scanner.next();
		
		dataOut.writeUTF(nachricht);
		}
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
