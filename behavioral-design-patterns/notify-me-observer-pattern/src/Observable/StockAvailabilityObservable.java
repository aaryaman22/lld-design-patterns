package Observable;

import Observer.StockNotificationObserver;

public interface StockAvailabilityObservable {

    void addStockObserver(StockNotificationObserver observer);

    void removeStockObserver(StockNotificationObserver observer);

    void notifyStockObservers();

    boolean purchase(int quantity);

    void restock(int quantity);
}