/*
Joel Avery 
CSD 405 
Module 1
03/15/23
*/

/*
This program creates a class of a fan and then creates two instances, it also
changes speeds colors and radius based on getters and setters, it then runs
instances of the classes twice, and outputs the states. 
*/


import java.util.ArrayList; 
import java.util.List; 

public class Fan {
    //Constants
    public static final int STOPPED = 0; 
    public static final int SLOW = 1; 
    public static final int MEDIUM = 2; 
    public static final int FAST = 3; 
    
    //Fields
    private int speed;
    private boolean on; 
    private double radius; 
    public String color; 
    
    //Constructors
    public Fan() {
        speed = STOPPED; 
        on = false; 
        radius = 6; 
        color = "white"; 
    }
    
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed; 
        this.on = on; 
        this.radius = radius; 
        this.color = color; 
    }
    
    //Getters and setters
    public int getSpeed(){
        return speed; 
    }
    
    public void setSpeed(int speed){
        this.speed = speed; 
    }
    
    public boolean isOn(){
        return on; 
    }
    
    public void setOn(boolean on) {
        this.on = on; 
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius; 
    }
    
    public String getColor() {
        return color; 
    }
    
    public void setColor(String color){
        this.color = color; 
    }
    
    //toString method
    public String toString(){
        String state = "";
        if (on) {
            state += "Speed: " + speed + "\n"; 
        }
        else {
            state += "Fan is off \n"; 
        }
        state += "Radius: " + radius + "\n"; 
        state += "Color: " + color; 
        return state; 
    }
    
    //test code
    public static void main(String[] args) {
        Fan fan1 = new Fan(); 
        Fan fan2 = new Fan(MEDIUM, true, 8.0, "blue"); 
        
        //Turn on fan 1 and set its speed to MEDIUM
        fan1.setOn(true); 
        fan1.setSpeed(MEDIUM); 
        
        //Print both states of the fans
        System.out.println("Fan 1:"); 
        System.out.println("------");
        System.out.println(fan1);
        System.out.println("");
        
        System.out.println("Fan 2:");
        System.out.println("------");
        System.out.println(fan2);
        System.out.println("");
        
        //Change both fans again
        fan1.setSpeed(FAST);
        fan1.setColor("Green");
        
        fan2.setRadius(10.0);
        fan2.setSpeed(SLOW); 
        fan2.setColor("Purple");
        
        //Print both states of the fans again after changes
        System.out.println("Fan 1:"); 
        System.out.println("------");
        System.out.println(fan1);
        System.out.println("");
        
        System.out.println("Fan 2:");
        System.out.println("------");
        System.out.println(fan2);
        System.out.println("");
        
        
        
    
}
}

