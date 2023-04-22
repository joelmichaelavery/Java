/*
Joel Avery 
CSD 405
Intermediate Java Programming
03/26/23
*/

/*
This code is a test code with the Fan Class and the UseFans class. It Creates
a collection of Fan instances and then displays the functionality of all Fan 
instances in the collection. 
*/

// Import the ArrayList and List classes from the java.util package
import java.util.ArrayList;
import java.util.List;

// Define a class called UseFans
public class UseFans {
    // Define a main method
    public static void main(String[] args) {
        // Create an ArrayList of Fan objects
        List<Fan> fans = new ArrayList<>();
        
        // Create and add 3 Fan instances to the list with different attributes
        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 10.0, "red"));
        fans.add(new Fan(Fan.FAST, false, 5.0, "green"));
        fans.add(new Fan(Fan.MEDIUM, true, 8.0, "white"));
        // Call the displayFans method to display all fans in the list
        displayFans(fans);
        // Create a Fan instance with specified attributes
        Fan myFan = new Fan(Fan.MEDIUM, true, 9.0, "white");
        // Call the displayFan method to display the attributes of the new fan instance
        displayFan(myFan);
    }
    
    // Define a method called displayFans that takes a list of Fan objects as input
    public static void displayFans(List<Fan> fans){
        // Print the speed, on/off status, radius, and color of each fan in the list
        int temp = 1; // Counter for fan collection number
        for (Fan fan : fans) {
            System.out.println("Fan Collection Number: " + temp++);
            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("On: " + fan.isOn());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println("Color: " + fan.getColor());
            System.out.println();
    }
}

// Define a method called displayFan that takes a Fan object as input
    public static void displayFan(Fan fan){
            // Print the speed, on/off status, radius, and color of the fan
            System.out.println("Single Instance of Fan"); 
            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("On: " + fan.isOn());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println("Color: " + fan.getColor());
            System.out.println();
    }
}
