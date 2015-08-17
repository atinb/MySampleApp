package Test;

import java.io.Console;

import Calculator.Calc;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testadd() {
		Calc c = new Calc();
		int i = c.add(2,2);
		assert(i == 3);
		System.out.println("There is an error in the addition method. Please check the hack the developer added");
	}
	
	@Test
	public void testsubtract() {
		Calc c = new Calc();
		int i = c.subtract(2,2);
		assert(i == 0);
	}
	@Test
	public void testmultiply() {
		Calc c = new Calc();
		int i = c.multiply(2,2);
		assert(i == 4);
	}
	
	@Test
	public void testdivide() {
		Calc c = new Calc();
		int i = c.divide(2,2);
		assert(i == 1);
	}
	
	@Test
	public void testmod() {
		Calc c = new Calc();
		int i = c.mod(2,2);
		assert(i == 0);
	}
	@Test
	public void testand() {
		Calc c = new Calc();
		int i = c.bitand(2,2);
		assert(i == 2);
	}
	@Test
	public void testor() {
		Calc c = new Calc();
		int i = c.bitor(2,2);
		assert(i == 2);
	}
	@Test
	public void testxor() {
		Calc c = new Calc();
		int i = c.bitxor(2,2);
		assert(i == 0);
	}
	@Test
	public void testshiftleft() {
		Calc c = new Calc();
		int i = c.shiftleft(2,2);
		assert(i == 8);
	}
	@Test
	public void testshiftright() {
		Calc c = new Calc();
		int i = c.shiftright(4,2);
		assert(i == 1);
	}
	
}


