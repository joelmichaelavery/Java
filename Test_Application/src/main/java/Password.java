/*
Joel Avery 
CSD 320 Programming with Java
Module 7
Module 7 Assignment 
02/09/2023
*/

//This code takes user input and verifies it against the requirements for an 
//acceptable password. 

import java.util.Scanner;//imports the scanner class

public class Password { //class name, public.
    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);//instance of scanner class
        //Outputs for the user to enter a password and the requirements. 
        System.out.println("Enter a password it must have:");
        System.out.println("at least 8 charachters");
        System.out.println("at least one digit");
        System.out.println("at least one letter");
        System.out.println("at least one Uppercase letter"); 
        System.out.println("at least one lowercase letter: "); 
        System.out.println(); //Buffer line to make readability easier. 
     
        
        String password = input.next(); //takes the next input and stores as a declared variable password. 
        passwordVerification(password); //calls the method passwordVerification and uses the input from the user as the argument that is passed in. 
    }
    public static void passwordVerification(String password){ //method signature with name, and String parameter password
        int lengthOfPassword = password.length(); //parameter declared and initialized to hold the length of the password entered. 
        boolean hasDigit; //boolean variable to check for a digit
        boolean hasChar; //boolean variable to check for a char
        boolean isUpper; //boolean variable to check if an uppercase letter
        boolean isLower; //boolean variable to check if a lowercase letter
        
        //checks if length of the password is at least 8 charachters. 
        if (lengthOfPassword >= 8){
            if (hasDigit = password.matches(".*\\d.*")) {//checks to see if there is a digit in the password using matches function. 
                if (hasChar = password.matches(".*[a-zA-Z].*")){//checks to see if there is a char in the password. 
                    if (isUpper = password.matches(".*[A-Z].*")){ //checks to see if there is an uppercase in the password.                         
                        if (isLower = password.matches(".*[a-z].*")){//checks to see if there is a lowercase letter in the password. These are nested loops so one is checked if the other is good.                            
                            System.out.println("Password is valid!"); //output if password is valid
                        }
                        else{
                            System.out.println("Password Invalid, no lowercase letters included. "); //output if no lowercase letters are included. 
                        }
                    }
                    else{
                        System.out.println("Password Invalid, no Uppercase letters included. "); //output if no uppercase letters are in password. 
                    }
                }
                else {
                    System.out.println("Password Invalid, no letters included. "); //outputs if no letters are included in password. 
                }
            }
            
        
            else{   
                System.out.println("Password Invalid, no digits included."); //outputs if no digit included in password. 
            }
        }
        else {
            System.out.println("Password Invalid fewer than eight characters"); //output if password is fewer than eight characters. 
        }
        
        }
       
    }

