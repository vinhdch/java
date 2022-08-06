/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTest {

	private static Calculation calculation;

	@Test
	public void testSum() {
		System.out.println("test sum");
		Calculation calculation = new Calculation();
		double sum = calculation.sum(10,20);

		Assert.assertEquals(30, sum, 0.003);
	}

	@Test
	public void testSub() {
		System.out.println("test sub");
		Calculation calculation = new Calculation();
		double sub = calculation.subtract(10, 20);

		//Assert.assertEquals(10, sub, 0.001);
		Assert.assertTrue("phep tru sai", -10 ==sub);
		//Assert.assertFalse(false);
		//Assert.assertNotEquals(200, sub);
		//Assert.assertNotNull(calculation);
	}

	@Before
	public void beforeTest() {
		System.out.println("Start test");
	}

	@After
	public void afterTest() {
		System.out.println("Stop test");
	}


	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start test class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End test class");
	}
}
