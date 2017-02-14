import java.util.Scanner;

//add scanner
public class BankAccountApp {

	public static void main(String[] args) {
		String choice = "";
		//Switch (choice){
		Scanner scanner = new Scanner(System.in);
		choice = scanner.next();
			
		
		System.out.println("Welcome to Your Accounts");
		System.out.println("Choose your Account");
		System.out.println("Enter 'C' for Checking");
		//case "C":
		System.out.println("Enter 'S' for Saving");
		System.out.println("Enter 'CC' for Credit");
		System.out.println("Enter 'W' to make a Withdrawal");
		System.out.println("Enter 'D' to make a Deposit");
		System.out.println("Enter 'X' to Exit");
		
		
		if (choice == "D"){
			System.out.println("Enter 'C' for Checking");
			System.out.println("Enter 'S' for Saving");
		}
		if (choice =="W"){
			System.out.println("Enter 'C' for Checking");
			System.out.println("Enter 'S' for Saving");
		}
		
		
		//}
	}

}
