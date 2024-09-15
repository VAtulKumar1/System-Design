package SOLID_Principles.single_responsibility_principle.open_closed_principle;

public class MobileNotification implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        // write logic using twillio sms api
    }
}
