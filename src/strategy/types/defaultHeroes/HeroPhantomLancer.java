package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityMedium;

public class HeroPhantomLancer extends Hero {
    public HeroPhantomLancer() {
        super(new HeroAttributeAgility(), new HeroComplexityMedium(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Phantom Lancer");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Phantom Lancer.");
    }

    @Override
    public void response() {
        System.out.println("Phantom Lancer's response: 'For home. For peace.'");
    }
}
