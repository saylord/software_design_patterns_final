package factory.products.defaultHeroes;

import bridge.interfaces.ILine;
import factory.products.IHero;
import strategy.types.defaultHeroes.HeroArcWarden;

public class ArcWardenHero extends HeroArcWarden implements IHero {
    int HP = 640;
    int mana = 363;
    int damage = 57;
    int strength = 22;
    int agility = 20;
    int intelligence = 24;
    int speed = 285;
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
        System.out.println("Arc Warden goes to top.");
    }

    @Override
    public void goMid() {
        System.out.println("Arc Warden goes mid.");
    }

    @Override
    public void goBottom() {
        System.out.println("Arc Warden goes bottom.");
    }

    @Override
    public void goHome() {
        System.out.println("Arc Warden goes home.");
    }

    @Override
    public void setLine(ILine line) {
        this.line = line;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }
    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }
    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
