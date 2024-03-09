
import java.util.Scanner;
public class ATMProgram{
	public static void main(String args[]) {
		int balance=100000;
		int withdraw;
		int deposite;
		int PinNumber;
		Scanner sbi=new Scanner(System.in);
		while(true) {
			System.out.println("welcom ATM");
			System.out.print("Enter your ATM PinNumber:");
			int pin=sbi.nextInt();
			if(pin==1234) {
				System.out.println("option 1 is Bank balance");
				System.out.println("option 2 is Withdraw");
				System.out.println("option 3 is Deposite");
				System.out.println("option 4 is Exit");
				System.out.print("Enter your option:");
				int option=sbi.nextInt();
				if(option==1) {
					System.out.println(" Bank Balance :"+balance);
					break;
				}
				if(option==2) {
					System.out.print("Enter the Withdraw amount:");
					  withdraw=sbi.nextInt();
					 if(withdraw<=balance) {
						 	balance=balance-withdraw;
						 System.out.println("Colect your Money="+withdraw +"Rs");
						 System.out.println("Withdraw Successfull");
						 System.out.println("Balance Amount:"+balance);
						  }
					 else {
						 System.out.println("none withdraw made");
					 }
					 System.out.println("");
						break;
					
				}
				if(option==3) {
					System.out.print("Enter the deposite:");
					deposite=sbi.nextInt();
					if(deposite>0) {
						 balance=balance+deposite;
						System.out.println("successfull deposited");
						System.out.println("Balance Amount:"+balance);
					}
					else {
						System.out.println("none of deposite Money");
					}
					System.out.println("");
					break;
				}
				if(option==4) {
					System.out.println("Exited and Remove your Card");
					break;
				}
			}
			else {
				System.out.println("Your Pin is Not Correct");
			}
			System.out.println("");
			break;
		}
	}
}	

	