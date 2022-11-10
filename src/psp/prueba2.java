package psp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Hacer una prueba  de si un correo contiene diferentes caracteres verificar que el correo tenga un arroba 
 * y al menos un punto y si no da esas circunstancias le decimos que no es correcto*/

public class prueba2 {
	
	
	public static void main (String []Args) {
		
		Scanner sc = new Scanner(System.in);
		
		prueba2 p = new prueba2();
		String email;
		int puntostt = 0;
		char temp;
		email = sc.next();
		System.out.println(p.validarCorreo(email));	
		for (int i=0; i < email.length(); i++) {
			temp = email.charAt(i);
			if (temp == '.')
				puntostt++;
		
	}
		
			
		
		System.out.println("Los . aparecen " + puntostt + " de veces.");
}
	
	
	public boolean validarCorreo(String correo) {
		
		Pattern patron = Pattern.compile(("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"));
		Matcher matcher = patron.matcher(correo);
		return matcher.find();
		
	}

}
