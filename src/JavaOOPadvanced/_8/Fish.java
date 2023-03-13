package JavaOOPadvanced._8;

import java.util.Set;

public class Fish extends Animal{

    private Set<SpeciesOfFish> speciesOfFish;
    public Fish(double height, double weight, Set<SpeciesOfFish> speciesOfFish) {
        super(height, weight);
    }

    public Set<SpeciesOfFish> getSpeciesOfFish() {
        return speciesOfFish;
    }

    public void setSpeciesOfFish(Set<SpeciesOfFish> speciesOfFish) {
        this.speciesOfFish = speciesOfFish;
    }

    public double swimSpeedMetersPerSecond(){
        return getWeight() * 2;
    }
}
