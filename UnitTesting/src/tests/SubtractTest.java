package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void testSubtract() {
		center.HelloWorld test = new center.HelloWorld();
		int result = test.subtract(5, 2);
		assertEquals(3, result);
	}

}
