package players;

import boss.Boss;
import game.AbilityType;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {
        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (getHealth() > 0) {
            int random = 2 + (int) (Math.random() * 4);
            setAttack(getAttack() * random);
        } else {
            setAttack(getAttack()*0);
        }
    }
}
