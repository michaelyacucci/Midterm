package pkgShapes;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.iDepth = depth;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		return this.getiWidth() * this.getiLength() * iDepth;
	}
	
	@Override
	public double area() {
		return 2*((this.getiWidth() * this.getiLength())+
				(this.getiWidth() * iDepth)+
				(this.getiLength() * iDepth));
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Rectangle rec) {
		throw new UnsupportedOperationException();
	}
	
	public class SortByArea{
		
		SortByArea() {
			super();
		}
		
		public int compare(Cuboid cu1, Cuboid cu2) {
			return ((int) cu1.area() - (int) cu2.area());
		}
		
	}
	
	public class SortByVolume{
		
		SortByVolume() {
			super();
		}
		
		public int compare(Cuboid cu1, Cuboid cu2) {
			return ((int) cu1.volume() - (int) cu2.volume());
		}
		
	}

}
