package Test;

public class constructCostTest {
	@Test
	public void test() 
	{
		constructionCost cost = new constructionCost();
		assertEquals(4800, cost.calculateCost(4, "standard"));
		assertEquals(4500, cost.calculateCost(3, "abovestandard"));
		assertEquals(5400, cost.calculateCost(3, "highstandard"));
	}

}
