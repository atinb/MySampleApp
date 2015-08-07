package CalcTest;

import Calculator.Calc;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testadd() {
		Calc c = new Calc();
		int i = c.add(2,2);
		assert(i == 4);
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
}


