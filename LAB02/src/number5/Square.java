package number5;

public class Square implements Shape {

	private Rectangle target;
	public Square(int size) {
		setSize(size);
	}

	public void setSize(int size) {
		this.target = new Rectangle(size, size);
	}

	@Override
	public int getArea() {
		return target.getArea();
	}
}