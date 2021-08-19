public class ejercicio12 {
    public static void main(String[] args) {
        int inicio=-86, fin=23, multiplos5=0, contador=inicio;
        do{
            if (contador%5==0){
                if(contador%4!=0){ 
                    multiplos5++;
                    System.out.printf("%d es multiplo de 5\n", contador);   
                }
            }
        contador++;
        }
        while(contador<=fin);
        System.out.printf("\n%d son multiplos de 5", multiplos5);
    }
}
