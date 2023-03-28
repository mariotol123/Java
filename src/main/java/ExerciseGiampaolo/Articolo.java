package ExerciseGiampaolo;

public class Articolo extends Product implements Sconto{

    private static int countId = 0;
    private int id;
    private String description;
    private TipoProdotto tipoProdotto;
    protected double possibleDiscount;



  public Articolo(String name, int price, TipoProdotto tipoProdotto, double possibleDiscount) {
        super(name, price);
        this.id = countId++;
        this.tipoProdotto = tipoProdotto;
        this.possibleDiscount = possibleDiscount;
    }

    public Articolo(String name, int price, TipoProdotto tipoProdotto) {
        super(name, price);
        this.id = countId++;

        this.tipoProdotto = tipoProdotto;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public double getPossibleDiscount(){
        return possibleDiscount;
    }

    public void setPossibleDiscount(double possibleDiscount){
        this.possibleDiscount = possibleDiscount;
    }

    public double applicaSconto(double discount) {

        possibleDiscount = price * discount;
        return possibleDiscount;

    }


    @Override
    public double calcolaSconto() {
        return price - possibleDiscount;
    }

    @Override
    public String toString() {
        return name + ", " + price + ";" + tipoProdotto;
    }
}
