/*
*Joel Avery 
*CSD-405
Module 5 Assignment Program 2
*04/08/2023
*/

import java.util.Scanner; 

public class CreateFile {    
    public static void main(String[] args) throws java.io.IOException {
        //creates instance of java.io.File class named file attempting 
        //create a new file if it does not exist. 
        java.io.File file = new java.io.File("data.file"); 
        if (file.exists()){
            System.out.println("File already Exists, Ending Program");
            System.exit(1); 
        }
        //Create the file using Print writer
        java.io.PrintWriter output = new java.io.PrintWriter(file); 
        
        //Writing 10 randomly generated numbers to the file. 
        for (int i =0; i<=10; i++){
            int number = (int)(Math.random() * 100); 
            output.print(number + " ");
        }
        
        //Close the file
        output.close(); 
        
        //Creating a Scanner for the file
        Scanner input = new Scanner(file); 
        
        //read data from the file using hasNext() and display it 
        while (input.hasNext()) {
           String temp = input.next(); 
           System.out.print(temp + " ");
            
        }
        
    }
    
}
