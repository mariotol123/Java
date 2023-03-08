package JavaOOPadvanced._6;

public enum TrafficLight {
    RED("YELLOW"),
    YELLOW("GREEN"),
    GREEN("RED");

    private String nextColor;

    TrafficLight(String nextColor) {
        this.nextColor = nextColor;
    }

    public String getNextColor() {
        return nextColor;
    }
}
