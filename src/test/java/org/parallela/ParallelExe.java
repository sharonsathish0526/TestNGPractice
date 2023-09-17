package org.parallela;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallelExe {
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test1 started");
		Thread.sleep(2000);
		System.out.println("Test1 ended");
	}
	
	@Ignore
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2 started");
		Thread.sleep(2000);
		System.out.println("Test2 ended");
	}
	

}
