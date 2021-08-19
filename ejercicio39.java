public class ejercicio39 {
	
    public static void main(String[] args) {
		int inicio=0, fin=2048, contador=0;
		
		do {
			if(inicio%16==0) {
				System.out.printf("0x%04X ", inicio);
				contador++;
				if(contador%16==0) {
					System.out.printf("\n");
				}
			
			}
			inicio++;
		}
		while(inicio<=fin);
    }
}
