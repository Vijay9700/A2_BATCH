package testng_basics;

import org.testng.annotations.Test;

public class Char_2_2 {
	@Test
	public void register() {
		System.out.println("registeration completed");
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("login completed..");
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout completed");
	}

}
