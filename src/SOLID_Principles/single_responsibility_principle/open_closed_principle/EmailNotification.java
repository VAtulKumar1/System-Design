package SOLID_Principles.single_responsibility_principle.open_closed_principle;

public class EmailNotification implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        // use JavaEmailSenderApi
    }
}
