package observer.middle.interfaces;

public interface Subject {
    void registerObserver(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
