/*
Joel Avery 
Module 4 Assignment
04/01/23
CSD-405
*/

/**

This program receives user input of integers and adds them to an ArrayList until a value of 0 is entered.
It then finds and returns the largest value in the ArrayList.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class JoelArrayListTest {

public static void main(String[] args) {
// create an ArrayList to hold the integers entered by the user
ArrayList<Integer> integerList = new ArrayList<Integer>();


// create a Scanner object to receive user input
Scanner input = new Scanner(System.in);

// prompt the user to enter integers, add them to the ArrayList until 0 is entered
System.out.println("Enter integers (0 to quit): ");
int num = input.nextInt();
while (num != 0) {
  integerList.add(num);
  num = input.nextInt();
}

// call the max method to find and display the largest value in the ArrayList
int largest = max(integerList);
System.out.println("The largest value in the ArrayList is: " + largest);
}

public static Integer max(ArrayList<Integer> list) {
// if the ArrayList is empty, return 0
if (list.size() == 0) {
return 0;
}


// initialize a variable to hold the largest value in the ArrayList
int max = list.get(0);

// loop through the ArrayList to find the largest value
for (int i = 1; i < list.size(); i++) {
  if (list.get(i) > max) {
    max = list.get(i);
  }
}

// return the largest value
return max;
}
}