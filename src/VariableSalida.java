public class VariableSalida {
	
	
	public static void main (String args[]) {
		int N = 3;
		
		System.out.println ("Valor inicial de N =" +N);
		System.out.println ("Incrementar valor de N =" +(N+77));
		System.out.println ("Decrementar valor de N =" +(N-3));
		System.out.println ("Duplicar valor de N =" +(N*2));
		
		int resultado = sumar(3, 77); //Otro ejemplo usando método static int.
		System.out.println ("Incrementar valor de N int ="+(resultado));
		
		
		
		//Otro ejemplo usando la sentencia if.
		if (N == 3){
			System.out.println ("Incrementar valor de N if =" +(N+77));
		}
		else if (N > 3); {
			System.out.println ("Valor inicial de N =" +N);
		}
	
	}
	static int sumar (int n, int b) {
		
		return n+b;
	}
}
	
		
		
		
			
		
		
		
		
		
			
		
		
		

