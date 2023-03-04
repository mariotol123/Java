import SimulazioneProva.FootballPalyer;
import SimulazioneProva.Team;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FootballPalyer footballPalyer1 = new FootballPalyer();
        FootballPalyer footballPalyer2 = new FootballPalyer(4, 5, 1);
        FootballPalyer footballPalyer3 = new FootballPalyer(0, 0 , 0);
        FootballPalyer footballPalyer4 = new FootballPalyer(10, 5, 6);
        FootballPalyer footballPalyer5 = new FootballPalyer(20, 3, 6);


        HashSet<Integer> footballPlayer = new HashSet<>(footballPalyer5, footballPalyer2, footballPalyer3);
        System.out.println(footballPlayer);

    }

}
