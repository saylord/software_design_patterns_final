package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeStrength;
import strategy.filters.HeroComplexityLow;

public class HeroBristleback extends Hero {
    public HeroBristleback() {
        super(new HeroAttributeStrength(), new HeroComplexityLow(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Bristleback");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Bristleback.");
    }

    @Override
    public void response() {
        System.out.println("Bristleback's response: 'Time to mash some faces, I'd say.'");
    }
}
