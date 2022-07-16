package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        System.out.print("Ingrese numero: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("El numero es positivo.");
        } else if (num < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es igual a 0.");
        }

        System.out.println("-------------------------------------------");

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/
        System.out.print("Ingrese numeroWhile: ");
        int numeroWhile = sc.nextInt();
        if(numeroWhile >= 3) {
            System.out.println("El numero ingresado es mayor igual a 3, por lo tanto no ingresa al while.");
        }
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("-------------------------------------------");

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        System.out.print("Ingrese numeroDoWhile: ");
        int numeroDoWhile = sc.nextInt();
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
            break;
        } while (numeroDoWhile < 3);

        System.out.println("-------------------------------------------");

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
        for(int numeroFor=0; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("-------------------------------------------");

        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo
        del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá
        que poner un default para cuando el valor de la variable no sea una estación.*/
        System.out.print("Ingrese numero de estacion del año Verano(1), Otoño(2), Primavera(3), Invierno(4): ");
        int num_estacion = sc.nextInt();
        switch (num_estacion) {
            case 1:
                System.out.println("La estacion ingresada es Verano.");
                break;
            case 2:
                System.out.println("La estacion ingresada es Otoño.");
                break;
            case 3:
                System.out.println("La estacion ingresada es Primavera.");
                break;
            case 4:
                System.out.println("La estacion ingresada de Invierno");
                break;
            default:
                System.out.println("El numero de estacion ingresado no existe.");
        }
    }


}
