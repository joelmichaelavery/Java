/*
Joel Avery 
CSD 405
Module 6 Programming assignment
04/13/23
*/

/*
this is a concrete class called International Division that extends or inherits 
Division, it adds additional fields country and language spoken for the division
It has a constructor that requires all fields to be implemented in International division
it also then overrides the abstract method display, makes it public and uses the 
getter methods to nicely output the Division information. 
*/

public class InternationalDivision  extends Division{
    private String country = null; 
    private String languageSpoken = null; 
    
    
    //constructor that requires all fields to be implemented. 
    public InternationalDivision(String divisionName, String accountNumber, String country, String languageSpoken){
        super(divisionName, accountNumber); //Calls the constructor of the parent abstract class
        this.country = country; 
        this.languageSpoken = languageSpoken; 
    }
    
    //This method shows everything and displays with all the fields. 
    @Override
    public String display() {
       return "Division name: " + getDivisionName() + "\n" + 
               "Account number: " + getAccountNumber() + "\n" + 
               "Country Division is located: " + country + "\n" + 
               "Language Spoken: " + languageSpoken + "\n"; 
    }
}

