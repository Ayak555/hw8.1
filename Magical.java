package players;

import boss.Boss;
import game.AbilityType;

import java.util.Random;

public class Magical extends Hero {

    public Magical(int health, int attack) {
        super(health, attack, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                Random random = new Random();
                int randomInt = random.nextInt(10);
                heroes[i].setAttack(heroes[i].getAttack() + randomInt);
            }
        } else {
            setAttack(getAttack() * 0);
        }


    }
}



