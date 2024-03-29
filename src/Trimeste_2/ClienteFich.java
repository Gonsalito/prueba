package Trimeste_2;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteFich {

	    /**
	     * Main del Cliente
	     * 
	     * @param args
	     *            de la línea de comandos. Se ignora.
	     */
	    public static void main(String[] args)
	    {
	        // Se crea el cliente y se le manda pedir el fichero.
	    	ClienteFich cf = new ClienteFich();
	        cf.pide("d:/resultado.txt", "www.google.com", 80);
	    }

	    /**
	     * Establece comunicación con el servidor en el puerto indicado. Pide el
	     * fichero. Cuando llega, lo escribe en pantalla y en disco duro.
	     * 
	     * @param fichero
	     *            path completo del fichero que se quiere
	     * @param servidor
	     *            host donde está el servidor
	     * @param puerto
	     *            Puerto de conexión
	     */
	    public void pide(String fichero, String servidor, int puerto)
	    {
	        try
	        {
	            // Se abre el socket.
	            Socket socket = new Socket(servidor, puerto);

	            // Se envía un mensaje de petición de fichero.
	            ObjectOutputStream oos = new ObjectOutputStream(socket
	                    .getOutputStream());
	            DameFile mensaje = new DameFile();
	            mensaje.nombreFichero = fichero;
	            oos.writeObject(mensaje);

	            // Se abre un fichero para empezar a copiar lo que se reciba.
	            FileOutputStream fos = new FileOutputStream(mensaje.nombreFichero
	                    + "_copia");

	            // Se crea un ObjectInputStream del socket para leer los mensajes
	            // que contienen el fichero.
	            ObjectInputStream ois = new ObjectInputStream(socket
	                    .getInputStream());
	            FileForU mensajeRecibido;
	            Object mensajeAux;
	            do
	            {
	                // Se lee el mensaje en una variabla auxiliar
	                mensajeAux = ois.readObject();
	                
	                // Si es del tipo esperado, se trata
	                if (mensajeAux instanceof FileForU)
	                {
	                    mensajeRecibido = (FileForU) mensajeAux;
	                    // Se escribe en pantalla y en el fichero
	                    System.out.print(new String(
	                            mensajeRecibido.contenidoFichero, 0,
	                            mensajeRecibido.bytesValidos));
	                    fos.write(mensajeRecibido.contenidoFichero, 0,
	                            mensajeRecibido.bytesValidos);
	                } else
	                {
	                    // Si no es del tipo esperado, se marca error y se termina
	                    // el bucle
	                    System.err.println("Mensaje no esperado "
	                            + mensajeAux.getClass().getName());
	                    break;
	                }
	            } while (!mensajeRecibido.ultimoMensaje);
	            
	            // Se cierra socket y fichero
	            fos.close();
	            ois.close();
	            socket.close();

	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
}


