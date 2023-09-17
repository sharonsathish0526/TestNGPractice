package org.parallela;

import org.testng.annotations.Test;

public class ParallelExe1 {
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2 started");
		Thread.sleep(2000);
		System.out.println("Test2 ended");
	}

}
