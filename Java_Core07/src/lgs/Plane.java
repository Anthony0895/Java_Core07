package lgs;

public abstract class Plane {

	private int length;
	private int heigth;
	private int weigth;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int heigth, int weigth) {
		super();
		this.length = length;
		this.heigth = heigth;
		this.weigth = weigth;
	}

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Takeoff is possible through " + countdown + " seconds! ");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("The plane with full tanks will fly " + distance + " km! ");
	}

	public void landingPlane() {
		System.out.println("I'm landing!");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}

}
