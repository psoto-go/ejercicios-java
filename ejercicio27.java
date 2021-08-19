public class ejercicio27 {
    public static void main(String[] args) {
		int inicio=-20, fin=20, contador=0;
		do {
			if(inicio%2!=0) {
				if(contador%5==0) {
					System.out.printf("\n");
				}
				System.out.printf("%+05d ", inicio);
				contador++;
			}
			inicio++;
		}
		while(inicio<=fin);

    }
}
