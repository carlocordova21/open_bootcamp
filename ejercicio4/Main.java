package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(23, "Andre", 987654321, 1500.99);
        System.out.println(cliente.toString());
        Trabajador trabajador = new Trabajador(27, "Pedro", 987654322, 2000);
        System.out.println(trabajador.toString());
    }
}
