package JavaOOP.exercises1._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Students students = new Students("luca", "Rossi", 20, 4.99, "Blue");

        students.setName("Mario");
        students.setAge(25);
        students.setSurname("Tolvo");
        students.setLunchPrice(2.99);
        students.setFavoriteColour("Black");

        System.out.println("My name is: " + students.getName() + " , i have " + students.getAge() + " and today my lunch price is " + students.getLunchPrice() + " My surname is " + students.getSurname() + " and my favorite colour is " + students.getFavoriteColour());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Students students2 = new Students("mario" , "Rossi", 20, 4.99, "blue");

        students2.setAge(-9);
        System.out.println(students2.getAge());
        students2.setAge(-1);
        System.out.println(students2.getAge());
        students2.setAge(-23);
        System.out.println(students2.getAge());
        System.out.println( "The counter is :" + students2.getCheckAge());
        students2.setLunchPrice(10.99);
        System.out.println(students2.getLunchPrice());
        students2.setSurname("Arina");
        System.out.println(students2.getSurname());
        students2.setSurname("Tometo");
        System.out.println(students2.getSurname());
    }

}

