package factory.products.defaultHeroes;

import bridge.interfaces.ILine;
import factory.products.IHero;
import strategy.types.defaultHeroes.HeroLuna;

public class LunaHero extends HeroLuna implements IHero {
    int HP = 620;
    int mana = 351;
    int damage = 56;
    int strength = 21;
    int agility = 24;
    int intelligence = 23;
    int speed = 325;
    int money = 3000;

    ILine line;

    @Override
    public int getHP() {
        return this.HP;
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getAgility() {
        return this.agility;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public void goTop() {
        System.out.println("Luna goes to top.");
    }

    @Override
    public void goMid() {
        System.out.println("Luna goes mid.");
    }

    @Override
    public void goBottom() {
        System.out.println("Luna goes bottom.");
    }

    @Override
    public void goHome() {
        System.out.println("Luna goes home.");
    }

    @Override
    public void setLine(ILine line) {
        this.line = line;
    }


    public void setMoney(int money) {
        this.money = money;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
