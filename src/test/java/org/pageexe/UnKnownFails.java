package org.pageexe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnKnownFails {
	
	@Test()
	public void test() {
		System.out.println("test");
		Assert.assertTrue(false);
	}
	
	@Test()
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}

	@Test()
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(true);
	}



}
