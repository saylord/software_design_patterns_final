package strategy.types;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeAgility;
import strategy.filters.HeroComplexityMedium;

public class HeroTrollWarlord extends Hero {
    public HeroTrollWarlord() {
        super(new HeroAttributeAgility(), new HeroComplexityMedium(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Troll Warlord");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Troll Warlord.");
    }

    @Override
    public void response() {
        System.out.println("Troll Warlord's response: 'I live to fight.'");
    }
}
