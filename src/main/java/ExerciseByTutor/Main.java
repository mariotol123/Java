package ExerciseByTutor;

import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {


        Skill kamehameha = new Skill("Kamehameha", 80, Math.random());
        Skill kienzan = new Skill("Kienzan", 35, Math.random());
        Skill genkidama = new Skill("Genkidama", 65, Math.random());
        Skill makankosappo = new Skill("Makankosappo", 100, Math.random());
        Skill big_bang = new Skill("Big Bang", 90, Math.random());
        Skill galick_cannon = new Skill("Galick Cannon", 85, Math.random());
        Skill tayoken = new Skill("Tayoken", 20, Math.random());

        //Set skill list
        ArrayList<Skill> skills_set1 = new ArrayList<>();
        skills_set1.add(kamehameha);
        skills_set1.add(kienzan);
        skills_set1.add(genkidama);
        skills_set1.add(makankosappo);

        ArrayList<Skill> skills_set2 = new ArrayList<>();
        skills_set2.add(galick_cannon);
        skills_set2.add(big_bang);
        skills_set2.add(tayoken);
        skills_set2.add(kienzan);

        ArrayList<Skill> skills_set3 = new ArrayList<>();
        skills_set3.add(kamehameha);
        skills_set3.add(genkidama);
        skills_set3.add(tayoken);
        skills_set3.add(big_bang);

        // Characters

        Character goku = new Character("Goku", 100, 12,Math.random() ,Math.random(),CharacterType.SAIYAN, skills_set1);
        Character vegeta = new Character("Vegeta", 100, 10,Math.random(),Math.random(), CharacterType.SAIYAN, skills_set2);
        Character cell = new Character("Cell", 100, 20,Math.random(),Math.random(), CharacterType.CYBORG, skills_set3);
        Character crillin = new Character("Crillin", 100, 10,Math.random(),Math.random(),CharacterType.HUMAN, skills_set3);
        Character c18 = new Character("c18", 100, 14, Math.random(), Math.random(), CharacterType.CYBORG, skills_set1);
        Character majin_bu = new Character("Majin Bu", 100, 15,Math.random(),Math.random(), CharacterType.DEMON, skills_set1);

        // Characters list
        ArrayList<Character> characters = new ArrayList<>();

        characters.add(goku);
        characters.add(vegeta);
        characters.add(cell);
        characters.add(majin_bu);
        characters.add(crillin);
        characters.add(c18);

        Scanner newScanner = new Scanner(System.in);
        int input = 1;
        printCharacters(characters);

        TorneoTenkaich(input, characters, newScanner);





    }
     public static void printCharacters (ArrayList<Character> characters){
         System.out.println("Choose your character");
         for (int i = 0; i < characters.size(); i++){
             System.out.println(i + "_ " + characters.get(i).getName());

         }
     }

     public static void TorneoTenkaich (int input, ArrayList<Character> players, Scanner scanner){

        while (input != 0){
            switch (input){
                case 1:
                    System.out.println("Choose character 1");
                    Character character1 = players.get(scanner.nextInt());
                    System.out.println("Choose character 2");
                    Character character2 = players.get(scanner.nextInt());
                    Fight.fight(character1, character2);
                    break;

                case 0:
                    input = scanner.nextInt();
                    break;
                default:
                    System.out.println("NaN");
                    break;

            }
        }

     }


}


