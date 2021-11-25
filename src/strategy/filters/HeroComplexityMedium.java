package strategy.filters;

import strategy.interfaces.IHeroComplexityBehaviour;

public class HeroComplexityMedium implements IHeroComplexityBehaviour {
    @Override
    public void complexity() {
        System.out.println("Hero's level of complexity: Medium.");
    }
}
