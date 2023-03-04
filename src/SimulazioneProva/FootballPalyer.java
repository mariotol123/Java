package SimulazioneProva;

public class FootballPalyer {

    private int id;
    private String name;
    private String cognome;
    private int numeroPresenze;
    private int numeroGolSegnati;
    private int numeroAssist;

    private String squadraInCuiGioca;


    public FootballPalyer(int numeroPresenze, int numeroGolSegnati, int numeroAssist){

        this.numeroPresenze = numeroPresenze;
        this.numeroGolSegnati = numeroGolSegnati;
        this.numeroAssist = numeroAssist;
    }
    FootballPalyer(int id, String name, String cognome, String squadraInCuiGioca) {

        this.id = id;
        this.name = name;
        this.cognome = cognome;
        this.squadraInCuiGioca = squadraInCuiGioca;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroPresenze() {
        return numeroPresenze;
    }

    public int getNumeroGolSegnati() {
        return numeroGolSegnati;
    }

    public int getNumeroAssist() {
        return numeroAssist;
    }

    public void setNumeroPresenze(int numeroPresenze) {
        this.numeroPresenze = numeroPresenze;
    }

    public String getSquadraInCuiGioca() {
        return squadraInCuiGioca;
    }

    public void setSquadraInCuiGioca(String squadraInCuiGioca) {
        this.squadraInCuiGioca = squadraInCuiGioca;
    }

    public void setNumeroGolSegnati(int numeroGolSegnati) {
        this.numeroGolSegnati = numeroGolSegnati;
    }

    public void setNumeroAssist(int numeroAssist) {
        this.numeroAssist = numeroAssist;
    }

    public void score(){
        System.out.println((numeroGolSegnati + (0.75*numeroAssist)) / numeroPresenze);
    }
}
