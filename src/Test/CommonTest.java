package Test;

import Calculator.Calc;

import org.junit.Test;

public class CommonTest {
	
	@Test
	public void testadd2() {
		Calc c = new Calc();
		int i = c.add(-2,-2);
		assert(i == 3);
		System.out.println("There is an error in the addition method. Please check the hack the developer added");
	}
	
	@Test
	public void testsubtract2() {
		Calc c = new Calc();
		int i = c.subtract(-2,-2);
		assert(i == 0);
	}
	@Test
	public void testmultiply2() {
		Calc c = new Calc();
		int i = c.multiply(-2,-2);
		assert(i == 4);
	}
	
	@Test
	public void testdivide2() {
		Calc c = new Calc();
		int i = c.divide(-2,-2);
		assert(i == 1);
	}
	
}