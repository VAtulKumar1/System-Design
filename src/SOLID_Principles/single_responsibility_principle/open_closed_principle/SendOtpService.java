package SOLID_Principles.single_responsibility_principle.open_closed_principle;
// open closed principle says that
/*
* open and closed principles says that a class is open for extension
* but closed for modification
* for example : what if we want send otp using whatsapp so the class
* so we need to design our classes such that clients can use the functionality of the class and
* are also able there own features
* -- this can be achived using Interfaces
* */
public class SendOtpService {

    public void sendOtp(String medium){
        if(medium.equalsIgnoreCase("email")){
            // use JavaMailSenderApi
        }
    }
}
