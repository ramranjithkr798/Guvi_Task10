import java.util.Scanner;

class Tea {
	
	public void prepareTea() {
		System.out.println("Prepared a basic tea with hot water and tea leaves");
	}
	public void addMilk() {
		System.out.println("Milk added to the Tea");
	}
	public void addSugar() {
		System.out.println("Sugar added to the Tea");
	}
}

class BlackTea extends Tea{
	public void prepareTea() {
		System.out.println("Prepared a Black Tea with hot water and tea leaves");
	}
}

class GreenTea extends Tea{
	public void prepareTea() {
		System.out.println("Prepared a Green Tea with hot water and tea leaves");
	}
}
class HerbalTea extends Tea{
	public void prepareTea() {
		System.out.println("Prepared a Herbal Tea with hot water , herbal's and tea leaves");
	}
}
public class TeaPoly{
	public static void main(String args[]) {
		int choice;
		boolean flag=true;
		Scanner scan =new Scanner(System.in);
		Tea t[]=new Tea[4];
		t[0]=new Tea();
		t[1]=new BlackTea();
		t[2]=new GreenTea();
		t[3]=new HerbalTea();
		while(flag) {
			System.out.println("Please select the type of Tea you wish to have:\n1)Basic Tea \n2)Black Tea \n3)Green Tea \n4)Herbal Tea");
			choice=scan.nextInt();
			switch (choice) {
			case 1:
				t[0].prepareTea();
				flag=false;
				break;
			case 2:
				t[1].prepareTea();
				flag=false;
				break;
			case 3:
				t[2].prepareTea();
				flag=false;
				break;
			case 4:
				t[3].prepareTea();
				flag=false;
				break;
			default:
				System.out.println("Select the correct option");
				
				break;
			}
		}
		System.out.println("Enter 1 to add Sugar:");
		if(scan.nextInt()==1)
			t[0].addSugar();
		else
			System.out.println("No suger added to the Tea");
		System.out.println("Enter 1 to add Milk");
		if(scan.nextInt()==1)
			t[0].addMilk();
		else
			System.out.println("No Milk added to the Tea");
		System.out.println("Thanks for visit again!...");
	}
}