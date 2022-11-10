package psp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*El mismo ejercicio pero con processbuilder que runtime que abra notepad y si hay error sacar mensaje de error
 *  y si ha salido bien que salga en consola ejecucion correcta */

public class runtime2 {
	
	
	 

	/*
	public static void main (String []Args) {	
	
	try {
		
		ProcessBuilder pb=new ProcessBuilder("notepad.exe");
	    Process process=pb.start();
	    
	    System.out.println("Ejecución correcta");

	    OutputStream d=process.getOutputStream();

	    Scanner sc=new Scanner(System.in);
	   

	    while(sc.hasNext()){
	            d.write(sc.nextInt());
	    }
		
	    sc.close();
		
	}catch(IOException e) {
		
		System.out.println("Error al abrir el programa" + e);
		
		}
	
	*/
	
	 public static void main(String... arg) throws IOException, InterruptedException {
		    new ProcessBuilder("cmd", "ping ","google.com", "-t").inheritIO().start().waitFor();
	
	
	
	}



}


