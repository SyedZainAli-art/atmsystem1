
import java.text.DecimalFormat;
import java.util.*;
import java.io.IOException;
	
public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				data.put(952141, 952141);
				data.put(989947, 71976);

				System.out.println("*** WELCOME TO THE ATM PROJECT ***");
				System.out.println("\n");
				System.out.println("Enter your customer Number :");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
				
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else
				System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
		} while (x == 1);
	}

	public void getAccountType() {
		System.out.println("Select the Account you Want to Access: ");
		System.out.println(" Type 1 - Current Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getCurrent();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank You for using this ATM, bye.  \n");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	public void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.print("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;

		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
		}
	}

	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.print("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;

		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
		}
	}

}
