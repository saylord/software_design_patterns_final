package observer.interfaces;

public interface IObservable {
    void registerRadiantHero(IObserver hero);
    void registerDireHero(IObserver hero);
    void unregisterRadiantHero(IObserver hero);
    void unregisterDireHero(IObserver hero);
    void notifyAllRadiantHeroes();
    void notifyAllDireHeroes();
}
