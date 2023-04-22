/*
* Joel Avery 
* CSD-405
*Module 5 Program 1
*04/08/23
*/

/*
This program creates an Array list, and fills it with 10 strings. It thens 
loops through the collection and then prints each statement on a new line. Then 
the user is prompted on which element they would like to see again 1-10. 
In the try catch block, we are looking to see if the element is in bounds, if 
not an exception is thrown. Otherwise it will print the statement. Auto boxing/
unboxing is used when using the user input string. 
*/

import java.util.ArrayList; //import Array List
import java.util.Scanner; //import the Scanner Class. 
public class TestException {
    public static void main(String[] args) {
        // TODO code application logic here
        //Creates a new instance of the Scanner class for input. 
        Scanner input = new Scanner(System.in); 
        ArrayList<String> list = new ArrayList(); 
        //Add some strings in the list minimum of 10. 
        list.add("Joel likes Java. "); //#1
        list.add("Joel is liking OOP. "); //#2
        list.add("The best part about Java is the portability."); //#3
        list.add("Exception Handling makes programs more effective."); //#4
        list.add("Programming is Fun!"); //#5
        list.add("Hello World!"); //#6
        list.add("I like creating anything I want. "); //#7
        list.add("I also like the Array Lists ability to change. ");//#8
        list.add("I wonder if Java pays more than python?"); //#9
        list.add("I am running out of things to add for strings"); //#10
        
        //for each loop to run through the Array collection. 
        for (String s: list){
            System.out.println(s); 
        }
        
        //Ask the user which element they would like to see again. 
        System.out.println("\nWhich element would you like to see again? (Options are 1-10) ");
        String element = input.nextLine(); 
        
        // Attempt to retrieve the element and print it 
        //Here using Boxing and Unboxing when working with the user input from above. 
        try {
            int index = Integer.parseInt(element) - 1; // subtract 1 to match ArrayList index
            String result = list.get(index);
            System.out.println("The element you chose is: " + result);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }
        
        
               
    }
    
}
