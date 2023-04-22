/*
Joel Avery 
CSD 405
Module 6 Programming assignment
04/13/23
*/

/*
This class Use Division is the driver class or the one that contains the main method
We create two instances of each concrete class, or four instances total. From here 
we create a new instance and implement the constructor with the data entered on 
each instance and then calls each one calls the display method to nicely output 
the information of the divisions. 
*/

public class UseDivision {
    public static void main(String[] args) {
        //Creates two instances of each of the two classes InternationalDivision and Domestic Division
        Division locationOne = new InternationalDivision("International Division", "123456", "Canada", "English");         
        Division locationTwo = new InternationalDivision("Global Sales Division", "001598", "Germany", "German");       
        Division locationThree = new DomesticDivision("North American Technology Center", "589756", "Missouri");
        Division locationFour = new DomesticDivision("North American Marketing", "561687", "New York"); 
        
        //each print statement calls the instance display method. 
        System.out.println(locationOne.display()); 
        System.out.println(locationTwo.display()); 
        System.out.println(locationThree.display()); 
        System.out.println(locationFour.display()); 
    }
    
}
