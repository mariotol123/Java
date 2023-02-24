package ExerciseByTutor;

public class Fight {

    public static void fight(Character player_1, Character player_2) {
        boolean player_1_start = Math.random() < 0.5;
        int char1Hp_Initial = player_1.getLifePoints();
        int char2Hp_Initial = player_2.getLifePoints();
        while (player_1.getLifePoints() >= 0 && player_2.getLifePoints() >= 0) {
            if (player_1_start) {
                player_1.attack(player_2);
            } else {
                player_2.attack(player_1);
            }
            player_1_start = !player_1_start;
        }
        if (player_1.getLifePoints() <= 0) {
            System.out.println("The winner is " + player_2.getName() + "\n" + player_1.getName() + " is out of the BigTournament...!");
        } else if (player_1.getLifePoints() <= 0 && player_2.getLifePoints() <= 0) {
            player_1.setLifePoints(char1Hp_Initial);
            player_2.setLifePoints(char2Hp_Initial);
            System.out.println("Both players are out of the BigTournament...! It's a draw!");
        } else {
            System.out.println("The winner is " + player_1.getName() + "\n" + player_2.getName() + " is out of the BigTournament...!");
        }
        player_1.setLifePoints(char1Hp_Initial);
        player_2.setLifePoints(char2Hp_Initial);
    }
}