package psp;

import java.util.Random;

public class AutoContraseña {
	
	public static void main(String[] args)
    {

        int length = 10;
        System.out.println(geek_Password(length));
    }
  

    static char[] geek_Password(int len)
    {
        System.out.println("Generando una contraseña random : ");
        System.out.print("Tu nueva contraseña es : ");
  
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
  
  
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] password = new char[len];
  
        for (int i = 0; i < len; i++)
        {

            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
  
        }
        return password;
    }

}
