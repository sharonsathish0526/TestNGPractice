package org.pageexe;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExcludeIgnore {
	@Ignore
	@Test
	public void method1() {
		System.out.println("method1");
	}
	
	@Test(enabled = false)
	public void method2() {
		System.out.println("method2");
	}
	
	@Test
	public void method3() {
		System.out.println("method3");
	}
	
	@Test
	public void method4() {
		System.out.println("method4");
	}

}
