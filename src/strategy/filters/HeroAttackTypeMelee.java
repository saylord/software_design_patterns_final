package strategy.filters;

import strategy.interfaces.IHeroAttackType;

public class HeroAttackTypeMelee implements IHeroAttackType {
    @Override
    public void attackType() {
        System.out.println("Attack type: Melee.");
    }
}
