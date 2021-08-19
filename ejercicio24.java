public class ejercicio24 {
    public static void main(String[] args) {
		int inicio=-30, fin=30, contador=inicio;
		String espacio="";
		String texto="";
		do{
			if(contador%3!=0){
				texto= texto + espacio + contador + "\n";
				espacio= espacio + " ";
			}
		contador++;
		}
		while (contador<=fin);
		System.out.print(texto);
    }
}
