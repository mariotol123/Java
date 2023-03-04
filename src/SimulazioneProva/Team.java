package SimulazioneProva;

import java.util.HashSet;

public class Team {
private int id;
private String name;

HashSet<String> team = new HashSet<>();

Team(int id, String name){
    this.name = name;
    this.id = id;
}

Team(int id, String name, HashSet<String> team){
    this.name = name;
    this.id = id;

}

public void printTeam(){
    System.out.println(name);
}

public void addPlayer(FootballPalyer palyer){
    System.out.println("Aggiunge il giocatore p al team");
}


}
