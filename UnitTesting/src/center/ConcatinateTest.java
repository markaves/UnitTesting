package center;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatinateTest {

	@Test
	public void testConcatinate() {
		HelloWorld test = new HelloWorld();
		String result = test.concatinate("one", "two");
		assertEquals("onetwo", result);
	}

}
