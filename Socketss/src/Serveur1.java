import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur1 {
	public static void main(String[] arg) throws IOException {
		ServerSocket ss = new ServerSocket(1234);
		Socket sock = ss.accept();
		System.out.println("la connection est etablie");
		InputStream is = sock.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("attente d'une chaine de caractéres");
		String s = br.readLine();
		System.out.println("la chaine de caractére recu est:");
		System.out.println(s);
		ss.close();
	}

}
