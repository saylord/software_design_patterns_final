package strategy.types.defaultHeroes;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeIntelligence;
import strategy.filters.HeroComplexityLow;

public class HeroOgreMagi extends Hero {
    public HeroOgreMagi() {
        super(new HeroAttributeIntelligence(), new HeroComplexityLow(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Ogre Magi");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Ogre Magi.");
    }

    @Override
    public void response() {
        System.out.println("Ogre Magi's response: 'Once is not enough. It's just as high as we can count.'");
    }
}
