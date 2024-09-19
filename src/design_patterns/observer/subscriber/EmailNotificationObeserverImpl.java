package design_patterns.observer.subscriber;

import design_patterns.observer.publisher.StockObserbable;

public class EmailNotificationObeserverImpl implements NotificationObserver {
    public String email;
    public StockObserbable publisher;

    public EmailNotificationObeserverImpl(String email, StockObserbable publisher){
        this.email = email;
        this.publisher = publisher;
    }

    @Override
    public void update() {
        this.sendMail(this.email,"Hurry up stock is available");
    }

    public void sendMail(String email,String message){
        System.out.println(email + message);
    }
}
