/*
Joel Avery 
Module 3 Programming Assignment
03/28/23
CSD-405
*/

/**
 * This code creates three instances of the JoelInteger class, two with the same value and one with a different value, 
 * and tests the various methods in the class including getters, setters, isEven, isOdd, isPrime, equals(int), equals(Integer).
 */

public class JoelInteger {
    private int joel;

    // Constructor that takes and sets the initial value
    public JoelInteger(int initialValue) {
        this.joel = initialValue;
    }

    // Getter method
    public int getJoel() {
        return this.joel;
    }

    // Setter method
    public void setJoel(int newValue) {
        this.joel = newValue;
    }

    // Non-static method that returns true if the integer is even and false otherwise
    public boolean isEven() {
        return this.joel % 2 == 0;
    }

    // Non-static method that returns true if the integer is odd and false otherwise
    public boolean isOdd() {
        return this.joel % 2 != 0;
    }

    // Non-static method that returns true if the integer is prime and false otherwise
    public boolean isPrime() {
        if (this.joel < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.joel); i++) {
            if (this.joel % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method that returns true if the integer is even and false otherwise
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Static method that returns true if the integer is prime and false otherwise
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method that returns true if the integer is odd and false otherwise
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Method that returns true if the integer in the JoelInteger object is equal to the specified integer
    public boolean equals(int n) {
        return this.joel == n;
    }

    // Method that returns true if the integer in the JoelInteger object is equal to the specified Integer object
    public boolean equals(Integer n) {
        return this.joel == n.intValue();
    }
}


class JoelIntegerTest {
    public static void main(String[] args) {
        // Create three JoelInteger objects
        JoelInteger num1 = new JoelInteger(5);
        JoelInteger num2 = new JoelInteger(10);
        JoelInteger num3 = new JoelInteger(10);
        
          // Test the getter and setter methods
        System.out.println(num1.getJoel()); // Output: 10
        num1.setJoel(30);
        System.out.println(num1.getJoel()); // Output: 30

        // Test the isEven() and isOdd() methods
        System.out.println(num1.isEven()); // Output: false
        System.out.println(num1.isOdd()); // Output: true
        System.out.println(num2.isEven()); // Output: true
        System.out.println(num2.isOdd()); // Output: false

        // Test the isPrime() method
        System.out.println(num1.isPrime()); // Output: false
        System.out.println(num2.isPrime()); // Output: false
        System.out.println(num3.isPrime()); // Output: true

        // Test the static isEven(int) and isPrime(int) methods
        System.out.println(JoelInteger.isEven(10)); // Output: true
        System.out.println(JoelInteger.isEven(15)); // Output: false
        System.out.println(JoelInteger.isPrime(7)); // Output: true
        System.out.println(JoelInteger.isPrime(10)); // Output: false

        // Test the static isEven(Integer), isOdd(Integer), and isPrime(Integer) methods
        Integer int1 = 5;
        Integer int2 = 8;
        System.out.println(JoelInteger.isEven(int1)); // Output: false
        System.out.println(JoelInteger.isOdd(int2)); // Output: false
        System.out.println(JoelInteger.isPrime(int1)); // Output: true
        System.out.println(JoelInteger.isPrime(int2)); // Output: false

        // Test the equals(int) and equals(Integer) methods
        System.out.println(num1.equals(30)); // Output: true
        System.out.println(num1.equals(10)); // Output: false
        System.out.println(num2.equals(new Integer(20))); // Output: true
        System.out.println(num2.equals(new Integer(10))); // Output: false
    }
}