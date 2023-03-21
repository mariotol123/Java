package JavaOOPadvanced._9;

public class Circle extends Shape{
    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }


}
