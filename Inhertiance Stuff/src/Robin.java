
public class Robin extends Bird{
	public Robin() {
		name = "robin";
		food = "worms";
	}
	@Override
	public void bearsYoung() {
		System.out.println("Ooo look at the cute little " + name + " egg!");
	}

	@Override
	public void eats() {
		System.out.println("The " + name + " is looking foward to eating some "
				+ food + "!");
	}

	@Override
	public void makesNoise() {
		System.out.println("The " + name + " says, \"Chirp Chrip\"!");
	}
	
	@Override
	public void flies() {
		System.out.println("The " + name + " can also fly!");
	}
}
