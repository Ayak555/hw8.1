package game;

public class GameEntity {

    private int health;
    private int attack;

    public GameEntity(int health, int attack) {
        this.setHealth(health);
        this.setAttack(attack);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int putDamage(int damage){
        this.health = this.health - damage;
        return this.health;
    }
}
