import java.io.IOException;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client1 {
	public static void main(String[] arg) throws UnknownHostException, IOException {
		Socket s = new Socket("Localhost" ,1234);
		

		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true); 
		System.out.println("attente de connection");
		Scanner scanner= new Scanner(System.in);
		System.out.println("entrer une chaine de caractéres");
		String chr=scanner.nextLine();
		pw.println(chr) ;
		System.out.println("la chaine de caractéres est envoyer");

		
		s.close();
	}
}
