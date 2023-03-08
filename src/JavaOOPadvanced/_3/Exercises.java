package JavaOOPadvanced._3;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        list = new ArrayList<>(new HashSet<>(list));
        System.out.println(list);


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }

   private static Set<String> toSet(Collection<String> list) {
        return new HashSet<>(list);

    }



    // Write your method for exercise 2 here


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("Exercise 3: ");
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here


        for (String word : words){

            Integer count = wordCount.get(word);

            if (count == null){
                count = 0;
            }
            wordCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> d: wordCount.entrySet()){
            System.out.println(d.getKey() + ": " + d.getValue());
        }



    }



        




    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *    Answer: per l'elenco scegliamo un'arrayList perchè abbiamo bisogno degli elemtni in ordine.
     *    Per un insieme scelgo i set perchè non abbiamo bisogno di ordine preciso.
     *    Uso le mappe quando abbiamo una chiave ed un valore.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:ArrayList perchè abbiamo bisono che gli studenti abbiano un ordine preciso.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer:Uso maps perchè abbiamo la chiave che è lo studente e il valore che è il voto.
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: TreeMap perchè lo mettiamo in ordine di età.
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:Maps perchè abbiamo chiave e valore.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:LinkedSet perchè se possiamo scegliere tra set e list scegliamo set.
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:Maps chiave valore.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:Set perchè non abbiamo bisogno di un ordine preciso ma non possiamo usare map perchè non abbiamo una chiave univoca.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:Maps chiav valore.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:Set perchè non abbiamo bisogno di un ordine preciso ma non possiamo usare set perchè magari due film hanno la stessa valutazione o la stessa data di uscita.
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:Maps perchè abbiamo la chiave che è l'orario di partenza e il valore la destinazione.
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:List perchè magari abbiamo piu titoli uguali scritti nello stesso giorno.
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:List perchè non abbiamo la certezza che lo stesso titolo dell'album non sia stato usato da piu artisti e sicuramente un artista non avra fatto solo un album.
     */



