package Main;

import GameCharacter.*;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an "AggressiveAttack" Strategy (implementing the AttackStrategy Interface) and assign it to the warrior
        // TODO: Create a "ShieldDefense" Strategy (implementing the DefendStrategy Interface) and assign it to the warrior
        GameCharacter warrior = new GameCharacter("Olaf");
        warrior.performAttack(); // Should result in an aggressive attack when done
        warrior.performDefend(); // Should result in a shield defense when done

        // TODO: Create a "SpellAttack" Strategy (implementing the AttackStrategy Interface) and assign it to the mage
        // TODO: Create a "MagicBarrierDefense" Strategy (implementing the DefendStrategy Interface) and assign it to the mage
        GameCharacter mage = new GameCharacter("Merlin");
        mage.performAttack(); // Should result in a spell attack when done
        mage.performDefend(); // Should result in a magic barrier defense when done
    }
}
