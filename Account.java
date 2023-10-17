import java.util.Scanner;

public class Account {
	
	int mainBalance,accNo;
	String name;
	public Account() {
		mainBalance=0;
	}
	
	public Account(int minBalance, int accNo, String name) {
		super();
		this.mainBalance = minBalance;
		this.accNo = accNo;
		this.name = name;
	}
	
	public void withDraw(int amount) {
		if(mainBalance<amount) {
			System.out.println("The Main Balance is less then "+amount+" hence can't do the withdrawl");
			}
		else {
			mainBalance-=amount;
			System.out.println("The "+amount+" has been withdrawn remining balance is: "+mainBalance);
			}
	}
	public void deposit(int amount) {
		mainBalance+=amount;
		System.out.println("The "+amount+" has been deposited in the account and the remining balance is:"+mainBalance);
	}
	

	@Override
	public String toString() {
		return "Account [mainBalance=" + mainBalance + ", accNo=" + accNo + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		boolean flag=true;
		int choice,ac;
		String name1;
		Account acc=new Account();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Name:");
		name1=scan.next();
		System.out.println("Enter the accno:");
		ac=scan.nextInt();
		acc=new Account(1000,ac,name1);
		while(flag) {
			System.out.println("Enter 1 for viewblance:\nEnter 2 for withdrawl:\nEnter 3 for Deposit:\nEnter 4 for exit:");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("The Main Balance is:"+acc.mainBalance);
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawl");
				acc.withDraw(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter the amount to be Deposit");
				acc.deposit(scan.nextInt());
				break;
			case 4:
				System.out.println("Thank you for your servies");
				System.out.println(acc.toString());
				flag=false;
				break;
			default:
				System.out.println("Please enter the correct value:");
				break;
			}
		}
		scan.close();
	}

}
