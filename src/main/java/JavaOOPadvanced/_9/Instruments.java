package JavaOOPadvanced._9;

public abstract class Instruments implements Playable{
    private String name;
    private String brand;

    public Instruments(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String play() {
        return null;
    }
}
