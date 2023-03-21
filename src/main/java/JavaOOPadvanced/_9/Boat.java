package JavaOOPadvanced._9;

public class Boat implements Movable{
    String marca;
    double potenzaMotore;
    double velocita;

    public Boat(String marca, double potenzaMotore, double velocita) {
        this.marca = marca;
        this.potenzaMotore = potenzaMotore;
        this.velocita = velocita;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotenzaMotore() {
        return potenzaMotore;
    }

    public void setPotenzaMotore(double potenzaMotore) {
        this.potenzaMotore = potenzaMotore;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    @Override
    public double moveForward() {
        return getVelocita()*getPotenzaMotore();
    }

    @Override
    public double moveBackward() {
        return getVelocita()/getPotenzaMotore();
    }
}
