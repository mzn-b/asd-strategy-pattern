package GameCharacter;

public class GameCharacter {
    private String name;
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    public GameCharacter(String name, AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        defendStrategy.defend();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefendStrategy(DefendStrategy defendStrategy) {
        this.defendStrategy = defendStrategy;
    }
}
