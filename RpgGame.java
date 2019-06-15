package game;

import boss.Boss;
import players.*;

import javax.crypto.CipherOutputStream;

public class RpgGame {

    public static void startGame() {
        Boss boss = new Boss(400, 30);

        Warrior warrior = new Warrior(100, 10);
        Medic medic = new Medic(100, 10);
        Hunter hunter = new Hunter(100, 10);
        Magical magical = new Magical(100, 10);

        Hero[] heroes = {warrior, medic, hunter, magical};

        showStatistics(heroes, boss);
        while (!isFinished(heroes, boss)) {
            round(heroes, boss);
        }
    }

    private static void round(Hero[] heroes, Boss boss) {
        bossBits(heroes, boss);
        heroesBit(heroes, boss);
        applyAbilities(heroes, boss);
        showStatistics(heroes, boss);
    }

    private static void applyAbilities(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].useAbility(heroes, boss);
        }
    }

    private static boolean isFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            return true;
        }
        boolean allHeroesDied = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDied = false;
                break;
            }
        }
        return allHeroesDied;
    }

    private static void bossBits(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            int random1 = 1 + (int) (Math.random() * 3);
            int bossAttack = boss.getAttack() * random1;
            heroes[i].putDamage(bossAttack);
            System.out.println("Boss attacks hero "
                    + heroes[i].getClass().getSimpleName()
                    + ": " + bossAttack);
        }
    }

    private static void heroesBit(Hero[] heroes, Boss boss) {

        for (int i = 0; i < heroes.length; i++) {
            int heroAttack = heroes[i].getAttack();
            boss.putDamage(heroAttack);
            System.out.println("Hero "
                    + heroes[i].getClass().getSimpleName()
                    + " attacks Boss: " + heroAttack);
        }
    }

    private static void showStatistics(Hero[] heroes, Boss boss) {
        System.out.println("______________________");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero "
                    + heroes[i].getClass().getSimpleName() +
                    " current health: " + heroes[i].getHealth());
        }
        System.out.println("Boss current health: " + boss.getHealth());
        System.out.println("______________________");
    }

}
