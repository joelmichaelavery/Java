/*
Joel Avery 
CSD 405
Module 6 Programming assignment
04/13/23
*/

/*
This is an abstract class that is called division with two variables, divisionName
and account number, also contains an abstract method called display and has a constructor 
for division name and account number, also added getters and setters for the variables 
since the class is abstract. 
*/

//Creating an abstract class called Division
public abstract class Division {
    //private fields 
    private String divisionName = null; 
    private String accountNumber = null; 
    
    //an abstract method display with no body in the class. 
    public abstract String display(); 
    
    //protected constructor for Division object with divisionName and accountNumber
    protected Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName; 
        this.accountNumber = accountNumber; 
    }
    
     //getter and setters methods for divisionName and accountNumber
    public String getDivisionName() {
        return divisionName; 
    }
    public String getAccountNumber() {
        return accountNumber; 
    }
    
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName; 
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber; 
    }
}
