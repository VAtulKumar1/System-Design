package design_patterns.observer.publisher;

import design_patterns.observer.subscriber.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockPubliserImpl implements StockObserbable {

    public List<NotificationObserver> subscribers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void register(NotificationObserver subscriber) {
        this.subscribers.add(subscriber);

    }

    @Override
    public void unregister(NotificationObserver subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void publish() {
        for (NotificationObserver subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void setData(int quantity) {
        if(this.getData() == 0){
            this.publish();
        }
        this.stockCount += quantity;
    }

    @Override
    public int getData() {
        return this.stockCount;
    }
}
