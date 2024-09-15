package SOLID_Principles.single_responsibility_principle;

public class PrintPassbookService {

    public void print(String fileType){
        if(fileType.equalsIgnoreCase("pdf")){
            // do something
        }
        else if (fileType.equalsIgnoreCase("jpeg")){
            // do soemthing
        }
    }
}
