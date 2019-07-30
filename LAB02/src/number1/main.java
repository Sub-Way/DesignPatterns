package number1;
public class main {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		AreaCalculator a = new AreaCalculator();
		c.radius = 1;
		System.out.println(a.AreaCalculatorFigure(c));
	}
}
