package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeIntelligence;
import strategy.filters.HeroComplexityLow;

public class HeroLich extends Hero {
    public HeroLich() {
        super(new HeroAttributeIntelligence(), new HeroComplexityLow(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Lich");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Lich.");
    }

    @Override
    public void response() {
        System.out.println("Lich's response: 'Beneath my warm exterior…permafrost.'");
    }
}
