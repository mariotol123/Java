package ExerciseGiampaolo;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Articolo articolo = new Articolo("Nike", 100, TipoProdotto.SCARPE);
        Articolo articolo2 = new Articolo("Levios", 70,TipoProdotto.JEANS);
        Articolo articolo3 = new Articolo("Toshyba", 100,TipoProdotto.TUTA);
        Articolo articolo4 = new Articolo("W", 200, TipoProdotto.TUTA);

        System.out.println(articolo.applicaSconto(0.10));
        System.out.println(articolo.getPossibleDiscount());
        System.out.println(articolo.calcolaSconto());

        Negozio negozio = new Negozio("MediaWorld");
        negozio.addArticolo(articolo);
        negozio.addArticolo(articolo2);
        negozio.addArticolo(articolo3);
        negozio.addArticolo(articolo4);

        negozio.applyScount(TipoProdotto.TUTA, 30);


        negozio.salvaCatagolo("catalogo.csv");
       // negozio.caricaCatalogo("file.csv");


    }
}
