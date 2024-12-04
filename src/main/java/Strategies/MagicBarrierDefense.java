package Strategies;

import GameCharacter.DefendStrategy;

public class MagicBarrierDefense implements DefendStrategy {
    @Override
    public void defend() {
        System.out.println("Magic Barrier Defense");
    }
}
