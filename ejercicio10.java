public class ejercicio10 {
    public static void main(String[] args) {
        int inicio=-86, fin=23, multiplos5=0;
        for(int i=inicio;i<=fin;i++){
            if (i%5==0){
                if (i%4!=0){
                    System.out.printf("%d es multiplo de 5\n",i);
                    multiplos5++;
                }

            }
        }
        System.out.printf("\nLos multiplos de 5 son %d", multiplos5);
    }   
}
