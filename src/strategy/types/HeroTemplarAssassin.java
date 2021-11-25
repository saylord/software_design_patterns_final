package strategy.types;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityMedium;

public class HeroTemplarAssassin extends Hero {
    public HeroTemplarAssassin() {
        super(new HeroAttributeAgility(), new HeroComplexityMedium(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.println("Templar Assassin");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Templar Assassin.");
    }

    @Override
    public void response() {
        System.out.println("Templar Assassin's response: 'The mysteries cannot protect themselves'");
    }
}
