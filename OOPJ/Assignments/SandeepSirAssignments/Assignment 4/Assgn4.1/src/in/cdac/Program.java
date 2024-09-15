package in.cdac;

import java.util.Scanner;
class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;  // in years
    
    
    
    public LoanAmortizationCalculator() {
    	
    }

    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Method to calculate the monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // Method to calculate the total payment over the loan term
    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }

    @Override
    public String toString() {
        return String.format("Loan Details:\nPrincipal: ₹%.2f\nAnnual Interest Rate: %.2f%%\nLoan Term: %d years",
                principal, annualInterestRate, loanTerm);
    }
}


class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator loanAmortizationCalculator;
    Scanner scanner = new Scanner(System.in);

    // Method to accept loan details from the user
    public void acceptRecord() {
        System.out.print("Enter Loan Principal Amount (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter Loan Term (in years): ");
        int loanTerm = scanner.nextInt();

        loanAmortizationCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    // Method to display loan details and calculated payments
    public void printRecord() {
            System.out.println(loanAmortizationCalculator);  // Display loan details
            double monthlyPayment = loanAmortizationCalculator.calculateMonthlyPayment();
            double totalPayment = loanAmortizationCalculator.calculateTotalPayment();
            System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
            System.out.printf("Total Payment Over %d Years: ₹%.2f\n", loanAmortizationCalculator.getLoanTerm(), totalPayment);
      
    }

    // Method to display the menu options
    public void menuList() {
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Amortization Details");
        System.out.println("3. Exit");
    }
}

public class Program {
    public static void main(String[] args) {
        LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        Scanner scanner = new Scanner(System.in);
        
        int choice;

        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    util.acceptRecord();   // Accept loan details from user
                    break;
                case 2:
                    util.printRecord();    // Display calculated loan details
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 3);  // Repeat menu until user selects "Exit"
        
        scanner.close();
    }
}
