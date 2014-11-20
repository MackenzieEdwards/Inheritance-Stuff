
public class Bat extends Mammal{
	public Bat()
	{
	name = "bat";
	food = "insects";
	}

	@Override
	public void bearsYoung()
	{
	System.out.println("Ooo a cute little animal baby!");
	}
	@Override
	public void eats()
	{
	System.out.println("The " + name + " is looking forward to eating some " + food + "!");
	}
	@Override
	public void makesNoise()
	{
	System.out.println("The " + name + "emits an ultrasonic pulse!");
	}
	@Override
	public void flies()
	{
	System.out.println("The " + name + " can also fly!");
	}
}
