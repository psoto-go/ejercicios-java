public class ejercicio59 {

	public static void main(String[] args) {
		int inicio = -86, fin = 23, resultado = 0;
		for(int i=inicio;i<=fin;i++) {
			if(i%5==0) {
				if(i%4!=0) {
					resultado++;
				}
			}
			inicio++;
		}
		System.out.print(resultado);
	}
}
