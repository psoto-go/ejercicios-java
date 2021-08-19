public class ejercicio34 {
	
    public static void main(String[] args) {
		int inicio=0, fin=2048;
		
		for(int i=inicio;i<=fin;i++) {
			if(i%16==0) {
				System.out.printf("0x%04X\n", i);
			}
		}
    }
}
