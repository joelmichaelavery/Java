/*Joel Avery
* CSD - 405
* Module 3 Assignment
* 03/28/23
*/

//This class tests all methods, in the JoelInteger class it also creates three 
// JoelInteger objects and two with same value and one with a different value. 

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