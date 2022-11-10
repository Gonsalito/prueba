package psp;


/*Crear un programa que permita parametrizar el lanzamiento de sumadores, que vuelque el contenido de las sumas en 
ficheros y que permita el programa principal recuperar las sumas de los ficheros parciales.
Para ello se eestableceran como argumentos dos numeros enteros divisibles y se dividira la serie de numeros en 4 sumas parciales(procesos)
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParametrizaLanzam {
	
	private static  final int NUM_PROCESOS=4; //Se divide la serie de numeros en 4 sumas parciales (Procesos)
	
	private static final String PREF_FICH= ("fich");//Hecho para el getResult

    public static void lanzarSumador(Integer n1, Integer n2, String result) throws IOException{
            String clase = "psp.SumatorioProfe"; 
            File directorioSumador;
            directorioSumador=new File("C:\\Users\\jony_\\eclipse-workspace\\PSP\\bin");
            File fichResultado=new File(result);
            
            ProcessBuilder pb;
            pb=new ProcessBuilder("java" , clase , String.valueOf(n1) , String.valueOf(n2) );
            pb.directory(new File("bin\\"));
            pb.redirectOutput(fichResultado);
            
            pb.start();
    }
    
    
    
    public static int getResultadoFich(String ResultFichero) {
    	
    	int suma=0;
    	try {
    		
    		FileInputStream fichero = new FileInputStream(ResultFichero);
    		InputStreamReader fiche = new InputStreamReader(fichero);
    		
    		BufferedReader br = new BufferedReader(fiche);
    		String linea = br.readLine();
    		suma = new Integer(linea);
    		return suma;
 		
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    	}
    	
    	return suma;
    	
    }
    
    
	    public static int getSumaTotal(int numeroFich) {
	    	
	    	int sumatt=0;
	    	for(int i =1; i<= NUM_PROCESOS; i++ ) {
	    		sumatt+=getResultadoFich(PREF_FICH+String.valueOf(i));	
	    	}
	    	return sumatt;
	    	
	    }
    
    
	    public static void main (String []Args) throws IOException, InterruptedException {
	    	
	    	int n1 = Integer.parseInt(Args[0]);
	    	int n2 = Integer.parseInt(Args[1]);
	    	int espacio= (n2 / NUM_PROCESOS) -1;
	    	for(int i=1; i<NUM_PROCESOS; i++) {
	    		System.out.println("n1: " + n1);
	    		int SumEspacio= n1+espacio;
	    		System.out.println("n2: " + SumEspacio);
	    		
	    		lanzarSumador(n1, n1+espacio, PREF_FICH+String.valueOf(i)); //Del public que hemos creado con LanzarSumador 
	    		n1= n1+espacio+1;
	    		System.out.println("Probamos a ver si suma: ");
	    		
	    	}
	    	 Thread.sleep(5000);
             int sumatt=getSumaTotal(NUM_PROCESOS);
             System.out.println("La suma total es:"+sumatt);
	    	
	    	
    	
    }
}
