package JavaOOPadvanced._6;

public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public static TrafficLight trafficLightToString (TrafficLight trafficLight){
        switch (trafficLight){
            case RED: return trafficLight.GREEN;
            case YELLOW: return  trafficLight.RED;
            case GREEN: return trafficLight.YELLOW;


        }
        return trafficLight;
    }


}
