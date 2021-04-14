package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test() {
		TestThis testThis = new TestThis();
		
//		Get name at index test
		
		String getNameI = testThis.getNameAtIndex(2);
		assertEquals("Tony", getNameI);
		
		String getNameI2 = testThis.getNameAtIndex(0);
		assertEquals("Mike", getNameI2);
		
	}
	
	@Test
	void test2() {
		TestThis testThis = new TestThis();
		testThis.addName("Jared");
		assertEquals("Jared", testThis.getNames().get(3));
		
	}

}
