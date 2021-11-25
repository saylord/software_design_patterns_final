package factory.products;

import bridge.interfaces.ILine;

public interface IHero {

    int getHP();
    int getMana();
    int getDamage();
    int getStrength();
    int getAgility();
    int getIntelligence();
    int getSpeed();
    int getMoney();

    void setHP(int HP);
    void setMana(int mana);
    void setDamage(int damage);
    void setStrength(int strength);
    void setAgility(int agility);
    void setIntelligence(int intelligence);
    void setSpeed(int speed);
    void setMoney(int money);

    void goTop();
    void goMid();
    void goBottom();
    void goHome();
    void setLine(ILine line);
}
