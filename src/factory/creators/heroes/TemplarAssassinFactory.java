package factory.creators.heroes;

import factory.creators.HeroFactory;
import factory.products.heroes.TemplarAssassinHero;

public class TemplarAssassinFactory extends HeroFactory {
    @Override
    protected TemplarAssassinHero createHero() {
        return new TemplarAssassinHero();
    }
}
