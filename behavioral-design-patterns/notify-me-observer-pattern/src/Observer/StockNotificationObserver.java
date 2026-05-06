package Observer;

// Observer interface

public interface StockNotificationObserver {

    void update();

    String getNotificationMethod();

    String getUserId();
}