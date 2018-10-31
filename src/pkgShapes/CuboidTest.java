package pkgShapes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CuboidTest {
	
	@Test
	public void cubConstructorTest() {
		try {
			Cuboid cub1 = new Cuboid(1, 1, 1);
			Class cl1 = cub1.getClass();
			assertTrue(cl1.getName() == "pkgShapes.Cuboid");
		}catch(Exception e) {
			fail("failed to construct");
		}
	}
	
	@Test
	public void getterSetterTest() {
		Cuboid cub1 = new Cuboid(1, 1, 1);
		try {
			cub1.setiWidth(2);
			cub1.setiLength(3);
			cub1.setiDepth(4);
			assertTrue(cub1.getiWidth() == 2);
			assertTrue(cub1.getiLength() == 3);
			assertTrue(cub1.getiDepth() == 4);
		}catch(Exception e) {
			fail("getter or setter failed");
		}
	}
	
	@Test
	public void areaTest() {
		Cuboid cub1 = new Cuboid(1, 1, 1);
		try {
			double area1 = cub1.area();
			assertTrue(area1 == 6);
		}catch(Exception e) {
			fail("area failed");
		}
		Cuboid cub2 = new Cuboid(1, 1, 0);
		try {
			double area2 = cub2.area();
			assertTrue(area2 == 2);
		}catch(Exception e) {
			fail("area failed");
		}
		Cuboid cub3 = new Cuboid(1, 2, 3);
		try {
			double area3 = cub3.area();
			assertTrue(area3 == 22);
		}catch(Exception e) {
			fail("area failed");
		}
	}
	
	@Test
	public void perimeterTest() {
		boolean thrown = false;
		try {
			Cuboid cub1 = new Cuboid(1, 1, 1);
			double perim = cub1.perimeter();
		}catch(UnsupportedOperationException e) {
			thrown = true;
		}catch(Exception f) {
			fail("incorrect exception");
		}
		assertTrue(thrown);
	}
	
	@Test
	public void SortByAreaTest() {
		try {
			Cuboid cub1 = new Cuboid(1, 1, 5);
			Cuboid cub2 = new Cuboid(2, 2, 2);
			Cuboid.SortByArea sort = cub1.new SortByArea();
			assertTrue(sort.compare(cub1, cub2)==-2);
		}catch(Exception e) {
			fail("compare failed");
		}
	}
	
	@Test
	public void SortByVolumeTest() {
		try {
			Cuboid cub1 = new Cuboid(1, 1, 5);
			Cuboid cub2 = new Cuboid(2, 2, 2);
			Cuboid.SortByVolume sort = cub1.new SortByVolume();
			assertTrue(sort.compare(cub1, cub2)==-3);
		}catch(Exception e) {
			fail("compare failed");
		}
	}

}
