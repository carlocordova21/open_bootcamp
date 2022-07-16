package ejercicio1;

public class Coche {
    private int puertas = 4;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void agregarPuertas(int num) {
        this.puertas += num;
    }
}
