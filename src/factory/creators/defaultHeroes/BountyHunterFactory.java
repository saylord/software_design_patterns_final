package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.BountyHunterHero;

public class BountyHunterFactory extends HeroFactory {
    @Override
    protected BountyHunterHero createHero() {
        return new BountyHunterHero();
    }
}
