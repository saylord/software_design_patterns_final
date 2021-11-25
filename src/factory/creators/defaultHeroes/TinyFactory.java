package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.TinyHero;

public class TinyFactory extends HeroFactory {
    @Override
    protected TinyHero createHero() {
        return new TinyHero();
    }
}
