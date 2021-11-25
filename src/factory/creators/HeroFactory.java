package factory.creators;

import factory.products.IHero;

public abstract class HeroFactory {

    public IHero getHero() {
        IHero hero = createHero();

        System.out.println("HP: " + hero.getHP());
        System.out.println("Mana: " + hero.getMana());
        System.out.println("Damage: " + hero.getDamage());
        System.out.println("Strength: " + hero.getStrength());
        System.out.println("Agility: " + hero.getAgility());
        System.out.println("Intelligence: " + hero.getIntelligence());
        System.out.println("Speed: " + hero.getSpeed());


        return hero;
    }

    protected abstract IHero createHero();
}
