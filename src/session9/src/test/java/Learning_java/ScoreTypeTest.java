/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScoreTypeTest {
	public static ScoreType scoreType;

	@BeforeClass
	public static void beforeClass() {
		scoreType = new ScoreType();
	}

	/**
	@Test
	public void testFunctionGetScoreTypeCaseA() {
		String data = scoreType.getScoreType(95);
		Assert.assertEquals("A", data);
	}

	@Test
	public void testFunctionGetScoreTypeCaseA() {
		String data = scoreType.getScoreType(10);
		Assert.assertEquals("B", data);
	}
	 **/
}
