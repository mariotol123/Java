package ExerciseByTutor;

import java.util.ArrayList;
import java.util.Random;

public class Character {

    // attributi
    private String name;
    private int lifePoints;
    private int strenght;
    private double dodgeChance;
    private double armor;
    private CharacterType characterType;
    private ArrayList<Skill> skills;

    // costruttore


    public Character(String name, int lifePoints, int strenght, double dodgeChance, double armor, CharacterType characterType, ArrayList<Skill> skills) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strenght = strenght;
        this.dodgeChance = dodgeChance;
        this.armor = armor;
        this.characterType = characterType;
        this.skills = skills;
        Skill basicAttack = new Skill("Basic Attack", this.strenght, 1 - this.dodgeChance);
        skills.add(basicAttack);
    }

    // getter
    public String getName() { return name; }
    public int getLifePoints() { return lifePoints; }
    public int getStrenght() { return strenght; }
    public double getDodgeChance() { return dodgeChance; }
    public double getArmor() { return armor; }
    public CharacterType getCharacterType() { return characterType; }
    public ArrayList<Skill> getSkills() {
        return skills;
    }



    // setter
    public void setName(String name) { this.name = name; }
    public void setLifePoints(int lifePoints) { this.lifePoints = lifePoints; }
    public void setStrenght(int strenght) { this.strenght = strenght; }
    public void setDodgeChance(double dodgeChance) { this.dodgeChance = dodgeChance; }
    public void setArmor(double armor) { this.armor = armor; }
    public void setCharacterType(CharacterType characterType) { this.characterType = characterType; }


    public Character setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
        return this;
    }

    // metodi
    public void attack(Character target) {
        Random random = new Random();
        // 1) seleziono randomicamente uno degli attacchi
        int randomIndex = random.nextInt(5);
        Skill chosenSkill = skills.get(randomIndex);
        // 2) calcolo la probabilità che l'attacco vada a segno
        double probability = chosenSkill.getHitChance() * target.getDodgeChance();
        double randomChoice = Math.random();
        if (randomChoice <= probability)  {
            // l'attacco è andato a segno
            int damage = (int) (chosenSkill.getDamage() * target.getArmor());
            target.setLifePoints(target.getLifePoints() - damage);
            System.out.println(this.name + " hit " + target.getName() + " with " + chosenSkill.getName() + " and deal " + damage + " damage");
        }
        else {
            System.out.println("Missed!");
        }
    }
}
