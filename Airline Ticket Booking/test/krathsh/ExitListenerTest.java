package krathsh;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExitListenerTest {

	@Test
	public void testWindowClosingWindowEvent() {
		ExitListener test = new ExitListener();
		
		assertNotNull(test);
	}

}
