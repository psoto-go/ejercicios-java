public class ejercicio60 {

	public static void main(String[] args) {
		int inicio = -86, fin = 23, resultado = 0;
		while(inicio<=fin) {
			if(inicio%5==0) {
				if(inicio%4!=0) {
					resultado++;
				}
			}
			inicio++;
		}
		System.out.print(resultado);
	}
}
