import java.util.Scanner;

public class Person {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the Name and age");
		Scanner scan=new Scanner(System.in);
		Person p= new Person(scan.nextLine(),scan.nextInt());
		System.out.println("Name: "+p.getName()+" Age: "+p.getAge());
		scan.close();
	}
}
