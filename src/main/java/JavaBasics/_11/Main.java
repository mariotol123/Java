package JavaBasics._11;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3Bonus();
    }

    /**
     * 1: Finish this switch statement to include:
     *    "cheeseburger" cost: 7.99 and calories 850
     *     "fries" cost: 3.99 and calories 250
     */
    public static void exercise1() {
        System.out.println("Exercise 1 - Fast Food Order:");
        String fastFoodOrder = "fries";
        double orderCost = 0;
        int orderCalories = 0;

        switch (fastFoodOrder) {
            case "cheeseburger":
                orderCalories = 850;
                orderCost = 7.99;
                break;
            case "fries":
                orderCalories = 250;
                orderCost = 3.99;
                break;
            default:
                System.out.println("Nothing");
        }

        System.out.println("Order receipt:" +
                "\nOrder item=" + fastFoodOrder +
                "\nkCal=" + orderCalories +
                "\ncost=€" + orderCost
        );
    }

    /**
     * 2: Complete a switch statement to achieve the following
     *
     *    If the user enters a prime number between 0-20 (2, 3, 5, 7, 11, 13, 17, 19)
     *
     *    Print "This is the nth largest prime number under 20", i.e.
     *    19 -> "This the largest prime number under 20"
     *    11 -> "This is the 4th largest prime number under 20"
     *
     *    If the number is above 20, or not prime number print: "Invalid entry", use a 'default'
     *    statement for this
     */
    public static void exercise2() {
        System.out.println("\nExercise 2 - Prime numbers:");

        int inputNumber = 21;

        switch (inputNumber){
            case 2:
                System.out.println("Is the first prime number");
                break;
            case 3:
                System.out.println("Is the second prime number");
                break;
            case 5:
                System.out.println("Is the third prime number");
                break;
            case 7:
                System.out.println("Is the four prime number");
                break;
            case 11:
                System.out.println("Is the five prime number");
                break;
            case 13:
                System.out.println("Is the six prime number");
                break;
            case 17:
                System.out.println("Is the seven prime number");
                break;
            case 19:
                System.out.println("Is the last prime number");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------
     * Complete exercise 2 a switch statement with -> instead of :
     * i.e. case 19 -> System.out.print("Largest prime under 20");
     *
     */
    public static void exercise3Bonus() {
        System.out.println("\nExercise 3 - Prime  numbers (Bonus)");

        int inputNumber = 5;

        switch (inputNumber){
            case 2 -> System.out.println("The first prime number ");
            case 3 -> System.out.println("The second prime number");
            case 5 -> System.out.println("The third prime number");
            case 7 -> System.out.println("The four prime number");
            case 11 -> System.out.println("The five prime number");
            case 13 -> System.out.println("The six prime number");
            case 17 -> System.out.println("The seven prime number");
            case 19 -> System.out.println("The last prime number");
            default -> System.out.println("Invalid entry");
        }

    }
}

