public class ejercicio29 {
    public static void main(String[] args) {
		int inicio=-20, fin=20, contador=0;
		while(inicio<=fin) {
			if(inicio%2!=0) {
				if(contador%5==0) {
					System.out.printf("\n");
			}
				System.out.printf("%5d ",inicio);
				contador++;
		}
		inicio++;
		}
    }
}
