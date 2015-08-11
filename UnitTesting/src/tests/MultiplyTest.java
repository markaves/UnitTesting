package tests;

import static org.junit.Assert.*;

import org.junit.Test;


public class MultiplyTest {

	@Test
	public void testMultiply() {
		center.HelloWorld test = new center.HelloWorld();
		int result = test.multiply(3, 4);
		assertEquals(12, result);
	}
}
