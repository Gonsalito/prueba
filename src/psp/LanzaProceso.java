package psp;

//Una clase que se llame lanzador, y lanzar procesos usando este programa lanzandolo 2 veces y que lo lance para 1,51 y 51,100.

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LanzaProceso {
	
	 public static void main(String[] args){
	        LanzaProceso l=new LanzaProceso();
	        
	        l.lanSum(1, 51, "1proceso.txt");
	        l.lanSum(51, 100, "2proceso.txt");
	        
	        System.out.println("Se han realizado las operaciones");
	    }

	public void lanSum(Integer n1, Integer n2, String result){
        String clase = "psp.SumatorioProfe";
       
        try {
        	
        	ProcessBuilder pb;
            pb = new ProcessBuilder( "java",clase,n1.toString(),n2.toString());
            pb.directory(new File("bin\\"));
            
            pb.redirectOutput(new File(result));
            
            pb.redirectError(new File("exceptions.txt"));//Lo uso para saber que error me da ya que no sale en un print
            
            pb.start();
            
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
   
	/*Crear un programa que permita parametrizar el lanzamiento de sumadores, que vuelque el contenido de las sumas en 
	ficheros y que permita el programa principal recuperar las sumas de los ficheros parciales.
	Para ello se eestableceran como argumentos dos numeros enteros divisibles y se dividira la serie de numeros en 4 sumas parciales(procesos)
	*/
	
	
	
/*	
	public static void main (String[]Args){
		
		try {
		
		File ruta = new File("C:\\Users\\jony_\\eclipse-workspace\\PSP\\bin");
		
		//File ruta = new File(".\\bin");
		
		ProcessBuilder pb = new ProcessBuilder("java","psp.SumatorioProfe");
		pb.directory(ruta);
		
		
		Process p =pb.start();
		
		
		//Capturamos el mensaje que recibe
		InputStream is = p.getInputStream();
		
		int c;
		while((c=is.read())!= -1) {
			
			System.out.println((char) c);
		}
		
		is.close();
		
		
		System.out.println("Se ha ejecutado " + p.waitFor());
		
		}catch(Exception e) {
			
			System.out.println("Error no se encuentra el fichero" + e);
		}
		
	}
	
	*/

}
