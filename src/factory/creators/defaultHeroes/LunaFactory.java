package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.LunaHero;

public class LunaFactory extends HeroFactory {
    @Override
    protected LunaHero createHero() {
        return new LunaHero();
    }
}
