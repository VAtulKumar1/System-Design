package SOLID_Principles.single_responsibility_principle;

public class SendOtpService {
    public void send(String medium){
        if(medium.equalsIgnoreCase("email")){
            // do something
        }
        else if(medium.equalsIgnoreCase("phone")){
            // do something
        }


    }
}
