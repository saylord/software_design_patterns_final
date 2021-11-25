package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.BristlebackHero;

public class BristlebackFactory extends HeroFactory {
    @Override
    protected BristlebackHero createHero() {
        return new BristlebackHero();
    }
}
