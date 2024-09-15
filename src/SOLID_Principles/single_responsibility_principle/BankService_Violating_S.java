package SOLID_Principles.single_responsibility_principle;

/*
Single responsiblity principle states that a clas should have
only one reason to change meaning single purpose

Class below has multiple reasons to change mentioned below
1- what if we want to print passbook as jpeg so printPassbook method needs
to be changed to handle the jpeg type print
2- what if we  want to generate loan info for the car loan this
method also needs to change
3- what if we want to sent otp to mobile also sendOtp method needs to handle
sendOtp to phone also
--- I think this these examples are enough to understand the S in solid
--- for the correct Implementation please check BankService_S
*/
public class BankService_Violating_S {
    public long deposit(long amount,String accountNo){
        //do something
        return 0;
    }

    public long withdraw(long amount,String accountNo){
        //do something
        return 0;
    }

    public void printPassbook(String fileType){
        if(fileType.equalsIgnoreCase("pdf")){
            //do something
        }
    }

    public void generateLoanInterestInfo(String loanType){
        if(loanType.equalsIgnoreCase("HomeLoan")){
            // do soemthing
        }
        else if(loanType.equalsIgnoreCase("personalLoan")){
            // do soemthing
        }
    }

    public void sendOtp(String medium){

        if(medium.equalsIgnoreCase("email")){
            //do something
        }

    }
}
