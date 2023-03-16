package JavaOOPadvanced._9;

public class Guitar extends Instruments implements Playable{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "I play the guitar : " + getName();
    }
}
