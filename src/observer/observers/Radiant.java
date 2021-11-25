package observer.observers;

import observer.interfaces.IObserver;
import strategy.bases.Hero;

import java.util.List;

public class Radiant implements IObserver {
    private Hero heroName;

    public Radiant(Hero heroName) {
        this.heroName = heroName;
    }

    @Override
    public void update(List<String> notifications) {
        System.out.print("Dear ");
        this.heroName.getHeroName();
        System.out.print(", from Radiant \n" + notifications + "\n");
    }
}
