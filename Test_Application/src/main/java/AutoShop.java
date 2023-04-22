/*
Joel Avery 
CSD 320 
Module Eight Assignment
02/10/2023
*/

//This program uses four different methods for different scenarios. From there 
//it outputs the price of the total of the visit. 


import java.util.Scanner; 
public class AutoShop {
    public static void main(String[] args) {
        //Initialized values to pass through to the methods. 
        double oilChange = 29.99; 
        double tireRotation = 9.99; 
        double couponCode = 5.99; 
        System.out.println("---Your Previous Order Reciepts---"); 
        
        System.out.println("Order #1");
        //plain double service charge invoking of the methods twice
        System.out.println("Thank you for the standard visit on 02/23/2023 "
                + "your fee is $" + yearlyService());
        
        System.out.println("Order #2");
        System.out.println("Thank you for the standard visit on 02/14/2023"
                + " your fee is " + yearlyService());
        
        System.out.println("Order #3");
        //OilChange invoke method twice 
        System.out.println("Thank you for the oil change on 01/05/2023 "
                + "your fee is " +yearlyService(oilChange));
        
        System.out.println("Order #4");
        System.out.println("Thank you for the oil change on 12/20/2022 "
                + "your fee is " +yearlyService(oilChange)); 
        
        System.out.println("Order #5");
        //Output using the method for yearlyService with oilchange and tire rotation twice
        System.out.println("The total for the oil change, tire rotation, " + 
                "with the standard charge on 11/15/2022 is " + yearlyService(oilChange, 
                        tireRotation));
        
        System.out.println("Order #6");
        System.out.println("The total for the oil change, tire rotation, " + 
                "with the standard charge on 12/06/2022 is " + yearlyService(oilChange, 
                        tireRotation));
        
        System.out.println("Order #7");
        //Output using the method for yearlyService with oil change, tire rotation, while using the coupon twice
        System.out.println("The total for the oil change, tire rotation, " +
                "and standard charge on 01/05/2023 is " + 
                yearlyService(oilChange, tireRotation, couponCode)+ "a $" + couponCode + ""
                        + " Coupon Code was applied. "); 
        
        System.out.println("Order #8");
        System.out.println("The total for the oil change, tire rotation, " +
                "and standard charge on 02/05/2023 is " + 
                yearlyService(oilChange, tireRotation, couponCode)+ "a $" + couponCode + ""
                        + "Coupon Code was applied. ");  
        System.out.println();
        
        //Output using the method
    }
    
    //yearlyService method with no parameters and only the standard charge. 
    public static double yearlyService(){
        double standardCharge = 19.99; //standard charge
        return standardCharge; //returned the standard charge. 
    }
    
    //method for yearly service with one parameter oilChange passed in
    public static double yearlyService(double oilChange){
        double standardCharge = 19.99; 
        double total = oilChange + standardCharge; //total of both charges
        return total; //return the total
    }
    
    //method for yearly service with two parameters passed in. 
    public static double yearlyService(double oilChange, double tireRotation){
        double standardCharge = 19.99; //standard charge 
        //total for oilChange standardCharge and tire rotation
        double total = (oilChange + standardCharge + tireRotation); 
        return total; //return the total
    }
    
    //method for yearly service with all services and a coupon code subtracted from the total. 
    public static double yearlyService(double oilChange, double tireRotation, double couponCode){
        double standardCharge = 19.99; //standard charge
        //total for all services then coupon code is subtracted from the total
        double total = ((oilChange + standardCharge + tireRotation) - couponCode);
        return total; //returns total. 
    }
}
