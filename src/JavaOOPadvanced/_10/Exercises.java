package JavaOOPadvanced._10;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person person = new Person("Mario", 26, "Via nuova san rocco 129");
        System.out.println(person);
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 1: ");

        Person person1 = new Person("Jhon", 30, "Via napoli");
        Person person2 = new Person("Dep", 25, "Okland");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     * hashCode rappresenta un codice numerico hash dell'oggetto. Questo codice viene utilizzato per memorizzare e recuperare gli oggetti dalle strutture dati . Il codice restituito dal metodo hashCode() viene utilizzato come indice per accedere all'oggetto nella tabella hash.
     * Questo metodo viene utilizzato per restituire lo stesso valore hash  da due oggetti uguali.
     */
}

