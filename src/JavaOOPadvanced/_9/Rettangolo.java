package JavaOOPadvanced._9;

public class Rettangolo extends Shape{
    public Rettangolo(double height, double width) {
        super(height, width);
    }

    @Override
    public double calcArea() {

        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
