package factory.creators.heroes;

import factory.creators.HeroFactory;
import factory.products.heroes.TrollWarlordHero;

public class TrollWarlordFactory extends HeroFactory {
    @Override
    protected TrollWarlordHero createHero() {
        return new TrollWarlordHero();
    }
}
