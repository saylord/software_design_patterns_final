package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.LichHero;

public class LichFactory extends HeroFactory {
    @Override
    protected LichHero createHero() {
        return new LichHero();
    }
}
