package observer.observables;

import observer.interfaces.IObservable;
import observer.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class GameSystem implements IObservable {
    private List<String> radiantNotifications = new ArrayList<>();
    private List<String> direNotifications = new ArrayList<>();
    private List<IObserver> radiantHeroes = new ArrayList<>();
    private List<IObserver> direHeroes = new ArrayList<>();

    public void addRadiantNotification(String notification) {
        this.radiantNotifications.add(notification);
        notifyAllRadiantHeroes();
    }

    public void addDireNotification(String notification) {
        this.direNotifications.add(notification);
        notifyAllDireHeroes();
    }

    public void removeRadiantNotification(String notification) {
        this.radiantNotifications.remove(notification);
    }

    public void removeDireNotification(String notification) {
        this.direNotifications.remove(notification);
    }

    @Override
    public void registerRadiantHero(IObserver hero) {
        this.radiantHeroes.add(hero);
    }

    @Override
    public void registerDireHero(IObserver hero) {
        this.direHeroes.add(hero);
    }

    @Override
    public void unregisterRadiantHero(IObserver hero) {
        this.radiantHeroes.remove(hero);
    }

    @Override
    public void unregisterDireHero(IObserver hero) {
        this.direHeroes.remove(hero);
    }

    @Override
    public void notifyAllRadiantHeroes() {
        for (IObserver hero : radiantHeroes) {
            hero.update(this.radiantNotifications);
        }
    }

    @Override
    public void notifyAllDireHeroes() {
        for (IObserver hero : direHeroes) {
            hero.update(this.direNotifications);
        }
    }
}
