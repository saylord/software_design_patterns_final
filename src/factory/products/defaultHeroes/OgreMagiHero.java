package factory.products.defaultHeroes;

import bridge.interfaces.ILine;
import factory.products.IHero;
import strategy.types.defaultHeroes.HeroOgreMagi;

public class OgreMagiHero extends HeroOgreMagi implements IHero {
    int HP = 660;
    int mana = 255;
    int damage = 55;
    int strength = 23;
    int agility = 14;
    int intelligence = 15;
    int speed = 290;
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
        System.out.println("Ogre Magi goes to top.");
    }

    @Override
    public void goMid() {
        System.out.println("Ogre Magi goes mid.");
    }

    @Override
    public void goBottom() {
        System.out.println("Ogre Magi goes bottom.");
    }

    @Override
    public void goHome() {
        System.out.println("Ogre Magi goes home.");
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
