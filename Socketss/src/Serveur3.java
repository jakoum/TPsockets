import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur3 extends Thread {
	int ncl;
	 public void run() {
		ServerSocket ss;
		try {
			ss = new ServerSocket(234);
			while (true) 
	      {
	        Socket s=ss.accept();
	        System.out.println("connection etablie");
	       
	        ncl++;
	        new echange(s,ncl).start();
	      }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	 class echange extends Thread {
		 private Socket socket;
		 private int numc;
		 public echange(Socket socket,int num) {
			 super();
			 this.socket=socket;
			 this.numc=num;
		 }
		 public void run() {
			 InputStream is;
			try {
				is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				OutputStream os = socket.getOutputStream();
		        PrintWriter pw = new PrintWriter(os, true); 
				System.out.println("connection du clien numero:"+numc);
				pw.println("bienvenue vous etes le client numero"+numc);
				while(true) {
					String s = br.readLine();
					if(s!=null) {
				    System.out.println(s);}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
			 
		 }
		 
	 }
	 public static void main(String args[]) {
		 new Serveur3().start();
	 }
	}

