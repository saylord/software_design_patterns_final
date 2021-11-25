package strategy.filters;

import strategy.interfaces.IHeroAttributeBehaviour;

public class HeroAttributeStrength implements IHeroAttributeBehaviour {
    @Override
    public void attribute() {
        System.out.println("Attribute: Strength.");
    }
}
