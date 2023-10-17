import java.util.Scanner;

public class Employee {

	int id,salary;
	String firstName,lastName;
	public Employee(int id, int salary, String firstName, String lastName) {
		super();
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String name() {
		return firstName+" "+lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*12; 
	}
	public int raiseSalary(int percentage) {
		return getAnnualSalary()+(getAnnualSalary()*percentage/100);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", Name=" + firstName +" "+ lastName+ "]";
	}
	
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		int a,b,i;
		String c,d;
		System.out.println("Enter the id:");
		a=scan.nextInt();
		System.out.println("Enter the Salary:");
		b=scan.nextInt();
		System.out.println("Enter the Increment Precentage:");
		i=scan.nextInt();
		System.out.println("Enter the First Name:");
		c=scan.next();
		System.out.println("Enter the Last Name:");
		d=scan.next();
		Employee e=new Employee(a, b, c, d);
		System.out.println(e.toString());
		System.out.println("Post Increment total salary per year is :"+e.raiseSalary(i));
		scan.close();
	}
}
