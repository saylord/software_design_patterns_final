package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeStrength;
import strategy.filters.HeroComplexityMedium;

public class HeroTiny extends Hero {
    public HeroTiny() {
        super(new HeroAttributeStrength(), new HeroComplexityMedium(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Tiny");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Tiny.");
    }

    @Override
    public void response() {
        System.out.println("Tiny's response: 'Thus are mountains built!'");
    }
}
