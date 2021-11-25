package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityLow;

public class HeroBountyHunter extends Hero {
    public HeroBountyHunter() {
        super(new HeroAttributeAgility(), new HeroComplexityLow(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Bounty Hunter");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Bounty Hunter.");
    }

    @Override
    public void response() {
        System.out.println("Bounty Hunter's response: 'Dead or alive, you're coming with me.'");
    }
}
