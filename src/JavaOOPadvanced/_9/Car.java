package JavaOOPadvanced._9;

public class Car implements Movable{

    String marca;
    double cilindrata;
    double veloitaDipercorrimento;

    public Car(String marca, double cilindrata, double veloitaDipercorrimento) {
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.veloitaDipercorrimento = veloitaDipercorrimento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getVeloitaDipercorrimento() {
        return veloitaDipercorrimento;
    }

    public void setVeloitaDipercorrimento(double veloitaDipercorrimento) {
        this.veloitaDipercorrimento = veloitaDipercorrimento;
    }

    @Override
    public double moveForward() {
        return getCilindrata()*getVeloitaDipercorrimento();
    }

    @Override
    public double moveBackward() {
        return getCilindrata()/getVeloitaDipercorrimento();
    }
}
