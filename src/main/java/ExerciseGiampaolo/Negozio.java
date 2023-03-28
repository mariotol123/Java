package ExerciseGiampaolo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Negozio {
    private String nome;
    private HashMap<Articolo, Integer> catalogo;

    public Negozio(String nome) {
        this.nome = nome;
        this.catalogo = new HashMap<>();
    }

    public Negozio(String nome, HashMap<Articolo, Integer> catalogo) {
        this.nome = nome;
        this.catalogo = catalogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<Articolo, Integer> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(HashMap<Articolo, Integer> catalogo) {
        this.catalogo = catalogo;
    }

    public void addArticolo (Articolo articolo){

        if (!catalogo.containsKey(articolo)){
            catalogo.put(articolo, 1);
        } else {
            catalogo.put(articolo, catalogo.get(articolo) + 1);
        }
    }
    public void removeArticolo(Articolo articolo){

        if (!catalogo.containsKey(articolo)){
            throw new IllegalArgumentException("Non posso rimuovere");
        }
        int value = catalogo.get(articolo);
        if (value == 1){
            catalogo.remove(articolo);
        } else {
            catalogo.put(articolo, value -1);
        }
    }

    public Articolo getArticolo(String nomeArticolo){
        for (Articolo a : catalogo.keySet()){
            if (a.getName().equals(nomeArticolo)){
                return a;
            }
        }
        throw new IllegalArgumentException("Articolo con questo nome non presente");
    }

    public void applyScount(TipoProdotto tipoProdotto, double sconto){
        for (Articolo articoloA : catalogo.keySet() ) {

            if (articoloA.getTipoProdotto().equals(tipoProdotto)){
                articoloA.applicaSconto(sconto);
            }
            System.out.println("Questo sono gli articoli scontati" + articoloA);
        }

    }

    public void salvaCatagolo(String pathName)throws IOException {
        File file = new File(pathName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (Map.Entry<Articolo, Integer> entry : catalogo.entrySet()){
            bw.append(entry.getKey().toString() + ", " + entry.getValue() + "\n");
        }
        bw.close();
    }

    //public void caricaCatalogo(String nomeFile) throws FileNotFoundException, FileNotFoundException {
       // File file = new File(nomeFile);
       // Scanner scanner = new Scanner(file);

       //// while (scanner.hasNextLine()) {
           // String riga = scanner.nextLine();
           // String[] campi = riga.split(",");
           // String nomeProdotto = campi[0];
           // double prezzo = Double.parseDouble(campi[1]);
           // addArticolo(new Articolo(getNome(), prezzo));
        }

       // scanner.close();
   // }


//}
