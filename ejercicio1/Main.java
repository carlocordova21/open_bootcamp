package ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Primera parte
        suma(1, 2, 3);
        //Segunda parte
        Coche miCoche = new Coche();
        miCoche.agregarPuertas(1);
        System.out.println("El coche ahora tiene " + miCoche.getPuertas() + " puertas");
    }

    public static void suma(int a, int b, int c) {
        int suma = a + b + c;
        System.out.println("La suma es: "+ suma);
    }
}
