package com.per.protect;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTests {

	@Test
	public void test() {
		JunitProtected junitP = new JunitProtected();
		int outputP = junitP.square(4);
//		Test the output
		assertEquals(19, outputP);
		
		}

}
