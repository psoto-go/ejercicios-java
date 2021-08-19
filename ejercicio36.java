public class ejercicio36 {
	
    public static void main(String[] args) {
		int inicio=0, fin=2048;
		
		do {
			if(inicio%16==0) {
				System.out.printf("0x%04X\n", inicio);
			}
			inicio++;
		}
		while(inicio<=fin);
    }
}
