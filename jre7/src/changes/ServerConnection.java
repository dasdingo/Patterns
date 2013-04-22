package changes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerConnection implements Runnable{
Socket client;
int clientId;
	ServerConnection(Socket client,int ClientId){
this.client = client;
this.clientId = ClientId;
 }

@Override
public void run() {
	try{
		 while(true){
				InputStream in = client.getInputStream();
				OutputStream out = client.getOutputStream();
				DataInputStream dataIn = new DataInputStream(in);
				DataOutputStream dataOut = new DataOutputStream(out);
				String antwort = dataIn.readUTF();
				System.out.println(antwort);
				dataOut.writeUTF("test"+ clientId);
		 }
	}
	catch(Exception e){
		System.out.println("___");
	}
	
}
}
