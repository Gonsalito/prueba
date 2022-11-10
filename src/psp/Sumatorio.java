package psp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Programa que pide 2 numeros y el programa tiene que sumar todos los numeros dentro de esos dos numeros

public class Sumatorio {
		

		public static void main(String[] args) {
			
			
			
			 Scanner sc = new Scanner(System.in);
			 
		    Integer a ;
		    Integer b;
		    
		    System.out.println("Introduce el primer número:");      
			a = sc.nextInt();
			      
			System.out.println("Introduce el segundo número:");
			b = sc.nextInt();
		    System.out.println("El rango de " + a + " con " + b + " es = " + rangoYsuma(a, b));
		    
		    sc.close();
		}
		 
		public static Integer rangoYsuma(Integer a, Integer b) {
		    List<Integer> l = new ArrayList<>();
		    Integer sum = 0;
		    Integer res = a;
		 
		    if (a > 0 && b > 0) {
		        if (a < b) {
		 
		            l.add(a);
		            while (a < b) {
		 
		                sum = a + 1; // te suma el siguiente numero
		                res += sum; // te suma el numero siguiente y lo que ya tenias
		                            
		                l.add(sum); // mete el valor siguiente en la lista de rangos
		 
		                a++; // incrementado hasta que no pueda mas, salga del while
		                        
		            }
		 
		            System.out.println("El rango de valores es: " + l);
		 
		        } else {
		            System.out.println("a debe ser menor que b");
		        }
		    } else {
		        System.out.println("a y b deben ser números positivos");
		    }
		 
		    return res;
		 
		}
		
	
}
