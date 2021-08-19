public class ejercicio21 {
    public static void main(String[] args) {
		int inicio=23, fin=2, contador=inicio, contadorFilas=0;
		do {
			if(contador%3==0) {
				System.out.printf("%d, ", contador);
				contadorFilas++;
				if(contadorFilas%4==0) {
					System.out.printf("\n");
				}
			}
			contador--;
		}
		while (contador>=fin);
    }
}
