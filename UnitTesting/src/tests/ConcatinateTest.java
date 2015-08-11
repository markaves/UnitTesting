package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatinateTest {

	@Test
	public void testConcatinate() {
		center.HelloWorld test = new center.HelloWorld();
		String result = test.concatinate("one", "two");
		assertEquals("onetwo", result);
	}

}
