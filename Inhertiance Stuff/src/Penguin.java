public class Penguin extends Bird {
	public Penguin() {
		name = "penguin";
		food = "fish";
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
		System.out.println("The " + name + " says, \"Burrrrr\"!");
	}
	
	@Override
	public void flies() {
		System.out.println("The " + name + " cannot fly!");
	}
}
