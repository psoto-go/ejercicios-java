public class ejercicio15 {
    public static void main(String[] args) {
        int inicio=23, fin=2, contador=inicio;
        do{
            if (contador%3==0){
                System.out.printf("%d es multiplo de 3 ", contador);
            }
        contador--;
        }
        while(contador>=fin);
        }
    }
