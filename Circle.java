import java.util.Scanner;
public class Circle {
	float radius,pi;
	public Circle() {
		System.out.println("The apx Pi value is 3.142");
	}
	public Circle(float radius, float pi) {
		super();
		this.radius = radius;
		this.pi = pi;
	}
	public float calculateCircumference() {
		
		return 2*pi*radius;
	}
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter the Circumference");
		c=new Circle(scan.nextFloat(),3.142f);
		System.out.println("Circumference of the circle is: "+c.calculateCircumference());
		scan.close();
	}
}
