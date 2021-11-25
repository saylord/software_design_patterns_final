package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityHigh;

public class HeroArcWarden extends Hero {
    public HeroArcWarden() {
        super(new HeroAttributeAgility(), new HeroComplexityHigh(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Arc Warden");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Arc Warden.");
    }

    @Override
    public void response() {
        System.out.println("Arc Warden's response: 'The Self comes for you.'");
    }
}
