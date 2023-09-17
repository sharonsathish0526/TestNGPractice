package org.pageexe;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CommonFunctionalities {
	
	@Ignore
	@Test(description = "This method will check for Homepage functionality")
	public void method() {
		System.out.println("method");
	}
	
	@Ignore
	@Test(invocationCount = 3)
	public void method1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("method1");
	}
	
	@Ignore
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void method2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("method2");
	}
	
	//----------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------
	
	
	@Test(dependsOnMethods = {"method4","method5"},alwaysRun = true)
	public void method3() throws InterruptedException {
		System.out.println("method3");
	}
	
	
	@Test
	public void method4() throws InterruptedException {
		System.out.println("method4");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void method5() throws InterruptedException {
		System.out.println("method5");
	}

}
