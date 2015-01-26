package krathsh;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginPageTest {

	@Test
	public void testLoginPage() {
		LoginPage lg = new LoginPage();
		
		assertNotNull(lg);
	}

	@Test
	public void testMain() {
		LoginPage lg1 = new LoginPage();
		
		assertNotNull(lg1);
	}

}
