package CalcTest;

import static org.junit.Assert.*;
import Calculator.Calc;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int i = c.add(2,2);
		assert(i == 2);
				
	}

}
