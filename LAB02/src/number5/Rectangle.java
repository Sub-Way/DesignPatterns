package number5;

public class Rectangle implements Shape{
	protected int height;
	protected int width;
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int getArea() {
		return width * height;
	}
}
