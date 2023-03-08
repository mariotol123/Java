package JavaOOPadvanced._6;

public enum Seasons {
    SPRING("1 march - 31 may"),
    SUMMER("1 june - 31 august"),
    FALL("1 september - 31 autumn"),
    WINTER("21 december - 20 march");

    private String month;

    Seasons(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
