package example.CICDExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalTest {

	
	@Test
	void addTest() {
		SimpleCal cal=new SimpleCal();
		assertEquals(13, cal.add(5, 8));
	}
	
	@Test
	void multipyTest() {
		SimpleCal cal=new SimpleCal();
		assertEquals(25, cal.mul(5, 5));
	}
}
