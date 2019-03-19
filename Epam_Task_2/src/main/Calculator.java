package main;

public class Calculator {
	public int add(int a, int b)
	{
		return a+b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public float divide(int a,int b)
	{
		float c=0;
		try {
			c=(float)a/b;
		}
		catch(ArithmeticException e) {
			
		}
		return c;
	}
	
}
