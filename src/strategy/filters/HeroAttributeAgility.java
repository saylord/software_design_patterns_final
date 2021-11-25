package strategy.filters;

import strategy.interfaces.IHeroAttributeBehaviour;

public class HeroAttributeAgility implements IHeroAttributeBehaviour {
    @Override
    public void attribute() {
        System.out.println("Attribute: Agility.");
    }
}
