class Account{

	protected int balance;

	public int  withdraw(int amount){

		this.balance = this.balance - amount;

		return amount;
	}
}
class SavingAccount extends Account{

	private double IntrestRate = 2.5;
	private double interestRate;
	public void setDefaultInterestRate(double interestRate){

	}
	public void applyMonthlyInterest(){

	}
}