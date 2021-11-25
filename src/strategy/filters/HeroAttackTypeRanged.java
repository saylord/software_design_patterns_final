package strategy.filters;

import strategy.interfaces.IHeroAttackType;

public class HeroAttackTypeRanged implements IHeroAttackType {
    @Override
    public void attackType() {
        System.out.println("Attack type: Ranged.");
    }
}
