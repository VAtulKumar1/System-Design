package design_patterns.observer.publisher;

import design_patterns.observer.subscriber.NotificationObserver;

public interface StockObserbable {
    public void register(NotificationObserver subscriber);
    public void unregister(NotificationObserver subscriber);
    public void publish();
    public void setData(int stockCount);
    public int getData();


}
