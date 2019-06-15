package boss;

import game.GameEntity;

import java.util.Random;

public class Boss extends GameEntity {

    public Boss(int health, int attack) {
        super(health, attack);
    }

    //public int getAttack() {
        //int w = 1;
        //int v = 3;
        //int random1 = w + (int) (Math.random() * v);
        //setAttack(getAttack() * random1);
        //int at = getAttack() * random1;
       // return at;
    //}
}
