package ExerciseGiampaolo;

public enum TipoProdotto {
    SCARPE("nike", "le nike sono scarpe che si vendono da decenni"),
    JEANS("Levis", "i levis sono stati creati con dei materiali resistenti al fuoco"),
    CAPPELLI("New Era", "I cappelli di marca new era sono quelli piu venduti al mondo"),
    TUTA("Lotto", "La tuta lotto e' quella piu usata dai calciatori"),
    CALZINI("Adidas", "I calzini adidas sono i piu morbidi in circolazione");

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    TipoProdotto(String name, String description) {
        this.description = description;
        this.name = name;
    }
}
