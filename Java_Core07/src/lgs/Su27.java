package lgs;

public class Su27 extends Plane implements SpecialOpportunities {
	
	int maxSpeed;
	String color;
	public Su27(int length, int heigth, int weigth, int maxSpeed, String color) {
		super(length, heigth, weigth);
		this.maxSpeed = maxSpeed;
		this.color = color;
		
	}
	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Turbo acceleration is running. Airplane speed " + accSpeed + " km / h! ");
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("The plane disappeared from radar on " + unvisibleTime + " seconds! ");
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("The object will be reset " + bombsAmount + " warhead! ");
	}
	

}
