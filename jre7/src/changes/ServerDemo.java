package changes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
static int ClientId;
	public static void main(String[] args) {
	while(true){
	try(ServerSocket server = new ServerSocket(7777)){
	Socket client =  server.accept();
	ClientId++;
	Thread serverConnection = new Thread(new ServerConnection(client,ClientId));
	serverConnection.start();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
