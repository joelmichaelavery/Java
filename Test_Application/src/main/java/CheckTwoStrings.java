/*Joel Avery
  CSD 320
  Module Four Assignment
  01/18/2023
*/

/*
Program will ask user to enter an input, and then it will ask the user to enter
another input. From here, the program will compare both strings, and then 
see if either string contains a substring. 
*/

import java.util.Scanner; 

public class CheckTwoStrings {
    public static void main(String[] args) {
        //Creates an instance of the scanner class for input
        Scanner input = new Scanner(System.in); 
        
        //Prints asking for string, and saves as string1
        System.out.println("Enter a string to compare: "); 
        String string1 = input.nextLine(); 
        
        //Prints asking for another string and saves as string2
        System.out.println("Enter a second string to compare: ");
        String string2 = input.nextLine(); 
        
        //creates contains1 and see if string 2 is found in string 1
        boolean contains1 = string1.contains(string2); 
        
        //creates contains2 and sees if string 1 is found in string 2
        boolean contains2 = string2.contains(string1); 
        
        //conditionals to see if either statement is true along with an else. 
        if (contains1 == true){
            System.out.println("String 2 is a substring of String 1. ");
        }
        else if (contains2 == true){
            System.out.println("String 1 is a substring of String 2. ");
        }
        else{
            System.out.println("The strings entered are not found in one another. ");
        }
        
        
    }
    
}
