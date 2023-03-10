package JavaOOPadvanced._6;

public enum Seasons {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    public static String getSeasonsDate (Seasons season) {
        switch (season) {
            case SPRING:
                return "March 20 - June 20";
            case SUMMER:
                return "June 21 - September 21";
            case FALL:
                return "September 22 - December 20";
            case WINTER:
                return "December 21 - March 19";
            default:
                return "";
        }
    }
}



