public class ejercicio22 {
    public static void main(String[] args) {
		int inicio=-30, fin=30;
		String espacio="";
		String texto="";
		for(int i=inicio;i<=fin;i++) {
			if(i%3!=0) {
				texto+= espacio + i + "\n";
				espacio+=" ";	
			}
		}
		System.out.printf("%s",texto);
    }
}
