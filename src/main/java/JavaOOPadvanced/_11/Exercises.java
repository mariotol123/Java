package JavaOOPadvanced._11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

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
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        int numberRandom = (int) (Math.random() * 100);

        String number = numberRandom >= 50 ? "Number random is greater than or equal" : "Number random is less than 50";

        System.out.println(number);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Mario", 25, "Via milano");
        System.out.println(person);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("100000000000000000000000000");
        BigDecimal bigDecimal = new BigDecimal("123456789.987654321");

        BigInteger bigInteger1 = bigInteger.divide(new BigInteger("3"));
        BigDecimal bigDecimal1 = bigDecimal.divide(new BigDecimal(Math.PI),RoundingMode.HALF_UP);



        System.out.println(bigInteger1);
        System.out.println(bigDecimal1);

    }

}
