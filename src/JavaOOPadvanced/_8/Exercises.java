package JavaOOPadvanced._8;

import java.util.Set;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog(1.98, 122.00, Set.of(BreedOfDog.DOBERMAN));
        dog.setBreedOfDogs(Set.of(BreedOfDog.DOBERMAN));
        System.out.println(dog.getBreedOfDogs());

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish = new Fish(0.98, 10.0, Set.of(SpeciesOfFish.SWORDFISH));
        fish.setSpeciesOfFish(Set.of(SpeciesOfFish.SWORDFISH));
        System.out.println(fish.getSpeciesOfFish() + ", " +  fish.getHeight());
        Bird bird = new Bird(1.0, 15.0, 2.0);
        System.out.println(bird.getWingSpan());
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Fish fish = new Fish(0.98, 2.0, Set.of(SpeciesOfFish.SWORDFISH));
        Bird bird = new Bird(1.0, 15.0, 2.0);
        Dog dog = new Dog(1.98, 122.00, Set.of(BreedOfDog.DOBERMAN));

        double maxSpeed = Double.NEGATIVE_INFINITY;
        String fastestAnimal = "";

        double dogSpeed = dog.runSpeedMetersPerSecond();
        if (dogSpeed > maxSpeed) {
            maxSpeed = dogSpeed;
            fastestAnimal = "dog";
        }

        double fishSpeed = fish.swimSpeedMetersPerSecond();
        if (fishSpeed > maxSpeed) {
            maxSpeed = fishSpeed;
            fastestAnimal = "fish";
        }

        double birdSpeed = bird.flySpeedMetersPerSecond();
        if (birdSpeed > maxSpeed) {
            maxSpeed = birdSpeed;
            fastestAnimal = "bird";
        }

        System.out.println("The fastest animal is the " + fastestAnimal + " with a speed of " + maxSpeed + " meters per second.");

    }
}

