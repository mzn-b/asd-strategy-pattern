package Strategies;

import GameCharacter.AttackStrategy;

public class AggressiveAttack implements AttackStrategy {
    @Override
    public void attack(){
        System.out.println("Aggressive attack");
    }
}
