package number1;

public class Circle implements Figure{
	public double radius;

	@Override
	public double caculator() {
		// TODO Auto-generated method stub
		return (22/7)*radius*radius;
	}
}