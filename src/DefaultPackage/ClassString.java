package DefaultPackage;

public class ClassString {
    public static void main(String[] args) {
        //declarar la clase que almacena el texto
        String nombre="Maria Camila";
        int ultimaLetra=nombre.length();

        //imprimir la clase
        System.out.println("Mi nombre es " +nombre);
        System.out.println("Mi nombre tiene " +nombre.length()+" letras.");
        System.out.println(ultimaLetra);
        System.out.println("la primera letra de mi nombre es "+nombre.charAt(0)+" y mi ultima letra es "+nombre.charAt(ultimaLetra-1));
    }
}
