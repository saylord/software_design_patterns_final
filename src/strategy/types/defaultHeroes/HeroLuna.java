package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityLow;

public class HeroLuna extends Hero {
    public HeroLuna() {
        super(new HeroAttributeAgility(), new HeroComplexityLow(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Luna");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Luna.");
    }

    @Override
    public void response() {
        System.out.println("Luna's response: 'In the service of Selemene.'");
    }
}
