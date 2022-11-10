package psp;


//Copia del trabajo del profe

//Una clase que se llame lanzador, y lanzar procesos usando este programa lanzandolo 2 veces y que lo lance para 1,51 y 51,100.


public class SumatorioProfe {

	public int sumar(int n1, int n2) {
		int resultado=0;
		for(int i=n1; i<=n2;i++) {
			
			resultado=resultado+i;
		}
		return resultado;
	}
	
	
	
	public static void main (String[]Args) {
		
		SumatorioProfe s = new SumatorioProfe();
		int n1 = Integer.parseInt(Args[0]);
		int n2 = Integer.parseInt(Args[1]);
		
		int resultado = s.sumar(n1,n2);
		System.out.println(resultado);
		
		
		
	}
	
}
