/*
Joel Avery
CSD320 
Module Five Assignment
*/

/*
This program uses a while loop to display the addition operation  both in the 
smaller to larger order and then the larger to smaller order with the 
denominator being 3 through 99.  Ensure your application displays the 
mathematical results.
*/

import java.util.Scanner; //Import the Scanner method

public class LoopTest {
    public static void main(String[] args) {
        int i = 0; //create i variable and initialize to 0
        int numerator = 1; //create int variable numerator and set to 1
        double denominator = 3.0; //create double denominator and initialize to 3.0
        double sum = 0; //create double sum and initialize to 0. 
        
        //Create a while loop and when i is less than 100 the loop executes
        while (i < 100){
            //Outputs the numerator / denominator ex. 1/3.0
            System.out.print(numerator + "/" + denominator); 
            //Create a condition that if the denominator is less than 99, not 
            // to execute the + reason being so we don't get a + after 1/99.0 +
            if(denominator < 99){
                System.out.print(" + ");
                
            }
            double total = numerator / denominator; //create a total variable that holds the value numerator/denominator. 
            sum = sum + total; //adds the total and sum together, to continue adding the total to sum. 
            denominator = denominator + 2.0; //increments the denominator by 2 every time. 
            //if the denominator is greater than 99 print the sum
            if (denominator > 99){
                System.out.println(); //prints a new line
                System.out.println("Sum is " + sum + "\n"); //prints the sum amount
                break; //breaks the loop after the if condition is entered. 
                
            }
            i++;//increments i by one
        }
        
        i = 0;//new counter as I need to start from 0.  
        sum = 0; //Sum is intialized to zero That way we aren't adding to the old sum. 
        denominator = 99.0; //Denominator starts at 99 since we are going high to low. 
        
        //while loop entered for the second scenario true if i < 100
        while (i < 100){
            //Outputs the format we need 
            System.out.print(numerator + "/" + denominator);
            if(denominator > 3){ //if denominator is > 3, we print the plus so we dont get a plus after ex. 1/3.0 +
                System.out.print(" + ");
            }
            //stores the total as a double with the numerator divided by the denominator. 
            double total = numerator / denominator; 
            sum = sum + total; //adds sum and total to keep increasing the sum every time we get a new total. 
            denominator = denominator - 2.0; //decrement the denominator by 2 every time. 
            if (denominator < 3.0){//if the denominator is less than 3, we enter the condition and print the complete sum. 
                System.out.println();//prints a new line
                System.out.println("Sum is " + sum + "\n");//prints sum followed by a new line. 
                break; //breaks the while loop. 
                
            }
            i++;//increments i by 1. 
        }
    }
    
}
