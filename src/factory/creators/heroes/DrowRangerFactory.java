package factory.creators.heroes;

import factory.creators.HeroFactory;
import factory.products.heroes.DrowRangerHero;

public class DrowRangerFactory extends HeroFactory {
    @Override
    protected DrowRangerHero createHero() {
        return new DrowRangerHero();
    }
}
