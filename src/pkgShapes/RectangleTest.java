package pkgShapes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	
	@Test
	public void recConstructorTest() {
		try {
			Rectangle rec1 = new Rectangle(1, 1);
			Class cl1 = rec1.getClass();
			assertTrue(cl1.getName() == "pkgShapes.Rectangle");
		}catch(Exception e) {
			fail("failed to construct");
		}
	}
	
	@Test
	public void getterSetterTest() {
		Rectangle rec1 = new Rectangle(1, 1);
		try {
			rec1.getiLength();
		}catch(Exception e) {
			fail("length getter failed");
		}
		try {
			rec1.setiLength(4);
			assertTrue(rec1.getiLength() == 4);
		}catch(Exception e) {
			fail("length setter failed");
		}
		try {
			rec1.getiWidth();
		}catch(Exception e) {
			fail("width getter failed");
		}
		try {
			rec1.setiWidth(5);
			assertTrue(rec1.getiWidth() == 5);
		}catch(Exception e) {
			fail("length getter failed");
		}
		
	}
	
	@Test
	public void areaTest() {
		Rectangle rec1 = new Rectangle(1, 1);
		try {
			double area1 = rec1.area();
			assertTrue(area1 ==1);
		}catch(Exception e) {
			fail("area failed");
		}
		Rectangle rec2 = new Rectangle(5, 42);
		try {
			double area2 = rec2.area();
			assertTrue(area2 ==210);
		}catch(Exception e) {
			fail("area failed");
		}
		Rectangle rec3 = new Rectangle(-1, 1);
		try {
			double area3 = rec3.area();
			assertTrue(area3 ==-1);
		}catch(Exception e) {
			fail("area failed");
		}
	}
	
	@Test
	public void perimeterTest() {
		Rectangle rec1 = new Rectangle(1, 1);
		try {
			double perim1 = rec1.perimeter();
			assertTrue(perim1 == 4);
		}catch(Exception e) {
			fail("perimeter failed");
		}
		Rectangle rec2 = new Rectangle(3, 4);
		try {
			double perim2 = rec2.perimeter();
			assertTrue(perim2 == 14);
		}catch(Exception e) {
			fail("perimeter failed");
		}
		Rectangle rec3 = new Rectangle(-1, 1);
		try {
			double perim3 = rec3.perimeter();
			assertTrue(perim3 == 0);
		}catch(Exception e) {
			fail("perimeter failed");
		}
	}
	
	@Test
	public void compareToTest() {
		Rectangle rec1 = new Rectangle(1, 1);
		Rectangle rec2 = new Rectangle(2, 3);
		Rectangle rec3 = new Rectangle(6, 1);
		try {
			assertTrue(rec1.compareTo(rec2)==-5);
			assertTrue(rec2.compareTo(rec3)==0);
			assertTrue(rec3.compareTo(rec1)==5);
		}catch(Exception e) {
			fail("compareTo failed");
		}
		
	}

}
