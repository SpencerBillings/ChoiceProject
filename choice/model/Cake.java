package choice.model;

public class Cake 
{
	private int cakeType;
	private double cakeSize;
	private String cakeText;
	
	public Cake(int cakeType, double cakeSize, String cakeText)
	{
		this.cakeType = cakeType;
		this.cakeSize = cakeSize;
		this.cakeText = cakeText;
	}
	
	// Getters
	public int cakeType()
	{
		return cakeType;
	}
	
	public double cakeSize()
	{
		return cakeSize;
	}
	
	public String cakeText()
	{
		return cakeText;
	}
	
	// Setters
	public void cakeType(int typeOfCake)
	{
		this.cakeType = typeOfCake;
	}
	
	public void cakeSize(double sizeOfCake)
	{
		this.cakeSize = sizeOfCake;
	}
	
	public void cakeText(String textOnCake)
	{
		this.cakeText = textOnCake;
	}
	
	// public String toString()
	{
		//String desc
	}
}
