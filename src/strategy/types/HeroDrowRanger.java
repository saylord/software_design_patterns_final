package strategy.types;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityLow;

public class HeroDrowRanger extends Hero {
    public HeroDrowRanger() {
        super(new HeroAttributeAgility(), new HeroComplexityLow(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Drow Ranger");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Drow Ranger.");
    }

    @Override
    public void response() {
        System.out.println("Drow Ranger's response: 'I go in silence.'");
    }
}
