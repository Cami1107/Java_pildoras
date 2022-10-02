package DefaultPackage;

public class Mathh {
    public static void main(String[] args) {
        //sacar la raiz de un numero con una libreria
        double raiz=Math.sqrt(9);
        double num1=5.85F;
        int resultado=(int)Math.round(num1);

        //area de un rectangulo
        double base=5;
        double altura=3;
        int area=(int)Math.pow(base,altura);

        //imprimir resultado
        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println("si la base es "+base+" y la altura es "+altura+" entonces el area es "+area);
    }
}
