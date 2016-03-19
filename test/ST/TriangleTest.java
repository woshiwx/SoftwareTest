package ST;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert .*;

public class TriangleTest {
	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}
	
	@Test
	public void test()
	{
		assertEquals("isosceles", triangle.judge(4,4,5));
		assertEquals("it is not a triangle", triangle.judge(1,1,5));
		assertEquals("equilateral", triangle.judge(4,4,4));
		assertEquals("scalene", triangle.judge(3,4,5));
	}
	
}
