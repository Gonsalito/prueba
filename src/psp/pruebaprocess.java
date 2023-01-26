package psp;

import java.io.IOException;

public class pruebaprocess {


	public void ejecutar(String ruta){ 
        
		ProcessBuilder pb= new ProcessBuilder(ruta); 
		            try {
		                    pb.start();
		            } catch (Exception e) {
		                    e.printStackTrace();
		            }
		    }    
		    public static void main(String[] args) {
		            
		    String ruta="C:\\Windows\\Notepad.exe";
		    pruebaprocess lp=new pruebaprocess();
		            lp.ejecutar(ruta);
		            System.out.println("Finalizado");
		    }


}
