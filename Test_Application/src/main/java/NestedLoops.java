/*Joel Avery
  Module 6 Assignment
  02/05/2023
*/

/*//This code prints a pyramid pattern consisting of numbers and @ symbols. The
outer loop iterates through 7 rows. The inner loops print spaces and numbers in 
an increasing and decreasing order, respectively. The max variable is used to 
keep track of the numbers in the pyramid pattern and is reset to 1 at the end 
of each row.*/

public class NestedLoops {
    public static void main(String[] args) {
        // Initialize max to 1
        int max = 1;
        // Outer loop to iterate through 7 rows
        for (int i = 0; i < 7; i++) {
            // Inner loop to print spaces
            for (int j = 0; j < (7 - i); j++) {
                System.out.print("  ");
            }
            // Inner loop to print numbers in increasing order
            for (int k = 0; k <= i; k++) {
                System.out.print(max + " ");
                // Multiply max by 2 if k is less than i
                if (k < i) {
                    max *= 2;
                }
            }
            // Inner loop to print numbers in decreasing order
            for (int l = 0; l < i; l++) {
                // Divide max by 2
                max /= 2;
                System.out.print(max + "");
            }
            // Print @ at the end of each row
            System.out.println(" @");
            // Reset max to 1
            max = 1;
        }
    }
}