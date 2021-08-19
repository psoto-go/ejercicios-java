public class ejercicio19 {
    public static void main(String[] args) {
        int inicio=23, fin=2, contadorFilas=0;
		for(int i=inicio;i>=fin;i--) {
			if (i%3==0) {
				System.out.printf("%d, ", i);
				contadorFilas++;
				if(contadorFilas%4==0) {
					System.out.printf("\n");
				}
			}
		}
    }
}
