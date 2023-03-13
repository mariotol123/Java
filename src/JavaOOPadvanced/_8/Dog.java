package JavaOOPadvanced._8;

import java.util.Set;

public class Dog extends Animal{

    private Set<BreedOfDog> breedOfDogs;
    public Dog(double height, double weight, Set<BreedOfDog> breedOfDogs) {
        super(height, weight);

    }

    public Set<BreedOfDog> getBreedOfDogs() {
        return breedOfDogs;
    }

    public void setBreedOfDogs(Set<BreedOfDog> breedOfDogs) {
        this.breedOfDogs = breedOfDogs;
    }

    public double runSpeedMetersPerSecond(){

        return getHeight() * 2;
    }


}
