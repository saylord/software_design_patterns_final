package strategy.filters;

import strategy.interfaces.IHeroAttributeBehaviour;

public class HeroAttributeIntelligence implements IHeroAttributeBehaviour {
    @Override
    public void attribute() {
        System.out.println("Attribute: Intelligence.");
    }
}
