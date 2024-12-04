package Strategies;

import GameCharacter.AttackStrategy;

public class SpellAttack implements AttackStrategy {
    @Override
    public void attack(){
        System.out.println("Spell attack");
    }
}
