package observer.observers;

import observer.interfaces.IObserver;
import strategy.bases.Hero;

import java.util.List;

public class Dire implements IObserver {
    private Hero heroName;

    public Dire(Hero heroName) {
        this.heroName = heroName;
    }

    @Override
    public void update(List<String> notifications) {
        System.out.print("Dear ");
        this.heroName.getHeroName();
        System.out.print(", from Dire \n" + notifications + "\n");
    }
}
