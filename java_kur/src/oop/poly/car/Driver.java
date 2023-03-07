package oop.poly.car;

public class Driver {

	public void drive(Car c)
	{
		c.run();
	}
	
	public Car buyCar(String name)
	{		if(name.equals("소나타"))
			{
				return new Sonata();
				
			}
			else if (name.equals("포르쉐"))
			{
				return new Porsche();			
			}
			else if (name.equals("테슬라") )
			{
				return new Tesla();
				
			}
			else
			{
				System.out.println("뭐달라고~");
				return null;
	
			}
	
	
	}
}           
