package org.pageexe;

import org.testng.annotations.Test;

public class DataProviderOut {
	
	@Test(dataProvider = "usertestdata", dataProviderClass = DataProviderSample.class)
	public void meth(String UserName, String Pwd, int num) {
		System.out.println(UserName+" "+Pwd+" "+num);
	}
	

}
