
public class Cow extends Mammal{
	public Cow()
	{
	name = "cow";
	food = "grass";
	}
	
	@Override
	public void bearsYoung()
	{
	System.out.println("Ooo a cute little baby " + name + ".");
	}
	@Override
	public void eats()
	{
	System.out.println("The " + name + " is looking foward to eating some " + food + ".");
	}
	@Override
	public void makesNoise()
	{
	System.out.println("The " + name + " says, \"Moo.\"");
	}
}
