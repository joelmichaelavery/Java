/*
Joel Avery 
CSD 320
Module Nine Assignment

This program creates an array of 20 spaces. From here it loops through those
twenty spaces and inserts a random number each time the program is ran. After the 
array is filled with 20 integers, it prints the integers that the array contains
through a loop. From here it loops through the array and stores the max number and 
then outputs it. Next, it loops through the array again, and stores the minimum 
number. Then it outputs the minimum number. The next step is that it calculates 
the total and then divides by the length of the array for an average. The program then
outputs the average. Finally the program iterates through the array and calculates
the sum of the integers contained in the array. 
*/
public class ArraysTest {
    public static void main(String[] args) {
        
        int [] numbers = new int[20]; //creates a new array with 20 spaces for integers
        
        //for loop that assigns twenty random numbers to the array. 
        for (int i = 0; i < numbers.length; i++){//Iterates through the length of the list
            numbers[i] = (int) (Math.random()*100);//Uses the math.random function to put any numbers betweeen 0-99 and stores it in numbers[i]
        }
        
        //Output the array to show the charachters. 
        //Has a [ at the beginning and a ] at the end. 
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }        
        System.out.print("]");
        
       //Finds the max number and then outputs the maximum number
       int max = numbers[0];//initial value max starting with the first element in the array
       for (int i = 0; i < numbers.length; i++){//for loop that goes through the array 
           if(numbers[i] > max){ //checks if the current elememnt is greater than the max
               max = numbers[i]; //if it is greater a new max is stored. 
           }
       }
       System.out.println("\nThe maximum number is: " + max);//Prints the max value outside of the for loop with a new line
       
       //Finds the minimum number and then outputs the maximum number
       int min = numbers[0]; //initial value min starting with the first element in the array. 
       for (int i = 0; i < numbers.length; i++){//for loop that goes through the length of the array
           if (numbers[i] < min){//checks to see if the current element is less than the current min
               min = numbers[i]; //if it is lower it stores that position as the new minimum. 
           }
       }
       System.out.println("The minimum number is: " + min); 
       
       //Goes throught the array and finds out what the average is. 
       double avg = 0; //initializes a double variable avg to 0
       double total = 0; 
       for (int i = 0; i < numbers.length; i++){//iterates through the length of the array. 
           total += numbers[i]; //Shorthanded addition operation to add the current element to the variable total.            
       }
       avg = total/numbers.length;
       System.out.println("The average of the numbers in the array is " + avg);
       
       //Iterates through the array and finds the total then outputs the total.
       total = 0; //resets total to 0
       for (int i = 0; i < numbers.length; i++){//iterates through the length of the array. 
           total += numbers[i]; //Shorthanded addition operation to add the current element to the variable total.            
       }
       System.out.println("The sum of the numbers in the array is: " + total); //Outputs the total. 
    }
    
}
