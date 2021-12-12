import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;

public class Serveur {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1234);
		Socket s = ss.accept(); 
		
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("attente d'un nombre");
		int nb = is.read();
		System.out.println("le nombre recu est:");
		System.out.println(nb);
		
		
		int rep = nb * 2 ;
		os.write(rep);
		ss.close();
		
	}

}
