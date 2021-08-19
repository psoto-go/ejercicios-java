public class ejercicio31 {
	
    public static void main(String[] args) {
		int inicio=-20, fin=20, contador=0;
		
		for(int i=inicio;i<=fin;i++) {
			if(i%2!=0) {
				contador++;
				System.out.printf("%d %d\n",contador, i);
				
			}
		}
    }
}
