public class ejercicio20 {
    public static void main(String[] args) {
		int inicio=23, fin=2, contador=inicio, contadorFilas=0;
		while(contador>=fin) {
			if (contador%3==0) {
				System.out.printf("%d, ", contador);
				
				contadorFilas++;
				if(contadorFilas%4==0) {
					System.out.printf("\n");
				}
			}
			contador--;
		}
    }
}
