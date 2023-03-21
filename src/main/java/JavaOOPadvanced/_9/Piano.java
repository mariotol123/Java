package JavaOOPadvanced._9;

public class Piano extends Instruments implements Playable{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "I play the piano : " + getName();
    }
}
