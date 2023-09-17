package org.pageexe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFails {
	
	@Test(retryAnalyzer = RetryTest.class)
	public void test() {
		System.out.println("test");
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer = RetryTest.class)
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}

	@Test(retryAnalyzer = RetryTest.class)
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(true);
	}


}
