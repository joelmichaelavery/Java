/*
Joel Avery 
CSD 405
Module 6 Programming assignment
04/13/23
*/

/*
This is an public concrete class called Domestic Division that inherits or extends
Division, it adds the field stateOfDivision. It creates a cosntructor that uses
the Division fields and adds its own to it. It also overrides the abstract mehtod 
display and makes it public, and uses the getter methods to output the infomration
nicely. 
*/

public class DomesticDivision extends Division {
    private String stateOfDivision = null; 
    
  //This method shows everything and displays with all the fields. 
    @Override
    public String display() {
       return "Division name: " + getDivisionName() + "\n" + 
               "Account number: " + getAccountNumber() + "\n" +
               "State Division is located: " + stateOfDivision + "\n"; 
       
    }
               
    public DomesticDivision(String divisionName, String accountNumber, String stateOfDivision){
        super(divisionName, accountNumber); 
        this.stateOfDivision = stateOfDivision; 
    }
    
    
}
