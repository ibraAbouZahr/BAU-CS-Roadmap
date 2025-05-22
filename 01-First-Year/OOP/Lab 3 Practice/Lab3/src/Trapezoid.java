
public class Trapezoid {
	double a;
	double b;
	double height;

	
	Trapezoid() {
		a = 0.0;
		b = 0.0;
		height = 0.0;
	}
	Trapezoid(double a, double b, double height) {
		this.a = a;
		this.b = b;
		this.height = height;
	}
	public double calculateArea() {
		double area;
		area = 0.5*(a+b)*height;
		return area;
	}
}
