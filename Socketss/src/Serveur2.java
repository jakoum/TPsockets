
import java.io.IOException;
import java.io.InputStream;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur2 {
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		ServerSocket ss = new ServerSocket(1234);
		Socket sock = ss.accept();
		System.out.println("la connection est etablie");
		InputStream is = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		Ville v = (Ville) ois.readObject();
		System.out.println("l'objet est recu");
		System.out.println("la ville recu est:");
		System.out.println(v.nom);
		System.out.println("le nombre d'habitants de la ville recu est:");
		System.out.println(v.nbre_hab);
		ss.close();
	}

}
