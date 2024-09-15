package in.cadac;

class BankAccount {
	private double balance;
	
	public BankAccount(){};
	
	public BankAccount(int initialBalance) {
		this.balance=initialBalance;
	}
	
	public void deposite(double amount) {
		System.out.println("inside deposite of base class.");
		if(amount>0) {
			this.balance+=amount;
		}else {
			System.out.println("invalid amount to deposite.");
		}
	}
	public void withdraw(double amount) {
		System.out.println("inside withdraw of base class.");
		if(amount>0 && amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("insufficient balance");
		}
	}
	public double getBalance() {
		return this.balance;
	}
}

class SevingsAccount extends BankAccount{
	private static double withdrawalLimit=1000;
	
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<withdrawalLimit) {
			super.withdraw(amount);//if we here not put super then call gets to subclass method and stackoverflow exception
		}else {
			System.out.println("withdrawal amount exceeds   "+withdrawalLimit);
		}
	}
}




public class Assgn5Q1 {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposite(3000);
		System.out.println(ba.getBalance());
		ba.withdraw(2000);
		System.out.println(ba.getBalance());
		
		
		SevingsAccount sa = new SevingsAccount();
		sa.deposite(5000);
		System.out.println("balance :   "+sa.getBalance());//superclass method
		sa.withdraw(2000);
		System.out.println("balance :   "+sa.getBalance());//superclass method
		sa.withdraw(800);
		System.out.println("balance :   "+sa.getBalance());//superclass method

		
	}
}
