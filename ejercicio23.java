public class ejercicio23 {
    public static void main(String[] args) {
		int inicio=-30, fin=30, contador=inicio;
		String espacio="";
		String texto="";
		while(contador<=fin){
			if(contador%3!=0){
				texto+= espacio + contador + "\n";
				espacio+=" ";
			}
			contador++;
		}
		System.out.printf("%s",texto);
		
    }
}
