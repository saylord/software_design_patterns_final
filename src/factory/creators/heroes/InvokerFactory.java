package factory.creators.heroes;

import factory.creators.HeroFactory;
import factory.products.heroes.InvokerHero;

public class InvokerFactory extends HeroFactory {
    @Override
    protected InvokerHero createHero() {
        return new InvokerHero();
    }
}
