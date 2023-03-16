package JavaOOPadvanced._9;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
       Rettangolo rettangolo = new Rettangolo(4.99, 5.88);
       System.out.println(rettangolo.calcArea());
       Circle circle = new Circle(8.99, 10.88);
       System.out.println(circle.calcArea());


    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Boat boat = new Boat("Greg", 600.00, 80.00);
        System.out.println("The boat has a speed of " + boat.moveForward() + "and when it comes back it has a speed of " + boat.moveBackward());

        Car car = new Car("Mercedes", 2300.00, 120.00);
        System.out.println("The car has a speed of " + car.moveForward() + "and when it comes back it has a speed of " + car.moveBackward());

    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Guitar guitar = new Guitar("LaSuola", "Yamaha");
        Piano piano = new Piano("August Förster", "Yamaha");

        System.out.println(guitar.play());
        System.out.println(piano.play());
    }
}

