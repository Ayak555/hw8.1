package players;

import boss.Boss;
import game.AbilityType;
import game.GameEntity;


public class Hero extends GameEntity implements HavingSuperAbility {
    private AbilityType ability;

    public Hero(int health, int attack,
                AbilityType ability) {
        super(health, attack);
        this.setAbility(ability);
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
