public class ejercicio33 {
	
    public static void main(String[] args) {
		int inicio=-20, fin=20, contador=0;
		do {
			if(inicio%2!=0) {
					contador++;
					System.out.printf("%d %d\n", contador, inicio );
					
				}
				inicio++;
			}
		while(inicio<=fin);
			
    }
}
