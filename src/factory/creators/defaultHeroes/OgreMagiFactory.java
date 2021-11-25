package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.OgreMagiHero;

public class OgreMagiFactory extends HeroFactory {
    @Override
    protected OgreMagiHero createHero() {
        return new OgreMagiHero();
    }
}
