
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client2  {
	
	public static void main(String[] arg) throws UnknownHostException, IOException {
		Socket s = new Socket("Localhost" , 1234);
		System.out.println("attente de connection");
		OutputStream os = s.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		Scanner scanner= new Scanner(System.in);
		System.out.println("entrerle nom de la ville");
		String nom=scanner.nextLine();
		System.out.println("entrer le nombre des habitants");
		int hab=scanner.nextInt();
		Ville v = new Ville(nom , hab);
		System.out.println("l'objet est envoyer");
	
		oos.writeObject(v);
		s.close();
	}
}
