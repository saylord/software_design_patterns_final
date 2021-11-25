package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.ArcWardenHero;

public class ArcWardenFactory extends HeroFactory {
    @Override
    protected ArcWardenHero createHero() {
        return new ArcWardenHero();
    }
}
