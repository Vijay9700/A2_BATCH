package testng_basics;

import org.testng.annotations.Test;

public class Char_2 {
	@Test(priority = 1)
	public void register() {
		System.out.println("registeration completed");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("login completed..");
	}
	@Test(priority = 3)
	public void logout() {
		System.out.println("logout completed");
	}
	

}
