package SOLID_Principles.single_responsibility_principle;

public class GenerateLoanInfoService {

    public void generate(String loanType){
        if(loanType.equalsIgnoreCase("Car")){
            // do something
        }
        else if(loanType.equalsIgnoreCase("HomeLoan")){
            // do something
        }
        else if(loanType.equalsIgnoreCase("Bike")){
            // do something
        }
    }
}
