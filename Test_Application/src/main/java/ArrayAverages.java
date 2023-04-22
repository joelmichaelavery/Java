/* 
Joel Avery 
Module 10 Assignment
CSD 320
*/

/*
This program has four overloaded methods that retun an average of an array, 
There is different headers for the different arrays with different types and 
sizes. Neatly outputs the averages and the original array elements. 
*/

import java.util.Arrays; 
public class ArrayAverages {
    
    public static void main(String[] args) {
        //New Array1 
        short[] Array1 = new short [20];//initialize a reference of array1 as a new short 20 shorts long
        System.out.print("The original values of the short Array are ");
        System.out.print("[");//prints an outer bracket
        for (int i = 0; i < Array1.length; i++){ //loops through the array and by the length and 
            Array1[i] = (short)(Math.random() * 100); //adds a random number 0-99 to each index 
            System.out.print(Array1[i] + " "); //format to help the print nicer.
        }
        System.out.print("]"); //prints a closing bracket
        System.out.println("\nThe average of the short array is " + average(Array1)); // Prints the average of the array with the call to the method
        
        //New Array2
        int[] Array2 = new int [36]; //initializes a reference of array2 as a new int 36 ints long. 
        System.out.print("\nThe original values of the Int Array are ");
        System.out.print("["); //Prints an opening bracket
        for (int i = 0; i < Array2.length; i++){ //loops over the list of the Array length. 
            Array2[i] = (int)(Math.random() * 10000); // Inserts Random numberin each index type cast to int
            System.out.print(Array2[i] + " ");//Prints each array index over the iterations. 
        }
        System.out.print("]");//Prints a closing bracket
        System.out.println("\nThe average of the int array is " + average(Array2)); //Prints the average of the array with the call method to the int average method. 
        
        
        //New Array3
        long [] Array3 = new long [55]; //initialize a reference of array 3 as a new array 55 longs long. 
        System.out.print("\nThe original values of the long Array are ");
        System.out.print("[");//prints an outer bracket
        for (int i = 0; i < Array3.length; i++){ //loops through the array by the length
            Array3[i] = (long)(Math.random() * 1000000000); //Inserts random numbers in each index type cast to long
            System.out.print(Array3[i] + " "); //Prints each array index over the iterations.             
        }
        System.out.print("]");//Prints a closing bracket
        System.out.println("\nThe average of the long array is " + average(Array3)); //Pritns the average of the array with a call to the method for long array method. 
        
        //New Array4
        double [] Array4 = new double [28]; //initialize a reference of the new array in a double that has 28 doubles
        System.out.print("\nThe original values of the double Array are ");
        System.out.print("{");
        for (int i = 0; i < Array4.length; i++){
            Array4[i] = (double)(Math.random() * 100); //Inserts random numbers from 0-99 in each index type cast to double
            System.out.printf("%.2f ", Array4[i]);//Prints each array index over the iterations to two decimals. 
        }
        System.out.println("}");
        System.out.println("\nThe average of the double array is " + average(Array4)); //Prints the average of the array with a call to the method for double array. 
    }    
        
   
    
    //overloaded method for short arrays.
    public static short average(short[] array){
        short average = 0;//initialize short variable average to 0
        short total = 0; //intitialize short variable total to 0 
        for (short i = 0; i < array.length; i++){ //iterates over the length of the array
            total += array[i];  //adds the total on every iteration of the index. 
        } 
        average = (short)(total/array.length);//type casting to return average as a short.  
        return average; //return average
    }
    
    //overloaded method for int arrays.
    public static int average(int[] array){
        int average = 0; //initialize int average to 0
        int total = 0; //initialize int total to 0 
        for (int i = 0; i < array.length; i++){ //iterate over the length of the array
            total += array[i]; //adds the current position of the array to the total variable. 
        }
        average = (total/array.length); //calculates the average and stores to average variable
        return average; //returns average. 
    }
    
    //overloaded method for long arrays.
    public static long average(long[] array){
        long average = 0; //initialize long average to 0
        long total = 0; //initiallize long total to 0 
        for (int i = 0; i < array.length; i++){ //iterate over the length of the array
            total += array[i]; //adds the current position of the array to the total variable. 
        }
        average = (long)(total/array.length); //calculates and type casts to long to find the average. 
        return average; //returns average. 
    }
    
    //overloaded method for double arrays. 
       public static double average(double[] doubleArr){
        double sum = 0; //Declare the sum as a double
        for (int i = 0; i < doubleArr.length; i++){
            sum += doubleArr[i]; //Adds the values of the double array to the sum
        }
        return (double)(Math.round((sum / doubleArr.length)*100.00)/100.00); //Return the average of the array rounded to two decimal places. 
    }
}


