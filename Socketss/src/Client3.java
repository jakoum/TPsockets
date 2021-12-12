import java.io.IOException;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client3 {
	public static void main(String[] arg) throws UnknownHostException, IOException {
		Socket s = new Socket("Localhost" , 234);
		

		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true); 
		System.out.println("attente de connection");
		
		
		pw.println("Chaîne de caractére envoyer par le client ") ;
		System.out.println("la cdc est envoyer");

		
		s.close();
	}
}
