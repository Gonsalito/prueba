package psp;

import java.io.IOException;

/*Runtime Con este metodo abrir el notepad*/
public class runtime {
	
	
	public static void main (String []Args) throws InterruptedException {
		
		
		/*
		try {
			String []direct = new String [2];
			
			direct [0] = "notepad.exe";
			direct [1] = "C:\\prueba.txt";
			
			
			 Process proceso  = Runtime.getRuntime().exec(direct, null );
			 
			 proceso.waitFor();
			 
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			
			
			
		}
		*/
		
		try {
			String [] cmd = { "ping" ,"google.com" ,"-t"; //Comando de apagado en linux
			Runtime.getRuntime().exec(cmd); 
		} catch (IOException ioe) {
			System.out.println (ioe);
		}
		
		
	}

}
