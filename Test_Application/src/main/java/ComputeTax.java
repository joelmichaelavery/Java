import java.util.Scanner; 

public class ComputeTax {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in); 
        
        //Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married seperately, 3-Head of " +
                "household) Enter the filing status: ");
        
        int status = input.nextInt(); 
        
        //Prompt the user to enter taxable income. 
        System.out.print("Enter the taxable income: "); 
        double income = input.nextDouble(); 
        
        double tax = 0; 
        
        //Compute tax
        if (status == 0){
            if (income <= 10275){
                tax = income * 0.10; 
        }
            else if (income <= 41775){
                tax = 1027.50 + ((income - 10275) * 0.12); 
            }
            else if (income <= 89075){
                tax = (4807.50 + (income - 41775) * 0.22); 
            }
            else if (income <= 171550){
                tax = 15213.50 + ((income - 89075) * 0.24); 
                System.out.println("Your tax is " + tax);
            }

            }
        else if (status == 2){
            if (income <= 170050){
                tax = 15213.50 + ((income - 89075) * 0.24); 
                System.out.println("Your tax is " + tax);
            }
        
        
        
        
        }
            }
    }
    
}
