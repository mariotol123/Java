package ExerciseByTutor;

public enum CharacterType {

    HUMAN("people who live on Earth"),
    SAIYAN("people from Vegeta Planet"),
    NAMECCIANO("green people from Namecc"),
    ALIEN("some piece of shit like Freezer"),
    CYBORG("robots created by Dr. Gero"),
    DEMON("this little freak Majin Bu");

    private final String description;

    CharacterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
