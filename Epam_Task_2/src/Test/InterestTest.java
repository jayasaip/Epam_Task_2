package Test;

public class InterestTest {
	@Test
	public void test() {
		InterestCalculation obj =new InterestCalculation();
		assertEquals(100,obj.calculateCompoundInterest(100,2,3,1));
		assertEquals(50,obj.calculateCompoundInterest(50, 4, 9, 2));
		assertEquals(6,obj.calculateSimpleInterest(100, 2, 3));
		assertEquals(3,obj.calculateSimpleInterest(100,3,1));
		assertEquals(1,obj.calculateSimpleInterest(100,1,1));
	}
}
