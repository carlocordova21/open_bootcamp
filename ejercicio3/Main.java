package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Andre");
        persona.setTelefono(987654321);

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}
