package factory.creators.heroes;

import factory.creators.HeroFactory;
import factory.products.heroes.LegionCommanderHero;

public class LegionCommanderFactory extends HeroFactory {
    @Override
    protected LegionCommanderHero createHero() {
        return new LegionCommanderHero();
    }
}
