package ejercicio4;

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, int telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                "credito=" + credito +
                '}';
    }
}
