package Main;

import GameCharacter.*;
import Strategies.AggressiveAttack;
import Strategies.MagicBarrierDefense;
import Strategies.ShieldDefense;
import Strategies.SpellAttack;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter("Olaf", new AggressiveAttack(), new ShieldDefense());
        warrior.performAttack(); // Should result in an aggressive attack when done
        warrior.performDefend(); // Should result in a shield defense when done

        GameCharacter mage = new GameCharacter("Merlin", new SpellAttack(), new MagicBarrierDefense());
        mage.performAttack(); // Should result in a spell attack when done
        mage.performDefend(); // Should result in a magic barrier defense when done
    }
}
