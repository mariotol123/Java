package ExerciseByTutor;

public class Skill {

    // attributi
    private String name;
    private int damage;
    private double hitChance;

    // costruttore
    public Skill(String name, int damage, double hitChance) {
        this.name = name;
        this.damage = damage;
        this.hitChance = hitChance;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public double getHitChance() {
        return hitChance;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHitChance(double hitChance) {
        this.hitChance = hitChance;
    }
}
