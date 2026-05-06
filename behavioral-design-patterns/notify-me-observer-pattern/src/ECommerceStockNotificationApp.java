import Observable.IphoneProductObservable;
import Observable.StockAvailabilityObservable;

import Observer.EmailNotificationObserver;
import Observer.PushNotificationObserver;
import Observer.StockNotificationObserver;

// Client Code

public class ECommerceStockNotificationApp {

    public static void main(String[] args) {

        System.out.println(
                "###### E-commerce Store - Stock Notification Demo ######"
        );

        // Create Product
        StockAvailabilityObservable iphoneProduct =
                new IphoneProductObservable(
                        "ip15",
                        "iphone 15",
                        1250,
                        10
                );

        // Create Observers
        StockNotificationObserver johnPush =
                new PushNotificationObserver(
                        "John123",
                        "JohnDeviceP1"
                );

        StockNotificationObserver katyPush =
                new PushNotificationObserver(
                        "Katy678",
                        "KatyDeviceP2"
                );

        StockNotificationObserver janeEmail =
                new EmailNotificationObserver(
                        "Jane783",
                        "jane783@gmail.com"
                );

        StockNotificationObserver georgeEmail =
                new EmailNotificationObserver(
                        "George993",
                        "george993@gmail.com"
                );

        // Black Friday Sale
        iphoneProduct.purchase(10);

        // Product out of stock
        boolean success = iphoneProduct.purchase(1);

        if (!success) {

            iphoneProduct.addStockObserver(johnPush);
            iphoneProduct.addStockObserver(katyPush);
            iphoneProduct.addStockObserver(janeEmail);
            iphoneProduct.addStockObserver(georgeEmail);
        }

        // Restock
        iphoneProduct.restock(20);

        // Users purchase
        iphoneProduct.purchase(1);
        iphoneProduct.purchase(1);

        // Unsubscribe users
        iphoneProduct.removeStockObserver(johnPush);
        iphoneProduct.removeStockObserver(katyPush);

        // NYE Sale
        iphoneProduct.purchase(18);

        iphoneProduct.restock(5);

        iphoneProduct.purchase(1);
        iphoneProduct.purchase(1);

        // Remove remaining users
        iphoneProduct.removeStockObserver(janeEmail);
        iphoneProduct.removeStockObserver(georgeEmail);
    }
}