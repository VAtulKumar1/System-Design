package SOLID_Principles.open_closed_principle;

public class MobileNotification implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        // write logic using twillio sms api
    }
}
