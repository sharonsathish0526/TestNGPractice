package org.pageexe;

import org.baseutil.BaseClass;
import org.pagerepo.LoginPageRepo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageExe extends BaseClass{

	@Parameters("url")
	@BeforeMethod
	public void beforeClass(String url) {
		driver.get(url);
	}
	
	@Test
	public void test1() {
		
	LoginPageRepo repo = new LoginPageRepo();
	repo.getUsername().sendKeys("JungKook");
	repo.getPassword().sendKeys("army1");
	
	}
	
	@Test
	public void test2() {
		
	LoginPageRepo repo = new LoginPageRepo();
	repo.getUsername().sendKeys("Jimin");
	repo.getPassword().sendKeys("army2");
	
	}

}
