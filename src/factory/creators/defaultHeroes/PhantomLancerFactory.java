package factory.creators.defaultHeroes;

import factory.creators.HeroFactory;
import factory.products.defaultHeroes.PhantomLancerHero;

public class PhantomLancerFactory extends HeroFactory {
    @Override
    protected PhantomLancerHero createHero() {
        return new PhantomLancerHero();
    }
}
