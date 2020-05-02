import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.entities.DomainExcwptions;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Inicial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account account = new Account(number,holder,balance,limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println(account);
		}
		catch(DomainExcwptions e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("unexpected error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
