package SOLID_Principles.open_closed_principle;

public class EmailNotification implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        // use JavaEmailSenderApi
    }
}
