package DefaultPackage;

public class Operadores {
    public static void main(String[] args) {
        /*declarar variables para una suma */
        int a=5;
        int b;
        b=5;
        int c=b+a;
        //c++;
        //c-=6;
        //dividion de
        double d=6;
        double e=5;
        double f= d/e;

        //declarar una constante
        final double pulgadas=2.54;
        double cm=6;
        double resultado=cm/pulgadas;

        //

        System.out.println(c);
        System.out.println(f);
        System.out.println("En cm es " +cm+ " en pulgadas es " + resultado);
    }
}
