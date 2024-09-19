package design_patterns.observer;

import design_patterns.observer.publisher.IphoneStockPubliserImpl;
import design_patterns.observer.publisher.StockObserbable;
import design_patterns.observer.subscriber.NotificationObserver;
import design_patterns.observer.subscriber.EmailNotificationObeserverImpl;

public class Store {

    public static void main(String[] args) {
        StockObserbable publisher= new IphoneStockPubliserImpl();

        NotificationObserver subscriber1 = new EmailNotificationObeserverImpl("ak@gmail.com",publisher);
        NotificationObserver subscriber2 = new EmailNotificationObeserverImpl("vk@gmail.com",publisher);
        NotificationObserver subscriber3 = new EmailNotificationObeserverImpl("sk@gmail.com",publisher);

        publisher.register(subscriber1);
        publisher.register(subscriber2);
        publisher.register(subscriber3);
        publisher.setData(0);
        publisher.setData(200);
        publisher.setData(0);
        publisher.setData(300);




    }
}
