package strategy.types;

import strategy.bases.Hero;
import strategy.filters.HeroAttackTypeRanged;
import strategy.filters.HeroAttributeIntelligence;
import strategy.filters.HeroComplexityHigh;

public class HeroInvoker extends Hero {
    public HeroInvoker() {
        super(new HeroAttributeIntelligence(), new HeroComplexityHigh(), new HeroAttackTypeRanged());
    }

    @Override
    public void getHeroName() {
        System.out.print("Invoker");
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Invoker.");
    }

    @Override
    public void response() {
        System.out.println("Invoker's response: 'Knowledge is power!'");
    }
}
