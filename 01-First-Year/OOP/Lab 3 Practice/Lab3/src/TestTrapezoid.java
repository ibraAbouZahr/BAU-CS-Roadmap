
public class TestTrapezoid {

	public static void main(String[] args) {
		Trapezoid t1 = new Trapezoid(10,14,3.5);
		Trapezoid t2 = new Trapezoid(4.5,8,2.3);
		System.out.println("The area of thetrapezoid with a= " + t1.a + ", b= " + t1.b + " and h=" + t1.height + " is " + t1.calculateArea());
		System.out.println("The area of thetrapezoid with a= " + t2.a + ", b= " + t2.b + " and h=" + t2.height + " is " + t2.calculateArea());


	}

}
