package org.pageexe;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {
	
	@Test(dataProvider = "usertestdata")
	public void meth(String UserName, String Pwd, int num) {
		System.out.println(UserName+" "+Pwd+" "+num);
	}
	
	@DataProvider(name = "usertestdata")
	public Object[][] testData(){
		return new Object[][] {{"JungKook","BTSArmy1",1},{"Taehyung","BTSArmy2",2},{"Jimin","BTSArmy3",3}};
	}

}
