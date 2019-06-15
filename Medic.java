package players;

import boss.Boss;
import game.AbilityType;

public class Medic extends Hero {

    public Medic(int health, int attack) {
        super(health, attack, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (getHealth() > 0) {
        for (int i = 0; i < heroes.length; i++) {
            int currentHealth = heroes[i].getHealth();
            heroes[i].setHealth(currentHealth + 15);
            //heroes[i].setHealth(heroes[i].getHealth()+15);
        }
        } else {
            setAttack(getAttack() * 0);
        }
    }
}
