package Strategies;

import GameCharacter.DefendStrategy;

public class ShieldDefense implements DefendStrategy {
    @Override
    public void defend() {
        System.out.println("Shield defense");
    }
}
