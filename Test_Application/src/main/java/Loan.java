
public class Loan {
    private double annualInterestRate; 
    private int numberOfYears; 
    private double loanAmount; 
    private java.util.Date loanDate; 
    
    /*Default Constructor */
    public Loan() {
        this(2.5, 1, 1000); 
    }
    
    /** Construct a loan with specified annual interest rate, number of years, 
     * and loan amount. 
     */
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate; 
        this.numberOfYears = numberOfYears; 
        this.loanAmount = loanAmount; 
        loanDate = new java.util.Date(); 
    }
    
    //Return an annualInterestRate
    public double getAnnualInterestRate(double annualInterestRate){
        return annualInterestRate; 
    }
    
    //Set a new annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate; 
    }
    
    //Return number of years
    public int getNumberOfYears(int numberOfYears) {
        return numberOfYears; 
    }
    
    //Set a new numberOfYears
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears; 
    }
    
    //return loan amount
    public double getLoanAmount(double loanAmount) {
        return loanAmount; 
    }
    
    //set new loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount; 
    }
    
    //Find Monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200; 
        double monthlyPayment = loanAmount * monthlyInterestRate / 
            1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        return monthlyPayment; 
    }
    
    //Find Total Payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12; 
        return totalPayment; 
    }
    
    //Return Loan Date
    public java.util.Date getLoanDate() {
        return loanDate; 
    }
    
}
