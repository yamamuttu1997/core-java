class BankAccount_{ 
     double amount;
	
	
    public BankAccount_(){
	System.out.println("BankAccount constructor is invoked ");
	}
	
	//method to get totalAmount();
	void deposit(double amt){
	System.out.println("Invoke deposit()");
	System.out.println("Amount to be deposit : "+amt);
	System.out.println("Amount before deposit : "+amount);
	amount = amount+amt;
	System.out.println("Amount after deposit : "+amount);
	System.out.println("End of deposit()");
	
	}
	
 void withdraw(double amt){
	System.out.println("Invoke withdraw()");
	System.out.println("Amount to be withdraw : "+amt);
	System.out.println("Amount before withdraw : "+amount);
	amount = amount-amt;
	System.out.println("Amount after withdraw : "+amount);
	System.out.println("End of withdraw()");
	
}
public double getBalance(){
	return amount;
	}
	public void transfer(double amount, BankAccount_ other){
		withdraw(amount);
		other.deposit(amount);
}
}