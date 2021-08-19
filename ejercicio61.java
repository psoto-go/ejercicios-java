public class ejercicio61 {

	public static void main(String[] args) {
		int inicio = -86, fin = 23, resultado = 0;
		do {
			if(inicio%5==0) {
				if(inicio%4!=0) {
					resultado++;
				}
			}
			inicio++;
		}
		while(inicio<=fin);
		System.out.print(resultado);
	}
}
