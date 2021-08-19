public class ejercicio25 {
    public static void main(String[] args) {
		int inicio=-20, fin=20, contador=0;
		for(int i=inicio;i<=fin;i++){
			if(i%2!=0){
			if(contador%5==0){
				System.out.printf("\n");
			}
			contador++;
			System.out.printf("%+05d ",i);
			
			}
			
		}

    }
}
