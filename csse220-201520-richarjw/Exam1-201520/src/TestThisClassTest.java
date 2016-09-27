import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestThisClassTest {

	@Test
	public void test() {
		assertEquals(5, TestThisClass.getPrice(1,5));
		assertEquals(18, TestThisClass.getPrice(2,10));
		assertEquals(352, TestThisClass.getPrice(4,100));
		assertEquals(0, TestThisClass.getPrice(0,90000));
	}

}
