
import java.text.DecimalFormat;
import java.util.*;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double CurrentBalance = 0;
	private double savingBalance = 0;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs'###,##0.00");

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
//	method overloading
	public String setCustomerNumber(String name) {
		System.out.println("saved");
		return name;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCurrentBalance() {
		return CurrentBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCurrentWithdraw(double amount) {
		CurrentBalance = (CurrentBalance - amount);
		return CurrentBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	public double calcCurrentDeposit(double amount) {
		CurrentBalance = (CurrentBalance + amount);
		return CurrentBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
		System.out.print("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();

		if ((CurrentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(CurrentBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getsavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
		System.out.print("Amount you want to Deposit from Current Account: ");
		double amount = input.nextDouble();

		if ((CurrentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(CurrentBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to Deposit from saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}


}
