package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeIntelligence;
import strategy.filters.HeroComplexityLow;

public class HeroDazzle extends Hero {
    public HeroDazzle() {
        super(new HeroAttributeIntelligence(), new HeroComplexityLow(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Dazzle");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Dazzle.");
    }

    @Override
    public void response() {
        System.out.println("Dazzle's response: 'I've seen the blinding darkness at the center of all light.'");
    }
}
