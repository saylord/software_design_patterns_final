package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.DazzleHero;

public class DazzleFactory extends HeroFactory {
    @Override
    protected DazzleHero createHero() {
        return new DazzleHero();
    }
}
