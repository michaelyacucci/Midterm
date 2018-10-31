package pkgShapes;

public class Rectangle extends Shape{
	
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int width, int length) {
		super();
		this.iWidth = width;
		this.iLength = length;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		this.iLength = length;
	}
	
	@Override
	public double area() {
		return 1.0 * iWidth * iLength;
	}
	
	@Override
	public double perimeter() {
		return (2*iWidth)+(2*iLength);
	}
	
	public int compareTo(Rectangle rec) {
		return ((int) this.area() - (int) rec.area());
	}

}
