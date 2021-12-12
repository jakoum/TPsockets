import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] arg) throws UnknownHostException, IOException {
		
		
	
		Socket s = new Socket("localhost" ,1234);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();

		System.out.println("attente de connection");
		Scanner scanner= new Scanner(System.in);
		System.out.println("entrer un nombre");
		int nb =scanner.nextInt();
		scanner.close();
		os.write(nb);
		System.out.println("attente de la reponse du serveur");
		int rep = is.read();
		System.out.println("la reponse du serveur est:");
		System.out.println(rep);
		s.close();
		
		
	}

}
