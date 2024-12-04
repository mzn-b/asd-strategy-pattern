package GameCharacter;

public class GameCharacter {
    private String name;

    // TODO: Add strategy interface fields

    public GameCharacter(String name) {
        this.name = name;
        // TODO: Assign strategy via constructor
    }

    public void performAttack() {
        System.out.println("Basic attack"); // TODO: Delegate attack behavior to the attack strategy
    }

    public void performDefend() {
        System.out.println("Basic defense"); // TODO: Delegate defend behavior to the defend strategy
    }

    // TODO: Implement the rest of the character class according to the Strategy Pattern (setter for the Strategy)
}
