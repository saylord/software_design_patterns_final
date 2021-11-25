package strategy.types;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeMelee;
import strategy.filters.HeroAttributeStrength;
import strategy.filters.HeroComplexityMedium;

public class HeroLegionCommander extends Hero {
    public HeroLegionCommander() {
        super(new HeroAttributeStrength(), new HeroComplexityMedium(), new HeroAttackTypeMelee());
    }

    @Override
    public void getHeroName() {
        System.out.print("Legion Commander");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Legion Commander.");
    }

    @Override
    public void response() {
        System.out.println("Legion Commander's response: 'Fight for your honor!'");
    }
}
