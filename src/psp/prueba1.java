package psp;

import java.util.Scanner;

/*Vas a calcular del 1 al 100 un nmero y vas a tener que adivinar que numero ha salido si esta arriba te lo indica 
 * 
 * y si esta abajo te lo indica tambien diciendo cuantos intentos ha necesitado */

public class prueba1 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		 int a = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
		 int b; // Número introducido por el usuario.
		 int i; // Contador para bucle for.

		 System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");

		 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
		 b = sc.nextInt();
		 
		
		 for (i=0; i<=4; i++) { 

		    // Primero se evalúa si se ha acertado.
		    
		    if (a == b) {  
		      System.out.println(" LO HAS ADIVINIADO "); 
		      break; } 
		    
		    // Luego da la partida por perdida si ya has gastado 5 intentos.     
		    
		    else if (i == 4) { 
		      System.out.println("Lo siento: HAS PERDIDO " + a); 
		      break; } 
		    
		   
		    
		    else if (a > b) 
		      System.out.println("El número secreto es MAYOR que " + b);
		    else if (a < b)
		      System.out.println("El número secreto es MENOR que " + b);

		    // Bucle para avisar y hacer de contador
		    
		    if (i <=1) { 
		     System.out.print("Otro intento: "); 
		     b = sc.nextInt(); 
		     					} 
		    else if (i ==2) { 
		    int x = (int) (a/10);
		    System.out.println("La primera cifra es " + x);
		    System.out.print("Metele otro try a ver: ");
		    b = sc.nextInt(); 
		    
		    					} 
		   else if (i >= 3) {
		   System.out.print("Este es tu ultimo intento: ");
		   b = sc.nextInt(); 
		   					}
		    }
		 
		 sc.close();
	
	}
}
